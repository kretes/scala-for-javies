trait A {
  def method = "A"
}

trait B extends A{
  override def method = super.method + " B"
}

trait C extends A{
  override def method = super.method + " C"
}

class D extends A

class E extends B with C

class F extends C with B

class G extends Object with A with C with B
(new D).method
(new E).method
(new F).method
(new G).method










