object Q3 {
  def main(args: Array[String]): Unit = {
    def sum(num :Int): Int ={
      if(num==1){
        return 1
      }else{
        return num+sum(num-1)
      }
    }
    println(sum(5))
  }
}
