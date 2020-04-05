object Main {
//    throw new RuntimeException("実行時例外！")
//    try {
//      throw new RuntimeException("実行事例外！")
//    } catch {
//      case e: Exception => println(e.getMessage)
//    }

  def divide(m: Int, n: Int) = {
    if (n == 0) {
//      throw new Exception("0除算エラー！")
      None
    } else {
      Some(m / n)
    }
  }

  def main(args: Array[String]): Unit = {
    val n: Int = args(0).toInt
    try {
      println(divide(10, n))
    } catch {
      case e:Exception => println(e)
    }
  }

}
