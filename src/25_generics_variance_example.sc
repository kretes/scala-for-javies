class Producer[T](val produce:T) {

}

class Consumer[T] {
  def consume(t:T) = Nil
}


class A
class B extends A

val producer: Producer[A] = new Producer(new A)

val consumer = new Consumer[A]()

consumer.consume(producer.produce)