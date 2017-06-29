/**
  * Created by bharatviswanadham on 5/21/17.
  */
class Fraction(val numerator:Int, val denominator:Int) {

  override def toString = {
    "Fraction (" + numerator +"/" + denominator +")"
  }

  def result() : Double= {
    numerator/denominator.toDouble
  }

  def +(f2:Fraction) = {
    new Fraction((numerator*f2.denominator + f2.numerator*denominator), (denominator*f2.denominator))
  }

  def - (f2:Fraction) = {
    new Fraction((numerator*f2.denominator - f2.numerator*denominator), (denominator*f2.denominator))
  }

  def * (f2:Fraction) = {
    new Fraction(numerator * f2.numerator, denominator * f2.denominator)
  }


}
