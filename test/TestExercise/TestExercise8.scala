package TestExercise

import Exercise.ExtendedOptionals.Option._

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TestExercise8 {

  @Test def testFilter() {
    assertEquals(Some(5), filter(Some(5))(get(_) > 2))
    assertEquals(None(), filter(Some(5))(get(_) > 8))
    assertEquals(None(), filter(None[Int]())(getOrElse(_, 0) > 8))
  }

  @Test def testMap(): Unit = {
    assertEquals(Some(true), map(Some(5))(_ > 2))
    assertEquals(Some(false), map(Some(1))(_ > 2))
    assertEquals(None(), map(None[Int]())(_ > 2))
  }

  @Test def testMap2(): Unit = {
    assertEquals(Some("true+5"), map2(Some(true))(Some(5)))
    assertEquals(Some("false+-1"), map2(Some(false))(Some(-1)))
    assertEquals(None(), map2(None[Int]())(Some(5)))
  }
}
