//TODO this needs some explanation about which class will be chosen as 'super' in each example
trait Shape {
  def method = "A"
}

trait Rectangle extends A{
  override def method = super.method + " B"
}

trait C extends A{
  override def method = super.method + " C"
}

class D extends A

class E extends Rectangle with C

class F extends C with Rectangle

class G extends A with C with Rectangle
(new D).method
(new WillHaveImplemntationB).method
(new F).method
(new G).method










