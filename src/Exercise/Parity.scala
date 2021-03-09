package Exercise

object Parity {

  val lambdaParity : Int => String = {
    case n if n%2==0 => "even"
    case _ => "odd"
  }

  def methodParity(num: Int): String = (num%2==0) match {
    case true => "even"
    case _ => "odd"
  }
}
