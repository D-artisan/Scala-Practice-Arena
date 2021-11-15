package RockTheJVM

object Tutorial {

  val anAbsentInt: Option[Int] = None
  val aPresentInt: Option[Int] = Some(42)
  println(anAbsentInt.isEmpty)
  println(aPresentInt.isEmpty)

  def main(args: Array[String]): Unit = {

  }

}
