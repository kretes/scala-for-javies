def defaultForTrue= "works"
def defaultForFalse = throw new Exception



def getLazy(really:Boolean,ifTrue: => AnyRef = defaultForTrue,ifFalse: => AnyRef = defaultForFalse) =
  if (really) ifTrue else ifFalse



def getSimple(really:Boolean,ifTrue:AnyRef = defaultForTrue,ifFalse:AnyRef = defaultForFalse) =
  if (really) ifTrue else ifFalse



getLazy(true)
getSimple(true)