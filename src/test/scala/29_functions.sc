//partial functions

val helloSomeone = (hello:String,toWhom:String) => s"$hello $toWhom"


val helloTomek: (String) => String = helloSomeone(_,"Tomek")
//unfortunately no type inference here: :<
//val helloTomekInfered = helloSomeone(_,"Tomek")
//only possible inference:
val helloTomek2 = helloSomeone(_:String,"Tomek")

val hiSomeone: (String) => String = helloSomeone("Hi",_)
helloSomeone("hi","world")
helloTomek("Witaj")
helloTomek2("Witaj")

hiSomeone("Tomek")

