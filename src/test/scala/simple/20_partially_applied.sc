//function with multiple param list 

def myNameIs(name:String)(howMany:Int):String = {
  if (howMany == 1) name else name + " " + myNameIs(name)(howMany-1)
}

myNameIs("bond")(3)

//this function can be partially applied, i.e. only first param list may be provided, with '_' at the end
//this returns a function with first param resolved, but other not
def callMeBond = myNameIs("bond")_
def callMeJames = myNameIs("James")_
callMeBond(4)
callMeJames(5)


//function with multiple parameters
val helloSomeone = (hello:String,toWhom:String) => s"$hello $toWhom"
helloSomeone("hi","world")

val helloTomek = helloSomeone(_:String,"Tomek")
helloTomek("Witaj")

//now you can inline a partially applied function and pass them around
Seq("Hello").map(helloSomeone(_,"Tomek"))
Seq("Tomek").map(helloSomeone("Hello",_))

