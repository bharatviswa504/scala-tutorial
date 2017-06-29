/**
  * Created by bharatviswanadham on 5/20/17.
  */
object Factorial {

  def main(args: Array[String]): Unit = {

    val fact:Int = 5;

    var res:Int = 1

    for ( e <- fact to 1 by -1) {
      res = res * e;
    }

    println("Factorial of " + fact + "is " +res)
  }
}
