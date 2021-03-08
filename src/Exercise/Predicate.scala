package Exercise

import org.junit.jupiter.api.Assertions._

object Predicate extends App {

//Int => Boolean version
  val lambdaNeg : (Int => Boolean) => (Int => Boolean) = n => !n(_)

//  def methodNeg(fun: Int => Boolean): Int => Boolean = {
//    !fun(_)
//  }

//Generic version
//  val lambdaNeg[A]: (A=> Boolean) => (A => Boolean) = (n => !n(_)) //probably it's impossible to do this lambda with generics

  def methodNeg[A](fun: A => Boolean): A => Boolean = {
    !fun(_)
  }


  val isTwo: Int => Boolean = _==2
  val isHello: String => Boolean = _=="Hello"

//  val notTwo = lambdaNeg(isTwo)
  val notTwo = methodNeg(isTwo)
//  val notHello = lambdaNeg(isHello)
  val notHello = methodNeg(isHello)

  assertFalse(notTwo(2))
  assertTrue(notTwo(1))
  assertTrue(notHello("A"))
  assertFalse(notHello("Hello"))
}
