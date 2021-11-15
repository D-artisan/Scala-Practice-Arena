package RockTheJVM

object Loops{

val result: Unit = (1 to 10).foreach(_ => println("Loop through this!"))

val thisList: List[Int] = List(1,2,3,4)
val myList: List[Int] = List(1,2,3).map(x => x + 1)
val myList2: Seq[Int] = List(1,2,3).flatMap(x => Seq.fill(x)(1))
val filteredList: List[Int] = thisList.filter(x => x % 2 == 0)

// for comprehensions are expressions
val myforExpression: Seq[(Int, Int)] =  for {
  x <- List(1,2,3)
  y <- List(4,5,6)
} yield (x,y)

  def main(args: Array[String]): Unit = {
    println(result)
    println(myList)
    println(myList2)
    println(filteredList)
    println(myforExpression)
  }

}
