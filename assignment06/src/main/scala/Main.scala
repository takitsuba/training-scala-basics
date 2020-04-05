object Main {
  def main(args: Array[String]): Unit = {
//    for (x <- 1 to 9) {
//      var text = ""
//      for (y <- 1 to 9) {
//        val value = x * y
//        var space = " "
//        if (value < 10) {
//          space = "  "
//        }
//        text = text + space + value
//      }
//
//      println(text)
//    }
    def simplifyTop(expr: Expr): Expr = expr match {
      case UnOp("-", UnOp("-", e))  => e
      case BinOp("+", e, Number(0)) => e
      case BinOp("*", e, Number(1)) => e
      case _                        => expr
    }

    println(simplifyTop(UnOp("-", Var("x"))))
    println(simplifyTop(UnOp("-", UnOp("-", Var("x")))))
    println(simplifyTop(BinOp("+", Number(1), Number(2))))
    simplifyTop(BinOp("+", Number(1), Number(0)))
    simplifyTop(BinOp("*", Number(7), Number(8)))
    simplifyTop(BinOp("*", Number(7), Number(1)))

    val e1 = BinOp("*", Number(3), Number(1))
    println(e1)

    val e2 = BinOp("+", Number(4), Number(0))
    println(e2)
    println(simplifyTop(BinOp("*", simplifyTop(e1), simplifyTop(e2))))
  }
}
