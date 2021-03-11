package Exercise

import org.junit.jupiter.api.Assertions._

object FunctionalComposition {

  def compose(f: Int => Int, g: Int => Int): Int => Int = {
    t => f(g(t))
  }

  def genericCompose[A,B,C](f: A => B, g: C => A): C => B = {
    t => f(g(t))
  }
}
