package u02.TestExercise

import Exercise.Parity._
import Exercise.Predicate._

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TestExercise3 {

  // Test exercise 3.a
  @Test def testLambdaParity(): Unit = {
    assertEquals("odd",lambdaParity(3))
    assertEquals("even",lambdaParity(2))
    assertEquals("odd",lambdaParity(-1))
  }

  @Test def testMethodParity(): Unit = {
    assertEquals("odd",methodParity(3))
    assertEquals("even",methodParity(2))
    assertEquals("odd",methodParity(-1))
  }

  // Test exercise 3.b and 3.c
  @Test def testNeg(): Unit = {
    val isTwo: Int => Boolean = _==2

    val notTwo = lambdaNeg(isTwo)
    val notTwoWithMethod = methodNeg(isTwo)

    assertFalse(notTwo(2))
    assertFalse(notTwoWithMethod(2))
    assertTrue(notTwo(1))
    assertTrue(notTwoWithMethod(1))
  }

  @Test def testGenericNeg(): Unit = {
    val isHello: String => Boolean = _=="Hello"

//    val notHelloWithLambda = genericLambdaNeg(isHello) //method not implemented
    val notHello = genericMethodNeg(isHello)

    assertTrue(notHello("A"))
    assertFalse(notHello("Hello"))
  }
}
