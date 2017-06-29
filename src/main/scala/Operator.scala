/**
  * Created by bharatviswanadham on 5/20/17.
  */
object Operator {
 def main(args:Array[String]): Unit = {

   val a = 2
   val b = 3

   var res = a.+(b)

   res = a+b
   println(res)

   var cmp = a.equals(b)

   println(cmp)

 }
}
