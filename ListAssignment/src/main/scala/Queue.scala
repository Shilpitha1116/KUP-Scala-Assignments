import scala.collection.mutable
import scala.util.{Failure, Success, Try}

class Queue(var elements:List[Any]=List.empty[Any]) {
  def enqueue(values : Any):List[Any] ={
    elements= values :: elements
    elements
  }
  def dequeue():Any = {
    if (elements.isEmpty) {
      throw new IllegalStateException("Empty Stack")
    } else {
      val dequeued = elements.tail
      elements = elements.tail
      dequeued
    }
  }

  def front: Any = elements.last
  def rear : Any = elements.head

    def isEmpty: Boolean = elements.isEmpty

    def size: Int = elements.length

  override def toString: String = elements.toString()



  }

object Queue extends App{
  val queue = new Queue()
  queue.enqueue(1)
  queue.enqueue(3)
  queue.enqueue(4)
  queue.enqueue(7)
  println(queue)
  queue.dequeue()
  println(queue)
  println(queue.front)
  println(queue.rear)

}

