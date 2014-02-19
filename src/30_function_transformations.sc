
val repeatFunction = (text:String,count:Int) => {
  1.to(count).map((idx) => text).mkString("")+"!"
}

repeatFunction("hi",2)

val repeatCurried: (String) => (Int) => String = repeatFunction.curried
repeatCurried("hi")(3)
val tupled: ((String, Int)) => String = repeatFunction.tupled
tupled(("hi"),3)

val uncurriedRepeat: (String, Int) => String = Function.uncurried(repeatCurried)

uncurriedRepeat("hello",2)

//composing

val double = (text:String) => text+text
val question = (text:String) => text+"?"

val composed: (String) => String = double compose question
composed("hello")

val andThened: (String) => String = double andThen question
andThened("hello")


