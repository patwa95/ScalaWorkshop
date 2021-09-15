package main.scalaworkshop.day2.HOF

/*Calculate the principle intrest in curried function by passing principle
amount,rate and years as individual argument.*/
class HOFCurryingEx2 {

  def SimpleInterest(principle:Double)(rate:Double)(year:Double)={
    val res = principle* rate*year/100

    println(s"The SImple interest for $year years is  $res")
  }
}

object main extends App{
  val obj1= new HOFCurryingEx2
  val SI1= obj1.SimpleInterest(1000.2)(2.3)(_)
  val SI2 = SI1(2)
  val SI3 = SI1(3)
}
