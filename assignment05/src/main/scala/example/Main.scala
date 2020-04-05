package example

object Main {
  def main(args: Array[String]): Unit = {
//    val p1: Point = Point(10, 10)
//    println(p1.toString)

    val p1 = Point(1, 2)
    val p2 = p1.copy(x = 10)
    println(p1)
    println(p2)
  }
}
