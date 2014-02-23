//composing

val duplicate = (text:String) => text+text
val question = (text:String) => text+"?"

//having two functions each String => String I can combine them easily into new function:

//compose will call functions in reversed order
val composed: (String) => String = duplicate compose question
composed("hello")

//and then will execute functions in given order
val andThened: (String) => String = duplicate andThen question
andThened("hello")


