package u02.TestExercise

import Exercise.Currying._

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

case class TestExercise4() {

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
}
