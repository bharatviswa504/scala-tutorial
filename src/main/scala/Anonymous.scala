/**
  * Created by bharatviswanadham on 5/20/17.
  */

import func.isFibanocii

object Anonymous {

  def sumOfInt( f: Int=>Int, a:Int, b:Int) :Int = {

    if(a>b)
      0
    else
      f(a) + sumOfInt(f,a+1,b)

  }


  def sumofSquares( f: (Int,Int) => Int, a:Int, b:Int) : Int = {
    if(a>b)
      0
    else
      f(a,a) + sumofSquares(f,a+1,b)
  }


  def main( args:Array[String]) = {

    // Anonymous function directly passed

    println(sumOfInt((i:Int)=>i,1,10))
    println(sumOfInt((i:Int)=>i*i,1,10))

    println("Just to show function which can take multiple paramaters")
    println(sumofSquares((i:Int,j:Int)=> i*j , 1, 10))


    // Assigining function to a variable
    val id =  (i:Int) => i
    val square = (i:Int) => i*i


    println("showing with assigning anonymous function to a variable")
    println(sumOfInt(id,1,10))
    println(sumOfInt(square,1,10))

    println(func.isFibanocii(10))

  }
}
