package main.scalaworkshop.day1.classesObjects

/*Create a case class and override apply method to print a custom message*/

 case class ApplyMethodOverride(name: String) {
  def print = println(s" $name")
 }

object ApplyMethodOverride{
  def apply(name: String): String = "abc"


}


object main extends App {

  val obj1 = ApplyMethodOverride("bcd")
  print(obj1)

}


/*
case class ApplyMethodOverride2 extends ApplyMethodOverride with App {
 val a = ApplyMethodOverride2("My name is changed")
  println(a)
}

*/
