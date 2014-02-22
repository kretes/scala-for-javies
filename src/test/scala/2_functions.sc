def sum(x:Int, y:Int) = x + y
sum(1,2)

def isNegative(x:Int) = if (x<0) true else false
isNegative(-1)

def commonTypeNumbers(really:Boolean) = if (really) 2.0 else 1
commonTypeNumbers(true)
commonTypeNumbers(false)
def commonType(really:Boolean) = if (really) "Hello" else List(1)
val string = commonType(true)
val list = commonType(false)
string.asInstanceOf[String]
list.asInstanceOf[List[Int]]










def loopForever1:Unit = while(true){}
def hello3(name: String) = {
  def hello_! = println("Hello "+name+"!")
  hello_!
  hello_!
  hello_!
}
hello3("All")


def paramless = println("this is important")
paramless
def takeAndCall(u:Unit) = u
takeAndCall(paramless)

