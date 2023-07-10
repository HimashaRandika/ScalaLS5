object Q6 {
  def main(args: Array[String]): Unit = {
    def fibonacci(num :Int) :Int = num match {
      case 0 => 0
      case 1 => 1
      case _ => fibonacci(num-1)+fibonacci(num-2)
    }

    def fibonacciSequence(num: Int): Unit ={
      if(num>0){
        fibonacciSequence(num-1)
        println(fibonacci(num))
      }
    }
    fibonacciSequence(10)
  }

}
