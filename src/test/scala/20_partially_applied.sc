//function with multiple param list 

def myNameIs(name:String)(howMany:Int):String = {
  if (howMany == 1) name else name + " " + myNameIs(name)(howMany-1)
}

myNameIs("bond")(3)

//this function can be partially applied, i.e. only first param list may be provided, with '_' at the end
//this returns a function with first param resolved, but other not
def callMeBond = myNameIs("bond")_
def callMeJames = myNameIs("James")_
callMeBond(4)
callMeJames(5)




