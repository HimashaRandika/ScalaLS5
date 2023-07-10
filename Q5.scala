object Q5 {
  def main(args: Array[String]): Unit = {
    def sum(num :Int): Int ={
      if(num==0){
        return 0
      }
      if(num%2==1) {
        return sum(num-1)
      }else{
        return num+sum(num-1)
      }
    }
    println(sum(15))
  }
}
