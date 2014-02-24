class Container[T](val contained:T)

val container1 = new Container("string")       //scala compiler will infere this type

val contained1 = container1.contained

val container2 = new Container(123)
//compiler error
//val container3 = new Container[Int](1L)









