AnObject.staticMethod

class Using(val companion:ObjectInterface) {
  def callStaticMethods = companion.staticMethod
}
new Using(AnObject).callStaticMethods

new Using(new ObjectInterface {
  override def staticMethod: String = "overriden"
}).callStaticMethods

