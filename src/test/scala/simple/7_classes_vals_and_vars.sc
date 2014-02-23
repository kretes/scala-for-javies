class HelloGet {
  val hello = "Hello"
}

val h = new HelloGet
h.hello // implicit getter for value


class HelloSet {
  var hello = "hello"
}

val helloSet: HelloSet = new HelloSet()
helloSet.hello
helloSet.hello_=("cześć") //implicit setter for variable
helloSet.hello