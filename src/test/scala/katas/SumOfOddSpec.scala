package katas

import org.scalatest.{Matchers, FreeSpec}

class SumOfOddSpec extends FreeSpec with Matchers {

  "Sum of odd elements" - {
    "should be 0" - {
      "for empty sequence" in {
        SumOfOdd.sumOfOdd(Seq()) should equal (0)
      }
      "for sequence of even elements" in {
        SumOfOdd.sumOfOdd(Seq(2,4,6,8,10)) should be (0)
      }
    }
    "should be calculated" - {
      "for single odd element" in {
        SumOfOdd.sumOfOdd(Seq(1)) should be (1)
      }
      "for odd and even element" in {
        SumOfOdd.sumOfOdd(Seq(2,3)) should be (3)
      }
      "for multiple odd and even elements" in {
        SumOfOdd.sumOfOdd(Seq(1,2,3,5,7,4,6)) should be (16)
      }
    }
  }

}
