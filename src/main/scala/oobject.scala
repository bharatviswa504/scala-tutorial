/**
  * Created by bharatviswanadham on 5/20/17.
  */
object oobject {

  def main(args:Array[String]): Unit = {

    val n = args(0).toInt
    val r = args(1).toInt

    println("ncR of " + n + " " +  r + " " + ncR(n,r))

  }


  def ncR( n:Int, r:Int) :Int ={

    def factorial(n:Int) = {
      var res = 1
      for (i<- 1 to n by 1) {
         res = res * i
      }
      res
    }
    factorial(n)/(factorial(n-r) * factorial(r))
  }

}
