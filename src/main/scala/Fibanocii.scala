/**
  * Created by bharatviswanadham on 5/20/17.
  */
object Fibanocii {
  def main(args: Array[String]) {

    val n = 5;

    var a = 1;
    var b = 1;

    println(a)
    println(b)
    for ( e <- 3 to n by 1) {
      var sum = a + b
      println(sum)
      a = b
      b = sum
    }
  }

}
