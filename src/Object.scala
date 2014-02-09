trait ObjectInterface {
  def staticMethod:String
}
object AnObject extends ObjectInterface {
  override def staticMethod = "static result"
}