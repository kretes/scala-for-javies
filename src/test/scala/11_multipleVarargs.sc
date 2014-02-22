
def iCantDecideHowMany(hellos: String*)(names: String*) = {
  (for (hello <- hellos; name <- names) yield s"$hello $name").mkString("\n")
}
iCantDecideHowMany("hello")("Poland")
iCantDecideHowMany("hello","Cześć")("Poland")




iCantDecideHowMany("hello","Cześć","Zdrastwujcie")("Poland","Belarus","World")










val hellos: Seq[String] = Seq("hi","czesc")
//iCantDecideHowMany(hellos)("you") //not compile
iCantDecideHowMany(hellos: _*)("you") //exploding sequence to varargs



