class EmailValue(val email:String) extends AnyVal {
  def isValid = email.contains("@")
}
new EmailValue("me")
new EmailValue("me@srv.com")
new EmailValue("me").isValid
new EmailValue("me@srv.com").isValid
val email = new EmailValue("me@srv.com")
val string = "some@email.com"

val stringFrom:String = email.email
val emailFrom:EmailValue = new EmailValue(string)