import org.scalatest.flatspec.AnyFlatSpec

class QueueTest extends AnyFlatSpec {

  val queue = new Queue()
"If you provide 4, then the method " should "push List(4) into the queue" in {
  assert(queue.enqueue(4) === List(4))
}

"If you provide List(1,2,3), then the method " should "push List(1,2,3) into the queue" in {
  assert(queue.enqueue(List(1,2,3)) === List(List(1,2,3)))
}

"If you call the dequeue method, it " should "remove the first entered element from the queue and return the remaining queue" in {
  queue.enqueue(1)
  queue.enqueue(5)
  queue.enqueue(2)
  assert(queue.dequeue === List(2,5))
}

"If you call the front method, it " should "return the first entered element in the queue." in {
  queue.enqueue(1)
  queue.enqueue(5)
  queue.enqueue(2)
  assert(queue.front === 1)
}
"If you call the rear method, it " should "return the last entered element in the queue." in {
  queue.enqueue(1)
  queue.enqueue(5)
  queue.enqueue(2)
  assert(queue.rear === 2)

}
}