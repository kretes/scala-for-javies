//simple method definition - only params need types, result type is infered where possible
//no need to use 'return' statement - last expression is the result
def sum(x:Int, y:Int) = x + y
sum(1,2)

def isNegative(x:Int) = if (x<0) true else false
isNegative(-1)


def loopForever1:Unit = while(true){}
def hello3(name: String) = {
  def hello_! = println("Hello "+name+"!")
  hello_!
  hello_!
  hello_!
}
hello3("All")


