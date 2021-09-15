package main.scalaworkshop.day1.classesObjects

/*Create a class to calculate the simple intrest using a method call
calculateSimpleIntrest having two parameters principle , rate for one year*/
class SimpleInterest {

  def calculateSimpleIntrest(principal: Float, rate: Float): Float = {
    var interest = (principal * rate * 1) / 100
    return  interest
  }
}

object SimpleInterest extends  App{

  val calculate = new SimpleInterest
  val res= calculate.calculateSimpleIntrest(200,2)
  print(res)

}
