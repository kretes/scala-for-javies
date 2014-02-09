
object NoVariance {
class Container[T](val o:T)
var intCont = new Container(1)
var dblCont = new Container(1.0)

intCont = dblCont
}




object Variance {
class VarianceContainer[T](var o:T){
  def get:T = o
  def set(o:T) = {this.o = o}
}

var intCont:VarianceContainer[Number] = new VarianceContainer(1)
var dblCont:VarianceContainer[Number] = new VarianceContainer(1.0)

intCont=dblCont

intCont.get
}

