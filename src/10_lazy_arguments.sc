val a = {println("getA"); 1}

lazy val b = {println("getB"); 1}

a
b




def defaultForTrue= "works"
def defaultForFalse = {println("calculate"); "worksAsWell"}



def getLazy(really:Boolean,ifTrue: => AnyRef = defaultForTrue,ifFalse: => AnyRef = defaultForFalse) =
  if (really) ifTrue else ifFalse



def getSimple(really:Boolean,ifTrue:AnyRef = defaultForTrue,ifFalse:AnyRef = defaultForFalse) =
  if (really) ifTrue else ifFalse



getLazy(true)
getSimple(true)


