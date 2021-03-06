//this class defines default values
class ScalaBean(name:String = "Jan",surname:String = "Kowalski") {
  val full = name + " " + surname
}

new ScalaBean("John","Doe").full
new ScalaBean("John").full
new ScalaBean(surname = "Doe").full



def full(name:String = "Jan",surname:String = "Kowalski") = name + " " + surname

full("John","Doe")
full("John")
//named-parameters, with other parameters having default values
full(surname = "Doe")
full("Jan",surname = "Doe")
