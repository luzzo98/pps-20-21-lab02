package Exercise

import org.junit.jupiter.api.Assertions._

object FunctionalComposition {

  def compose(f: Int => Int, g: Int => Int): Int => Int = {
    (t) => f(g(t))
  }

  assertEquals(9,compose(_-1,_*2)(5))
  assertEquals(4,compose(_+4,_%2)(10))

  def genericCompose[A,B,C](f: A => B, g: C => A): C => B = {
    (t) => f(g(t))
  }
}
