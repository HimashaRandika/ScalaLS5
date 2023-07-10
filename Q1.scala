object Q1 {
  def main(args: Array[String]): Unit = {
    def toPrime(num :Int, i :Int): Boolean ={
      if(i==1){
        return true
      }else{
        if(num%i==0){
          return false
        }else{
          return toPrime(num,i-1)
        }
      }
    }
    println(toPrime(5,5/2))
    println(toPrime(8,8/2))
  }
}
