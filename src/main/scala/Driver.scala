import scala.util.{Try, Success, Failure}

object Driver extends App {

  val firstList = List(1, 2, 3)
  val secondList = List(1, 4, 3)
  private val thirdList = firstList

  private val operator = new ListOperator

  // Try to handle exceptions that might be thrown
  private val result = Try {
    operator.equals(firstList, secondList)
  }
  result match {
    case Success(result) => println(s"Result: $result")
    case Failure(exception) => println(s"Failed with exception occurred: ${exception.getMessage}")
  }

  println(s"Using 'eq' for firstList and secondList: ${firstList eq secondList}")
  println(s"Using 'eq' for firstList and thirdList: ${firstList eq thirdList}")
  println(s"Using '==' for firstList and secondList: ${firstList == secondList}")
  println(s"Using '==' for firstList and thirdList: ${firstList == thirdList}")
  println(s"Using 'equals' for firstList and secondList: ${firstList.equals(secondList)}")
  println(s"Using 'equals' for firstList and thirdList: ${firstList equals thirdList}")
  println(s"Using 'ne' for firstList and secondList: ${firstList ne secondList}")
  println(s"Using 'ne' for firstList and thirdList: ${firstList ne thirdList}")
  println(s"Using '!=' for firstList and secondList: ${firstList != secondList}")
  println(s"Using '!=' for firstList and thirdList: ${firstList != thirdList}")

}
