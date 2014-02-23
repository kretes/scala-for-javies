//this is a reference to something implementing ObjectInterface
//it can be a singleton object
var objectInterface:ObjectInterface = AnObject
objectInterface.staticMethod

//or we can pass some other object
objectInterface = new ObjectInterface {
  override def staticMethod: String = "overriden"
}
objectInterface.staticMethod

