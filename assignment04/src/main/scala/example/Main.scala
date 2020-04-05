package example

object Main {
  def main(args: Array[String]): Unit = {
//    (new Triangle).draw()
//    (new Rectangle).draw()
//    (new UnknownShape).draw()
//
//    val triangle = new Triangle
//    triangle.draw()

    val cat = new Cat
    cat.run()

    val athlete = new OlympicAthlete
    athlete.run()
  }
}
