package main.scalaworkshop.day1.caseclasses

/*Create case class Song with title, artist and track attributes
Create case class object
Get title from the object
try to mutate the title value
Compare 2 case classes
Create new object using shallow copy*/
case class Song(var title:String,artist:String,track:String)

object Song extends App{

  val songobj1= Song("title1","artist1","track1")

  println("The title of the song is ",songobj1.title)
  songobj1.title="title2"
  println("The new title of the song is ",songobj1.title)

  val songobj2 = Song("title2","artist2","track2")

  val aresameobj= songobj1==songobj2
  println(aresameobj)

  val songobj3 = songobj1.copy()
  val aresameobj2= songobj1==songobj3
  println(aresameobj2)
}


