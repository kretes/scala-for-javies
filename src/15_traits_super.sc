trait A {
  def method = "A"
}

trait B extends Shape{
  override def method = super.method + " B"
}

trait C extends Shape{
  override def method = super.method + " C"
}

class D extends Shape

class E extends Rectangle with C

class F extends C with Rectangle

class G extends Object with Shape with C with Rectangle
(new D).method
(new E).method
(new F).method
(new G).method










