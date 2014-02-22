class Producer[+T](val produce:T) {

}

class Consumer[-T] {
  def consume(t:T) = 'Symbol
}
class Shape
class Rectangle extends Shape
class Square extends Rectangle

def doCycle(producer: Producer[Shape], consumer: Consumer[Shape]) = {
  consumer.consume(producer.produce)
}
val shapeProducer: Producer[Shape] = new Producer(new Shape)
val shapeConsumer = new Consumer[Shape]
val rectangleProducer = new Producer(new Rectangle)
val rectangleConsumer = new Consumer[Rectangle]
val squareProducer = new Producer(new Square)
val squareConsumer = new Consumer[Square]
val everythingConsumer = new Consumer[AnyRef]

doCycle(shapeProducer,shapeConsumer)
doCycle(rectangleProducer,shapeConsumer)
doCycle(rectangleProducer,everythingConsumer)

