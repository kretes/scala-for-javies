package katas

import org.scalatest.{Matchers, FreeSpec}
import katas.FizzBuzz.fizzBuzz

class FizzBuzzSpec extends FreeSpec with Matchers {

  "FizzBuzz" - {
    "should be a number" - {
      "for 1 and 2" in {
        fizzBuzz(1) should equal ("1")
        fizzBuzz(2) should equal ("2")
      }
    }
    "should be fizz " - {
      "for 3" in {
        fizzBuzz(3) should equal ("fizz")
      }
      "for 6" in {
        fizzBuzz(6) should equal ("fizz")
      }
      "for 13" in {
        fizzBuzz(13) should equal ("fizz")
      }
    }
    "should be buzz " - {
      "for 5" in {
        fizzBuzz(5) should equal ("buzz")
      }
      "for 10" in {
        fizzBuzz(10) should equal ("buzz")
      }
      "for 52" in {
        fizzBuzz(52) should equal ("buzz")
      }
    }
    "should be fizzbuzz " - {
      "for 15" in {
        fizzBuzz(15) should equal ("fizzbuzz")
      }
      "for 53" in {
        fizzBuzz(53) should equal ("fizzbuzz")
      }
    }
  }


}
