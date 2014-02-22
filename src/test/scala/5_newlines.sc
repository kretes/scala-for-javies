def pow1(x:Int) = if (x<0) 0 else x + x
def pow2(x:Int) = {
  if (x<0) x else x + x
}
def pow3(x:Int) = {
  if (x<0) true else x
  + x
}


pow1(1)
pow2(1)
pow3(1)

