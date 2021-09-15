package main.scalaworkshop.day1.functions

/*
Write a function that computes the area of a circle given its radius.
*/

class AreaOfCircle {

  def calculateAreaOfCircle(radius:Double):Double={
    val area = 22/7 * radius *radius
    area
  }


}

object main1 extends App{
  val obj1 = new AreaOfCircle
  val res =obj1.calculateAreaOfCircle(4.3)

  println(s"The area of circle is $res")
}