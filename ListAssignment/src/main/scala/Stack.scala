

class Stack(private var elements: List[Any] = List.empty[Any]) {

  def push(values: Any): List[Any] = {
    elements = values :: elements
    elements
  }

  def pop(): Any = {
    if (elements.isEmpty) {
      throw new IllegalStateException("Empty Stack")
    } else {
      val popped = elements.head
      elements = elements.tail
      popped
    }
  }

  def top: Any = {
    if (elements.isEmpty) {
      throw new NoSuchElementException("Empty Stack")
    } else elements.head
  }


  def isEmpty: Boolean = elements.isEmpty

  def size: Int = elements.length

  override def toString: String = elements.toString()
}

object Stack extends App {
  val stack = new Stack()
  stack.push(2)
  stack.push(3)
  stack.push(5)
  stack.push(6)
  stack.push(7)
  println(stack)
  stack.pop()
  println(stack)
}

