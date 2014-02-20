def matchTuple(value :Any) = value match {
  case triple: (_,_,_) => "triple " + triple
  case (x:Int,y:Int) => "ints " + x + " and " + y
  case (x:Int,_) => "int with someone " + x
  case pair: (_,_) => "pair " + pair
}
matchTuple(("1","2"))
matchTuple((1,"2"))
matchTuple((1,2))
matchTuple((1,2,3))