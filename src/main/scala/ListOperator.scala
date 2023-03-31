import scala.util.Try

class ListOperator {

  Try {
    //methods that takes two lists of type T and returns a boolean
    def equals[T](firstList: List[T], secondList: List[T]): Boolean = {
      firstList.equals(secondList)
    }

    def ==[T](firstList: List[T], secondList: List[T]): Boolean = {
      firstList == secondList
    }

    def !=[T](firstList: List[T], secondList: List[T]): Boolean = {
      firstList != secondList
    }

    def ne[T](firstList: List[T], secondList: List[T]): Boolean = {
      firstList.ne(secondList)
    }

    def eq[T](firstList: List[T], secondList: List[T]): Boolean = {
      firstList.eq(secondList)
    }
  }
}
