def commonTypeNumbers(really:Boolean) = if (really) 2.0 else 1
commonTypeNumbers(true)
commonTypeNumbers(false)

def commonType(really:Boolean) = if (really) "Hello" else List(1)
val string = commonType(true)
val list = commonType(false)
string.asInstanceOf[String]
list.asInstanceOf[List[Int]]

