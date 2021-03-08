package Exercise

object Predicate extends App {
  val isTwo: Int => Boolean = _==2

  val lambdaNeg : (Int => Boolean) => (Int => Boolean) = (n => !n(_))

//  def methodNeg(fun: Int => Boolean): Int => Boolean = {
//    !fun(_)
//  }

  def methodNeg[A,B](fun: [A] => [B]): [A] => [B] = {
    !fun(_)
  }

  val notTwo = methodNeg(isTwo)
//  val notTwo = lambdaNeg(isTwo)

  println(notTwo(2))
  println(notTwo(1))
}
