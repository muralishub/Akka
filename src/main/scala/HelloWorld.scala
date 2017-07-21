import akka.actor.{Actor, ActorSystem, Props}

//define actor message
case class WhoToGreet(s: String)

//define greeter actor
class Greet extends Actor {

  def receive = {
    case WhoToGreet(a) => println(s"Hello $a")
  }

}





object HelloWorld extends App{

  //create actor system
  val system = ActorSystem("greet")


  //create greeter action
  val action = system.actorOf(Props[Greet], "greet")



  // send whoToGreet message to actor


  action ! WhoToGreet("mike")

}
