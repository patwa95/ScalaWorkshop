package main.scalaworkshop.day1.functions

/*Write a function that that that takes integers , that can vary in count and
generate xor value of all of those. Write function with and without using a
collection.*/

class FunctionEx3 {

  def calculateXor(num:Int*):Int={
    var res = 0

    for (i <- num) res = res ^ i
    res
  }
}

object mainobject extends App{
  val obj = new FunctionEx3
  val ans= obj.calculateXor(1,1,1)

  print(ans)

}
