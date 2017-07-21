import akka.actor.{Actor, ActorSystem, Props}




object main extends App{

  val system = ActorSystem("SimpleSystem")

  val actor = system.actorOf(Props[SimpleActor], "SimpleActor")

println("monday")
  actor ! "monday"
  println("tuesday")
  actor ! "tuesday"
  println("wednesday")
  actor ! "wednesday"

  println("thursday")
  actor ! "thursday"

  println("friday")
  actor ! "friday"

  println("saturday")
  actor ! "saturday"


}

//an actor has some business logic and its pretty much a blackbox to outside code
//here we are sending messages and receiving messages from actors
class SimpleActor extends Actor {

  def receive = {
    case s: String => println(s"value of string is: $s")
    case i: Int => println(s"value of int is: $i")
   }
}


