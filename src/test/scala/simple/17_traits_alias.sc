//this is an example of how traits can be built one upon another


// I have a trait for name
trait WithName {
  def name:String
}

// I have a trait for greeting that is depending on implementor be 'WithName'
trait PersonGreeting { withName: WithName =>
  def greet = s"Hello ${withName.name}"
}

// I have a class having 'withname' trait
class Person(val name: String) extends WithName
// I can create a class with a persongreeting trait
val me = new Person("Tomek") with PersonGreeting
me.greet



