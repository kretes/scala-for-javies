def simpleMatch(value: Int):String =
  value match {
    case 1 => "one"
    case 2 => "two"
  }

simpleMatch(1)
simpleMatch(2)
// not found will throw matcherror
//simpleMatch(3)
object abc
object ABC
def constPattern(value: Any):String =
  value match {
    case "abc" => "string abc"
    case `abc` => "object abc"//match to
    case ABC   => "object ABC"
    case 'abc  => "symbol abc"
    case 'a'   => "Char a"
    case abc => "sth that we name abc:"+abc
  }
constPattern("abc")
constPattern(abc)
constPattern(ABC)
constPattern('abc)
constPattern('a')
constPattern("unknown object")
def defaultMatch(value: Any) = value match {
    case "a" => "string a"
    case _ => "something else"
}
defaultMatch("a")
defaultMatch("ab")









