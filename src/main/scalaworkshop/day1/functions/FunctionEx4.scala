package main.scalaworkshop.day1.functions

/*Write a function called multiplier that takes two parameters, first as Int, and
other of Function type (Int)=>Int . This multiplies the Int value with result of
the function.
Create 2 anonymous functions incremeter( which increments its value by
1) and squared(which gives square of number). Now the problem will be
how we can input another Integer for the function multiplier. The return
type of multiplier has not been provided. So try to create your own way.*/
object FunctionEx4 extends App {

  def multiplier(first: Int)(other: Int => Int): Int = {
    val sec = first * 3
    other(sec)
  }


  var incremeter = (num: Int) => num + 1
  var squared = (num2: Int) => num2 * num2

  val res = multiplier(2) { sec =>
    val a = 2
    sec - a
  }

  println(res)
}
