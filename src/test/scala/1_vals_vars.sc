//values are immutable:
val immutable:Int = 1
//immutable = 2//this does not compile
//type can be infered
val implicitlyTyped = 1
//variables are mutable
var variable=1
variable = 2

//everything is an expression
val result = if (variable == 2) 3 else 4