def callMe(how:String)(howMany:Int):String = {
  if (howMany ==0) how else how + " " + callMe(how)(howMany-1)
}

callMe("bond")(1)

callMe("bond")(3)


def callMeBond = callMe("bond")_
def callMeJames = callMe("James")_
callMeBond(4)
callMeJames(5)




