//there can be no new line
def pow1(x:Int) = if (x<0) 0 else x + x

//there can be a lot of new lines if the compiler will know to look-ahead
def pow2(x:Int) = {
  if (x<0) 0
  else
    x + x
}
//but one must take care of putting a newline inside an expression!
def pow3(x:Int) = {
  if (x<0) 0 else x
  + x
}
pow1(1)
pow2(1)
pow3(1)

