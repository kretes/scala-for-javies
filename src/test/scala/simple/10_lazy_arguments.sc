// will be printed when a is declared
val a = {println("getA"); 1}


//will be printed the first time b gets evaluated
lazy val b = {println("getB"); 1}

a
//not `getB` will be printed as this needs evaluation of 'b'
b
//will not be printed again, as lazy values are memoized
b





//similiar thing for method parameters

def defaultForTrue= "works"
def defaultForFalse = {println("calculate"); "worksAsWell"}



//parameters are declared with '=>', which means they are passed by name not by value
//and they are evaluated only when needed
def getLazy(really:Boolean,ifTrue: => String = defaultForTrue,ifFalse: => String = defaultForFalse) =
  if (really) ifTrue else ifFalse



def getSimple(really:Boolean,ifTrue:String = defaultForTrue,ifFalse:String = defaultForFalse) =
  if (really) ifTrue else ifFalse



getLazy(true)
getSimple(true)



//taken from some project
//JAVA:
//if(skills == null) {
//  skills = skillService.fetchSkillsFor(phoneExtension);
//}
//return skills;

//will be in Scala:
//lazy val skills = skillService.fetchSkillsFor(phoneExtension)



