package main.scalaworkshop.day2.HOF

/*
Create two methods to calculate Square,Cube then pass these methods to a sum
function and add both passed function as result i.e def
sum(function1,function2,num) = {}
*/

class HOFCurryingEx1 {

  def square(num:Int) = num*num

  def cube(num:Int)= num*num*num


  def sum(square:Int => Int,cube:Int=>Int,num:Int)={

    println(square(num)+ cube(num))
  }


}

object main1 extends App{
  val obj1 = new HOFCurryingEx1
  obj1.sum(obj1.square,obj1.cube,3)
}
