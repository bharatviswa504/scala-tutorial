/**
  * Created by bharatviswanadham on 5/20/17.
  */
object func {

  def main(args: Array[String]): Unit =
  {
    val res = fact(4)
    println("Fact is:" + res)

    fibanocii(6)

    val res1 = ncR(5,2)
    println("ncr of (5,2):" + res1)

    val result = isFibanocii(14)
    println("isFibanocci(24)" + result)
  }

  def fact( i: Int ) = {
  var result = 1
  for (e <- 1 to i by 1) {
    result = result * e;
  }
  result
  }

  def fibanocii(i:Int) = {

    var pre = 1
    var cur = 1

    println("Fibanocii series")
    println(pre)
    println(cur)
    var sum = 0
    for (e<- 3 to i) {
      sum = pre + cur
      println(sum)
      pre = cur
      cur = sum
    }
  }

  def ncR(n:Int, r:Int) :Int = {

    def fact( i: Int ) = {
      var result = 1
      for (e <- 1 to i by 1) {
        result = result * e;
      }
      result
    }

    fact(n)/(fact(n-r) * fact(r))

  }

  def isFibanocii(i:Int) :Boolean = {

      var pre = 1
      var cur = 1

      if(pre==i)
        return true

      var sum = 0

      for (e<- 3 to i) {
        sum = pre + cur

        if(sum == i)
          return  true
        else if(sum > i)
          return false


        pre = cur
        cur = sum
      }

    false

  }

}
