package example

object Main {
  def main(args: Array[String]): Unit = {
//    val p1 = new Point(1,2)
//    val p2 = new Point(3,4)
//    println(p1.distance(p2))
//
//    val newPoint = p1.+(p2)
//    val newPoint2 = p1 + p2
//    println(newPoint.x, newPoint.y)
//    println(newPoint2.x, newPoint2.y)

    val p1 = new Point2D(1, 2)
    val p2 = new Point2D(3, 4)
    val p3 = new Point2D(0, 0)
    val triangle = new TriangleArea(p1, p2, p3)
    println(triangle.area())

    val p4 = new Point2D(5, 7)
    val p5 = new Point2D(3, 4)
    val p6 = new Point2D(1, 2)
    val triangle2 = new TriangleArea(p4, p5, p6)
    println(triangle2.area())
  }
}
