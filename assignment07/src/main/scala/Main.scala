object Main {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn._
    val in = readLine("Type Either a string or an Int: \n")
    val result: Either[String, Int] =
      try Right(in.toInt)
      catch {
        case e: NumberFormatException => Left(in)
      }

    result match {
      case Right(x) =>
        println(s"You passed me the Int: $x, which I will increment. $x + 1 = ${x + 1}")
      case Left(x) =>
        println(s"You passed me the String: $x")
    }
  }
}
