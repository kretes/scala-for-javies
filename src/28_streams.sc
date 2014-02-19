def generateStream(start:Int,step:Int):Stream[Int] = start #:: generateStream(start+step,step);

val oddStream = generateStream(0,2)

oddStream.take(5).force

oddStream.take(10).force.toList


//so fibonacci looks like this



def fibonacciStream(current:Int, next:Int):Stream[Int] = current #:: fibonacciStream(next,current+next)
val fibonacci = fibonacciStream(1,1)

fibonacci.take(20).force

fibonacci(1000) //this is as well possible

