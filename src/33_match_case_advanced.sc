def matchWithType(value :Any) = value match {
  case intValue: Int => "was an int " + intValue
  case dblValue: Double => "was an double " + dblValue
  case number: Number => "was some number " + number
  case stringValue: String => "was an string " + stringValue + " of length " + stringValue.length
  case _ => "unknown"
}


matchWithType(1)
matchWithType(1.5d)
matchWithType(2.0f)
matchWithType("hey")
matchWithType(List)

trait A {def a = "a"}
trait B {def b = "b"}

def matchTwoTypes(value: Any) = value match {
  case ab : A with B => "got ab that said " + ab.a + " and " +ab.b
  case a : A => "got a that said " + a.a
  case b : B => "got b that said " + b.b
}

matchTwoTypes(new A with B)
matchTwoTypes(new A{})
matchTwoTypes(new B{})

