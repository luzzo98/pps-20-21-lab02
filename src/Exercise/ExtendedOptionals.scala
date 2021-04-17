package Exercise

object ExtendedOptionals extends App {

  sealed trait Option[A] // An Optional data type
  object Option {

    case class None[A]() extends Option[A]

    case class Some[A](a: A) extends Option[A]

    def isEmpty[A](opt: Option[A]): Boolean = opt match {
      case None() => true
      case _ => false
    }

    def getOrElse[A, B >: A](opt: Option[A], orElse: B): B = opt match {
      case Some(a) => a
      case _ => orElse
    }

    def flatMap[A, B](opt: Option[A])(f: A => Option[B]): Option[B] = opt match {
      case Some(a) => f(a)
      case _ => None()
    }

    def get[A](opt: Option[A]): A = opt match {
      case Some(a) => a
    }

    def filter[A](opt: Option[A])(f: Option[A] => Boolean): Option[A] = f(opt) match {
      case true => opt
      case false => None()
    }

    def map[A,B](opt: Option[A])(f: A => B): Option[B] = opt match {
      case Some(a) => Some(f(a))
      case _ => None()
    }

    def map2WithStrings[A,B](opt1: Option[A])(opt2: Option[B]): Option[String] = (opt1, opt2) match {
      case (Some(a), Some(b)) => Some(a.toString + "+" + b.toString)
      case _ => None()
    }

    def map2[A,B,C](opt1: Option[A])(opt2: Option[B])(f: (A, B) => C): Option[C] = (opt1, opt2) match {
      case (Some(a), Some(b)) => Some(f(a,b))
      case _ => None()
    }
  }
}
