package advanced

object Companion {
  def apply(value:String) = new Companion(value)
}
class Companion(value:String) {
  def doFromClass = value
}
