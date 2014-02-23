//method can have multiple parameter list
def connect(host:String)(port:Int)(resource:String) = println(s"connecting to $host:$port/$resource")
connect("localhost")(80)("rest")

//this can be combined with varargs!
def iCantDecideHowMany(hellos: String*)(names: String*) = {
  (for (hello <- hellos; name <- names) yield s"$hello $name").mkString("\n")
}
iCantDecideHowMany("hello")("Poland")
iCantDecideHowMany("hello","Cześć")("Poland")






iCantDecideHowMany("hello","Cześć","Zdrastwujcie")("Poland","Belarus","World")


















//you can "unpack" a collection to a varargs call by `_*`
val hellos: Seq[String] = Seq("hi","czesc")
iCantDecideHowMany(hellos: _*)("you") //exploding sequence to varargs
//iCantDecideHowMany(hellos)("you") //not compile





