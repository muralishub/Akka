import MusicController.{Play, Stop}
import MusicPlayer.{StartMusic, StopMusic}
import akka.actor.{Actor, ActorSystem, Props}


object MusicController {
  sealed trait ControllerMsg
  case object  Play extends ControllerMsg
  case object Stop extends ControllerMsg

  val props = Props[MusicController]


}



class MusicController extends Actor {

  def receive = {
    case Play => println("music started")
    case Stop => println("music stopped")
    case _ => println("unknown")
  }
}


object MusicPlayer {
  sealed trait PlayMsg
  case object StopMusic extends PlayMsg
  case object StartMusic extends PlayMsg
}




class MusicPlayer extends Actor {
  def receive ={
    case StopMusic => println("I dont want to stop music")
    case StartMusic =>
      val controller = context.actorOf(MusicController.props, "controller")
      controller ! Play

  }

}

object Music extends App{

  val system = ActorSystem("creation")

  val player = system.actorOf(Props[MusicPlayer], "player")

  player ! StartMusic

}
