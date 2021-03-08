package Exercise

import org.junit.jupiter.api.Assertions._

object Parity extends App {

  val lambdaParity : Int => String = {
    case n if n%2==0 => "even"
    case _ => "odd"
  }

  def methodParity(num: Int): String = (num%2==0) match {
    case true => "even"
    case _ => "odd"
  }

  assertEquals("odd",lambdaParity(3))
  assertEquals("even",lambdaParity(2))
  assertEquals("odd",lambdaParity(-1))

  assertEquals("odd",methodParity(3))
  assertEquals("even",methodParity(2))
  assertEquals("odd",methodParity(-1))
}
