val a = {println("getA"); 1}


lazy val b = {println("getB"); 1}

a
b





def defaultForTrue= "works"
def defaultForFalse = {println("calculate"); "worksAsWell"}



def getLazy(really:Boolean,ifTrue: => String = defaultForTrue,ifFalse: => String = defaultForFalse) =
  if (really) ifTrue else ifFalse



def getSimple(really:Boolean,ifTrue:String = defaultForTrue,ifFalse:String = defaultForFalse) =
  if (really) ifTrue else ifFalse



getLazy(true)
getSimple(true)



