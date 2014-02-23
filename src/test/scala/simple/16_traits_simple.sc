trait A {
  def method = "method"
}

trait B {
  def anotherMethod = "anotherMethod"
}

class Compound extends A with B  //this class will get both methods with implementations

val compound: Compound = new Compound
compound.method
compound.anotherMethod
