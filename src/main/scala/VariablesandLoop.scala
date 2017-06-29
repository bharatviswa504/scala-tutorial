/**
  * Created by bharatviswanadham on 5/20/17.
  */
object VaribalesandLoop {

  def main(args: Array[String]) {
    var i = 0
    var j = 10

    println("while")
    while (i<j) {
      println(i)
      i = i+1
    }

    i = 10
    j = 20

    println("for")
    for ( e<- i to j by 1) {
      println(e)
    }

    j = 30

    println("reverse for")

    for (e <- j to i by -2) {
      println(e)
    }


    //Declaration of variables
    val a:Int = 10
    val b:Double = 10.0
    val c:Byte = 127
    val d:Boolean = true
    val e:Float = 30


    var a1:Int = 10
    var b1:Double = 10.0
    var c1:Byte = 127
    var d1:Boolean = true
    var e1:Float = 30



  }
}
