//in Scala you can import from objects
//given
class Welcome { def hi = "hi"}
val welcome = new Welcome()
//when
import welcome.hi
//then
hi
//import with aliases
import scala.math.BigDecimal
import java.math.{BigDecimal=>JBigDecimal}

BigDecimal(12)
new JBigDecimal("1.5")
//import is scoped and can be at any position
object Welcome {
  def say = "Welcome"
}
object Hi {
  def say = "Hi"
}

{
  import Hi._
  say
}
{
  import Welcome._
  say
}



