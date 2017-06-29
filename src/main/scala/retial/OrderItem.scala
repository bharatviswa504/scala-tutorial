package retial

/**
  * Created by bharatviswanadham on 5/20/17.
  */
class OrderItem (
       var orderItemId: Int,
       var orderItemOrderId: Int,
       var orderItemProductId: Int,
       var orderItemQuantity: Int,
       var orderItemSubtotal: Float,
       var orderItemProductPrice: Float)
{

require(orderItemSubtotal == orderItemProductPrice * orderItemQuantity, "Invalid OrderItemSubTotal")

  def this(orderItemId: Int, orderItemOrderId:Int, orderItemProductId:Int, orderItemQuantity:Int, orderItemProductPrice:Float) {
    this(orderItemOrderId,orderItemOrderId,orderItemProductId,orderItemQuantity,orderItemProductPrice*orderItemQuantity,orderItemProductPrice)
  }

  override def toString(): String = {
   "OrderItem " + "(orderItemId = )" + orderItemId
  }

}


