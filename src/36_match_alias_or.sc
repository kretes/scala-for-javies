//matching using alias
def matchTuples(value :Any) = value match {
  case a @ (_,1) => "tuple ending with 1 " + a
  case a @ (_ :Int, _:Int) => "tuple of ints"
  case _:Int | _:Long => "it was int or long " + value
}

matchTuples((1,1))
matchTuples((1,2))
matchTuples(1)
matchTuples(2L)

