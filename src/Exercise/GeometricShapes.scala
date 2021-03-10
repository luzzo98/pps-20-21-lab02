package Exercise

import math.Pi

object GeometricShapes {

  sealed trait Shape
  object Shape {

    case class MyRectangle(base: Double, height: Double) extends Shape

    case class MyCircle(radius: Double) extends Shape

    case class MySquare(side: Double) extends Shape

    def perimeter(shape: Shape): Double = shape match {
      case MyRectangle(base, height) => (base+height)*2
      case MyCircle(radius) => 2*Pi*radius
      case MySquare(side) => side*4
    }

    def area(shape: Shape): Double = shape match {
      case MyRectangle(base, height) => base*height
      case MyCircle(radius) => radius*radius*Pi
      case MySquare(side) => side*side
    }
  }
}
