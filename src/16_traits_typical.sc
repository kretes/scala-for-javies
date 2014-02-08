trait A {
  def method:String
}

trait B extends A {
  override def method = "B"
}

trait C extends A {
  def method = "C"
}
class E extends A with C
class F extends A with B
class G extends Object with B
(new E).method
(new F).method
(new G).method


