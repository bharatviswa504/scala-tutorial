/**
  * Created by bharatviswanadham on 5/21/17.
  */
import A.a
import CaseDepartment.apply

//import collection.mutable.Map
//import retial.OrderItem


object Main {
  def main(args:Array[String]) {
    A
    //When in object Apply method is there, it calls apply method to create object
    println(Companion.apply("hello"," world"))
    println(Companion("hello"))
    println(Companion("hello","bharat","scala"))


    val cd = new CaseDepartment("cse","05")
    //because in case class default toString
    //case class have implements scala.Product,scala.Serializable
    println(cd)
    println(cd.productArity)
    println(cd.productElement(0))
    cd.productIterator.foreach(println)


    val f1 = new Fraction(2,4)
    val f2 = new Fraction(3,4)

    println(f1.result())
    println(f2.result())

    println(f1)
    println(f2)
    println(f1+f2)
    println(f1*f2)
    println(f1-f2)
  }

}




