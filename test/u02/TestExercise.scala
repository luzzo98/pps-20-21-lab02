package u02

import Exercise.Parity._
import Exercise.Predicate._
import Exercise.Currying._
import Exercise.FunctionalComposition._
import Exercise.Fibonacci._
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TestExercise {

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

  // Test exercise 4
  @Test def testCurrying(): Unit = {
    assertTrue(p1(2,4,6))
    assertTrue(p2(2,4,6))
    assertTrue(p3(2)(4)(6))
    assertTrue(p4(2,4,6))
    assertFalse(p1(2,1,6))
    assertFalse(p2(2,1,6))
    assertFalse(p3(2)(1)(6))
    assertFalse(p4(2,1,6))
  }

  // Test exercise 5
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

  // Test exercise 6
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
