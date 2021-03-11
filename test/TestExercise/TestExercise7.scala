package TestExercise

import Exercise.GeometricShapes.Shape._

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class TestExercise7 {

  @Test def testShapesPerimeter(): Unit = {
    assertEquals(24, perimeter(MyRectangle(8,4)))
    assertEquals(18.84955592153876, perimeter(MyCircle(3)))
    assertEquals(20, perimeter(MySquare(5)))
  }

  @Test def testShapesArea(): Unit = {
    assertEquals(32, area(MyRectangle(8,4)))
    assertEquals(28.274333882308138, area(MyCircle(3)))
    assertEquals(25, area(MySquare(5)))
  }
}
