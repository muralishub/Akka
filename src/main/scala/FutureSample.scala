import scala.concurrent.Future

object FutureSample extends App{

  import scala.concurrent.ExecutionContext.Implicits.global

  val actor = new SimpleActor3

 Future(actor.receive("monday"))

  println("monday")


  Future(actor.receive("tuesday"))
  println("tuesday")
  Future(actor.receive("wednesday"))
  println("wednesday")
  Future(actor.receive("thursday"))
  println("thursday")
 Future(actor.receive("friday"))

  println("friday")
 Future(actor.receive("saturday"))
  println("saturday")
 Future(actor.receive("sunday"))
  println("sunday")



}


class SimpleActor3  {

  def receive(i: Any) = i match{
    case s: String => println(s"value of string is: $s")
    case i: Int => println(s"value of int is: $i")
  }


  def foo = println("normal method")


}

