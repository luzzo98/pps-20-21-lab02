package Exercise

object Predicate {

  val lambdaNeg : (Int => Boolean) => (Int => Boolean) = n => !n(_)

  def methodNeg(fun: Int => Boolean): Int => Boolean = {
    !fun(_)
  }

  // probably it's impossible to do this lambda with generics, an example of what I tried to do
  // val genericLambdaNeg[A]: (A=> Boolean) => (A => Boolean) = (n => !n(_))

  def genericMethodNeg[A](fun: A => Boolean): A => Boolean = {
    !fun(_)
  }
}
