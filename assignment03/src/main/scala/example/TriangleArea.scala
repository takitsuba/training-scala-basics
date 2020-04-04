package example

class TriangleArea(p1: Point2D, p2: Point2D, p3: Point2D) {
  def area(): Double = {
    math.abs((p1.x - p3.x) * (p2.y - p3.y) - (p2.x - p3.x) * (p1.y - p3.y)) / 2
  }
}
