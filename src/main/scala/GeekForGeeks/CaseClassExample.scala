package GeekForGeeks

object CaseClassExample {

  case class employee (name: String, age: Int)

  case class Book (name: String, author: String)

  case class Student (name: String, grade: Int)





  def main(args: Array[String]): Unit = {
        val c = employee("Daniel", 28)
        println(s"Name of Employee is ${c.name}")
        println(s"Age of Employee is ${c.age}")

        println("")

        val Book1 = Book("A voice in the wind", "Francine Rivers")
        val Book2 = Book("Purpose Driven Life", "Rick Warren")

        println(s"First Book: ${Book1.name}")
        println(s"Author: ${Book1.author}")

        println("")
        println(s"Second Book: ${Book2.name}")
        println(s"Athor: ${Book2.author}")


        val student1 = Student("Joshua", 1000)
        val student2 = student1.copy(grade = 500)
        val student3 = student1.copy(name = "Alberta")

        println(s"$student1")
        println(s"$student2")
        println(s"$student3")



























  }

}
