trait A {
  def method:String
}

trait B extends Shape {
  override def method = "B"
}

trait C extends Shape {
  def method = "C"
}
class E extends Shape with C
class F extends Shape with Rectangle
class G extends Object with Rectangle
(new E).method
(new F).method
(new G).method


