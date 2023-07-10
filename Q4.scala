object Q4 {
  def main(args: Array[String]): Unit = {
    //Using Indirect Recursive (Mutual Recursion)

    def toEven(num: Int): Boolean = num match {
      case 0 => true
      case _ => toOdd(num-1)
    }

    def toOdd(num:Int): Boolean = num match {
      case 0 => false
      case _ => toEven(num-1)
    }

    println(toEven(5))
    println(toEven(8))
  }

}
