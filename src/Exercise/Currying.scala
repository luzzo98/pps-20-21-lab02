package Exercise

object Currying {

  def respectTheRelation(n1: Int, n2: Int, n3: Int):Boolean = {
    n1<=n2 && n2<=n3
  }

  //using val there is no difference between <CurriedFunType> in p1 and <NonCurriedFunType> in p2
  val p1: (Int, Int, Int) => Boolean = respectTheRelation
  val p2: (Int, Int, Int) => Boolean = respectTheRelation
  def p3(n1: Int)(n2: Int)(n3: Int): Boolean = respectTheRelation(n1,n2,n3)
  def p4(n1: Int, n2: Int, n3: Int): Boolean = respectTheRelation(n1,n2, n3)
}
