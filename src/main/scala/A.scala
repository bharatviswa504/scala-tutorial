/**
  * Created by bharatviswanadham on 5/21/17.
  */
class A(private val message:String)

object A{
  //Companion Object only can access private variables
  // Arguments cannot be passed for companion object
  val a = new A("Hello World")
  println(a.message)
}


