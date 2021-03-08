package Exercise

object Parity extends App {

  val lambdaParity : (Int) => String = {
    case n if n%2==0 => "even"
    case _ => "odd"
  }

  def methodParity(num: Int): String = {
    if (num%2==0)
      return "even"
    "odd"
  }

//  println(lambdaParity(3))
//  println(lambdaParity(2))
//  println(lambdaParity(-1))

  println(methodParity(3))
  println(methodParity(2))
  println(methodParity(-1))
}
