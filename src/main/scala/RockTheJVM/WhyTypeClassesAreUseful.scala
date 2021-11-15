package RockTheJVM

object WhyTypeClassesAreUseful {



  // implicits
  trait Summable[T] {
    def sumElements(list: List[T]): T
  }

  implicit object IntSummable extends Summable[Int] {
    override def sumElements(list: List[Int]): Int = list.sum
  }

  implicit object StringSummable extends Summable[String] {
    override def sumElements(list: List[String]): String = list.mkString("")
  }


  def processMyList[T](list: List[T])(implicit summable: Summable[T]): T = {
    // "Sum up" all the elements of the list
    // specialized implementations: for integers => sum = actual sum of elements

    summable.sumElements(list)
  }

  def main(args: Array[String]): Unit = {
    val intSum = processMyList(List(1,2,3))
    val stringSum = processMyList(List("I", " will", " pass", " my", " exams!"))


    println(intSum)
    println(stringSum)
  }
}
