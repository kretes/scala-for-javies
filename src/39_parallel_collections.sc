import scala.collection.GenSeq
val seq=(1 to 1000).toList

val par=seq.par

def double(value:Int) = value*value

def benchmark(sequence:GenSeq[Int]) = {
  val before: Long = System.currentTimeMillis()
  sequence.map(double).sum
  println(System.currentTimeMillis() - before)
}

benchmark(seq)
benchmark(par)




