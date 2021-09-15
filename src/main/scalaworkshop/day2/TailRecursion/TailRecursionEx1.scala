package main.scalaworkshop.day2.TailRecursion

import scala.annotation.tailrec

object TailRecursionEx1 extends App {

  @tailrec
  def fact(num: Int, result: Int = 1): Int = {
    if (num == 0)
      return result
    else
      return fact(num - 1, result * num)
  }


  println(fact(5))//
}
