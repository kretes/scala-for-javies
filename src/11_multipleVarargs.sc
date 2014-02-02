
def iCantDecideHowMany(hellos: String*)(names: String*) = {
  (for (hello <- hellos; name <- names) yield s"$hello $name").mkString("\n")
}
iCantDecideHowMany("hello")("Poland")
iCantDecideHowMany("hello","Cześć")("Poland")


iCantDecideHowMany("hello","Cześć","Zdrastwujcie")("Poland","Belarus","World")