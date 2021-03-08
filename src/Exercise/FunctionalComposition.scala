package Exercise

import org.junit.jupiter.api.Assertions._

object FunctionalComposition extends App {

  def compose(f: Int => Int, g: Int => Int): Int => Int = {
    (t) => f(g(t))
  }

  assertEquals(9,compose(_-1,_*2)(5))
  assertEquals(4,compose(_+4,_%2)(10))

  def genericCompose[A,B,C](f: A => B, g: C => A): C => B = {
    (t) => f(g(t))
  }

  val decrement: Int => Int = _-1
  val doubling: Int => Int = _*2
  assertEquals(9,genericCompose(decrement,doubling)(5))

  val isHello: String => Boolean = _=="Hello"
  val ifTrueGiveFive: Boolean => Int = {
    case true => 5
    case _ => 0
  }
  assertEquals(5,genericCompose(ifTrueGiveFive,isHello)("Hello"))
  assertEquals(0,genericCompose(ifTrueGiveFive,isHello)("Nope"))
}
