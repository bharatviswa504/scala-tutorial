/**
  * Created by bharatviswanadham on 5/21/17.
  */
case class CaseDepartment(departmentName:String, departmentid:String) {

}

/*scala> :javap -p CaseDepartment
  Compiled from "<console>"
public class CaseDepartment implements scala.Product,scala.Serializable {
  private final java.lang.String departmentName;
  private final java.lang.String departmentid;
  public java.lang.String departmentName();
  public java.lang.String departmentid();
  public CaseDepartment copy(java.lang.String, java.lang.String);
  public java.lang.String copy$default$1();
  public java.lang.String copy$default$2();
  public java.lang.String productPrefix();
  public int productArity();
  public java.lang.Object productElement(int);
  public scala.collection.Iterator<java.lang.Object> productIterator();
  public boolean canEqual(java.lang.Object);
  public int hashCode();
  public java.lang.String toString();
  public boolean equals(java.lang.Object);
  public CaseDepartment(java.lang.String, java.lang.String);
}*/