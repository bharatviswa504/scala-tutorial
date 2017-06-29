/**
  * Created by bharatviswanadham on 5/20/17.
  */
object HigherOrderFunc {


  def sum( f:Int => Int, a:Int, b:Int): Int = {
    if(a>b)
      0
    else
      f(a) + sum(f,a+1,b)
  }


  def id(i:Int) = i

  def square(i:Int) = i*i

  def cube(i:Int) = i*i*i


  def main(args:Array[String]): Unit = {


    println("With Higher Order Functions, function value as parameter")
    println(sum(id,1,10))
    println(sum(square,1,10))
    println(sum(cube,1,10))

    println("Normal Functions")

    println(sumOfInt(1,10))
    println(sumofSqaures(1,10))


  }


  def sumOfInt( a: Int, b:Int) :Int = {
    if(a>b) 0 else a + sumOfInt(a+1,b)
  }

  def sumofSqaures( a:Int, b:Int) :Int = {
    if(a>b) 0 else a*a + sumofSqaures(a+1,b)
  }

}
