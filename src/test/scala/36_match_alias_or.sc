//matching using alias and 'or'
def matchTuples(value :Any) = value match {
  case a @ (_,1) => "tuple ending with 1 " + a
  case a @ (_ :Int, _:Int) => "tuple of ints"
  case _:Int | _:Long => "it was int or long " + value
}

matchTuples((1,1))
matchTuples((1,2))
matchTuples(1)
matchTuples(2L)


def matchIf(value : Any) = value match {
  case string:String if string.startsWith("K") => "K-string"
  case string:String if string.length > 5 => "longer than 5"
  case _:String => "some string"
}

matchIf("abcdef")
matchIf("K0001")
matchIf("hi")
def matchRegex(value: String) = {
  val startsWithK = "K(.*)".r
  val longerThan6 = ".{6}(.*)".r
  value match {
    case startsWithK(_) => "K-string"
    case longerThan6(_) => "longer than 5"
  }
}
matchRegex("K001")
matchRegex("abcdef")


