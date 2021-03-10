package Exercise

import scala.annotation.tailrec

object Fibonacci {

  //in this case we don't have a tail recursion because you do not get the result of the calculation until you have
  // returned from each recursive call
  def fib(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case n => fib(n-1) + fib(n-2)
  }

  def tailFib(n: Int): Int = {
    @tailrec def _fib (n: Int, temp1: Int, temp2: Int): Int = n match {
      case 0 => temp1
      case 1 => temp2
      case n => _fib(n-1,temp2,temp1+temp2)
    }
    _fib(n,0,1)
  }
}
