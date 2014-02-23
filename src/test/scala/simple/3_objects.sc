
//this is a singleton
//there are no 'static' in Scala
object anObject {

  def doA = false

}

class aClass {

  def doA = true

}

anObject.doA

new aClass().doA