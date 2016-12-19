import java.lang.Math.*

fun main(args: Array<String>) {
  println("Guess the number (1-100)")
  val number = ceil(random() * 100).toInt()
  val guesses = tryGuess(number, 0)
println("You win!")
println("Took $guesses guesses")
}

fun tryGuess(number: Int, guesses: Int): Int {
  val guess = readLine()?.toInt()
  return if (guess != null) {
    if (guess < number) {
      println("Too low")
      tryGuess(number, guesses + 1)
    }
    else if (guess > number) {
      println("Too high")
      tryGuess(number, guesses + 1)
    }
    else {
      guesses
    }
  }
  else {
    println("That's not a number.")
    tryGuess(number, guesses)
  }
}
