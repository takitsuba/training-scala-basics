package example

class Point(val x: Int, val y: Int) {
  def distance(that: Point): Double = {
    val xdiff = math.abs(this.x - that.x)
    val ydiff = math.abs(this.y - that.y)
    math.sqrt(xdiff * xdiff + ydiff * ydiff)
  }

  def +(that: Point): Point =
    new Point(x + that.x, y + that.y)
}
