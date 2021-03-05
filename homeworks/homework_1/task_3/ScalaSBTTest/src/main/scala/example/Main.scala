package example

object Main extends App {
  def printGreeting(word: String, name: String) = {
    println(s"${word}! This is ${name}!")
  }

  printGreeting("Hello", "Alexandr")

  val Words = List("Hello", "Guten tag", "Hola")

  Words.foreach(printGreeting(_, "Alexandr"))
}
