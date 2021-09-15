package main.scalaworkshop.day1.functions

import scala.math.Pi
/*Write a function that computes the area of a circle given its circumference.
Solve using Nested function.*/
class AreaOfCircleCircumference {

  def calculateAreaOfCircle(circumference:Double):Double={
    def calculateRadius (a: Double ):Double={
      val radius= a/(2*Pi)
      val area = Pi*radius*radius

      area
    }


    calculateRadius(circumference)
  }

}

object mainclass{
  def main(args: Array[String]): Unit = {
    val obj = new AreaOfCircleCircumference
    val res= obj.calculateAreaOfCircle(100)

    println(s"The area of circle is  $res")
  }
}
