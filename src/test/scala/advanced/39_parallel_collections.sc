import scala.collection.GenSeq

val seq=(1 to 1000000).toList


//every sequence has its 'parallel' version that will execute operations in parallel
val par=seq.par



def longMethod(value:Int):Int = value

def benchmark(sequence:GenSeq[Int]) = {
  val before: Long = System.currentTimeMillis()
  sequence.map(longMethod).sum
  println(System.currentTimeMillis() - before)
}

benchmark(seq)


benchmark(par)



