import org.scalatest.flatspec.AnyFlatSpec

class StackTest extends AnyFlatSpec {

  val stack = new Stack()

  "If you push an element 7, then the method " should " push 6 into the stack and return the list" in {
    assert(stack.push(7) === List(7))
  }
  "If you use the pop method then, it " should " pop the last entered element from the stack and return the list" in {
    stack.push(3)
    stack.push(3)
    assert(stack.pop === List(3))
  }
  "If the top method, then it " should " return the top element from the stack." in {
    stack.push(5)
    stack.push(8)
    assert(stack.top === 8)
  }

}
