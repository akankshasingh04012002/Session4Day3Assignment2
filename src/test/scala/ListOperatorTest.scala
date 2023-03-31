
import org.scalatest.flatspec.AnyFlatSpec

class ListOperatorTest extends AnyFlatSpec {
  val operator = new ListOperator

  "equals method" should "return true for equal lists" in {
    assert(operator.equals(List(1, 2, 3), List(1, 2, 3)))
  }

  "== method" should "return true for equal lists" in {
    assert(operator.==(List(1, 2, 3), List(1, 2, 3)))
  }

  it should "return false for unequal lists" in {
    assert(operator.==(List(1, 2, 3), List(4, 5, 6)))
  }

  "!= method" should "return true for unequal lists" in {
    assert(operator.!=(List(1, 2, 3), List(4, 5, 6)))
  }

  it should "return false for equal lists" in {
    assert(operator.!=(List(1, 2, 3), List(1, 2, 3)))
  }

  "ne method" should "return true for different lists" in {
    assert(operator.ne(List(1, 2, 3), List(4, 5, 6)))
  }

  it should "return false for same lists" in {
    val lst = List(1, 2, 3)
    assert(operator.ne(lst, lst))
  }

  "eq method" should "return true for same lists" in {
    val lst = List(1, 2, 3)
    assert(operator.eq(lst, lst))
  }

  it should "return false for different lists" in {
    assert(operator.eq(List(1, 2, 3), List(4, 5, 6)))
  }
}
