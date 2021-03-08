package Exercise

import org.junit.jupiter.api.Assertions._

object Currying extends App {

  def respectTheRelation(n1: Int, n2: Int, n3: Int):Boolean = {
    n1<=n2 && n2<=n3
  }

  val p1: (Int, Int, Int) => Boolean = respectTheRelation
  val p2: (Int, Int, Int) => Boolean = respectTheRelation
  def p3(n1: Int)(n2: Int)(n3: Int): Boolean = respectTheRelation(n1,n2,n3)
  def p4(n1: Int, n2: Int, n3: Int): Boolean = respectTheRelation(n1,n2, n3)

  assertTrue(p1(2,4,6))
  assertTrue(p2(2,4,6))
  assertTrue(p3(2)(4)(6))
  assertTrue(p4(2,4,6))
}
