import akka.actor.{Actor, ActorSystem, Props}

object normal extends App{





  val actor = new SimpleActor2


  println("monday")
  actor.receive("monday")
  println("tuesday")
  actor.receive("tuesday")
  println("wednesday")
  actor.receive("wednesday")

  println("thursday")
  actor.receive("thursday")

  println("friday")
  actor.receive("friday")

  println("saturday")
  actor.receive("saturday")


}


class SimpleActor2  {

  def receive(i: Any) = i match{
    case s: String => println(s"value of string is: $s")
    case i: Int => println(s"value of int is: $i")
  }


  def foo = println("normal method")


}
