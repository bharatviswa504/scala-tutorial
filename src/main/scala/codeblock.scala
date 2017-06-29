/**
  * Created by bharatviswanadham on 5/20/17.
  */
object codeblock {

  def main(args:Array[String]): Unit = {
    println("********")
    println("Expression")
    val c2 = {
      val i = (math.random * 100).toInt
      val j = (math.random * 100).toInt
      i - j
    }
    println(c2)

    println("sum Expression")
    val c3 = {
      var x = 100
      var y = 200
      x + y
    }
    println(c3)


    print("Nested Block")
    val c4 = {
      var x = 100
      var y = 200

      val c5 = {
        println("x from inner block is " + x)
        println("y from inner block is " + y)
        x = 110
        y = 220
      }
      println("x from outer block is " + x)
      println("y from outer block is " + y)
      x + y
    }

    println(c4)


    println("Another Expression")
    val sqr = {
      val a = 1
      val b: Long = 23L
      val hi = "hi"
      true
    }
    println(sqr)


    val i = 100
    val j = 20
    println("********")
    println("if else in code block")
    val k = {
      if (i > j) {
        i
      } else if (i == j) {
        i
      } else {
        j
      }
    }
    println(k)
  }

}
