//adding extends AnyVal will make the class be unwrapped in bytecode to plain 'String'
object EmailValueWrapper {
  implicit def asString(s: EmailValue) = s.email
  implicit class EmailValue(val email:String) extends AnyVal {
    def isValid = email.contains("@")
  }
}

import EmailValueWrapper._
new EmailValue("me").isValid
new EmailValue("me@srv.com").isValid
val email = new EmailValue("me@srv.com")
// with `implicit` keyword you get automaticall wrapping of strings into EmailValue when you need it
val emailValue:EmailValue = "wrap me"


//and for the other way around I need to provide an implicit conversion method
val stringValue:String = new EmailValue("unwrap me")
val string = "some@email.com"
val stringFrom:String = email.email
val emailFrom:EmailValue = new EmailValue(string)
//that's why value class must have only one val param in constructor, and this will not compile:
class InvalidValClass(val email:String, val name:String) extends AnyVal {
  def isValid = email.contains("@")
}

















