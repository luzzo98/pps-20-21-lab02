package TestExercise

import Exercise.FunctionalComposition._

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TestExercise5 {

  @Test def testCompose(): Unit = {
    val decrement: Int => Int = _-1
    val doubling: Int => Int = _*2
    val addSix: Int => Int = _+6

    assertEquals(9,genericCompose(decrement,doubling)(5))
    assertEquals(16,genericCompose(addSix,doubling)(5))
  }

  @Test def testGenericCompose(): Unit = {
    val isHello: String => Boolean = _=="Hello"
    val ifTrueGiveFive: Boolean => Int = {
      case true => 5
      case _ => 0
    }

    assertEquals(5,genericCompose(ifTrueGiveFive,isHello)("Hello"))
    assertEquals(0,genericCompose(ifTrueGiveFive,isHello)("Nope"))
  }
}
