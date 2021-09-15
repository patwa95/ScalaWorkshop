package main.scalaworkshop.day1.classesObjects

/*Create a class where constructors takes a parameter as number and calculate the
cube in calculateCube*/
class Cube (num: Float){

  def calculateCube= num*num*num
}

object Cube extends App{
  val cubeObj= new Cube(4)
  val res= cubeObj.calculateCube

  print(res)
}
