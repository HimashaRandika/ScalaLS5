object Q2 {
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

    def primeSeq(num :Int): Unit ={
      if(num>2){
        primeSeq(num-1)
        if(toPrime(num,num/2) && num !=13){
          println(num)
        }
      }else if(num==2){
        println(num)
      }

    }

    primeSeq(13)
  }

}
