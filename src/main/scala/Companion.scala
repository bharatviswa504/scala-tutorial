/**
  * Created by bharatviswanadham on 5/21/17.
  */
//If constructor has not val or var, then it is default val type
class Companion(data:String) {
  var addData = ""
  override def toString = "Companion Object " + data + addData
}
/*scala> :javap -p Companion
  Compiled from "<console>"
public class Companion {
  private final java.lang.String data;
  private java.lang.String addData;
  public java.lang.String addData();
  public void addData_$eq(java.lang.String);
  public java.lang.String toString();
  public Companion(java.lang.String);
}*/

object Companion {
  def apply(data:String,  addData:String) = {
    val c = new Companion(data)
    //c.data = data
    c.addData = addData
    c
  }

  def apply(data:String) = {
    new Companion(data)
  }

  def apply(data:String,addData:String,notData:String) = {
    val c = new Companion(data)
    c.addData = addData + notData
    c
  }
}