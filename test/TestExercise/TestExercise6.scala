package TestExercise

import Exercise.Fibonacci._

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TestExercise6 {

  @Test def testFib(): Unit = {
    assertEquals(0,fib(0))
    assertEquals(1,fib(1))
    assertEquals(1,fib(2))
    assertEquals(2,fib(3))
    assertEquals(3,fib(4))
    assertEquals(55,fib(10))
  }

  @Test def testTailFib(): Unit = {
    assertEquals(0,tailFib(0))
    assertEquals(1,tailFib(1))
    assertEquals(1,tailFib(2))
    assertEquals(2,tailFib(3))
    assertEquals(3,tailFib(4))
    assertEquals(55,tailFib(10))
  }
}
