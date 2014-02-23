abstract class Person(val name: String)
class Man(name: String) extends Person(name)
class Woman(name: String) extends Person(name)
class Greeting[T <: Person](greeting: String) {
  def greet(person: T) = println(greeting+" "+person.name+"!")
}


val greetAny = new Greeting[Person]("any")

greetAny.greet(new Man("man"))
greetAny.greet(new Woman("woman"))

val greetMan = new Greeting[Man]("hello man ")

greetMan.greet(new Man("man"))
greetMan.greet(new Woman("woman"))










