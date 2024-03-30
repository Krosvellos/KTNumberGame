import kotlin.random.Random
class Game {

        fun play() {

            val randNum = Random.nextInt(1, 10)
            var guess = 0
            val attempts = 3
            var remainingAttempts = attempts

            println("A number is chosen between 1 and 10! Guess the number:")

            do {
                for (i in 0 until attempts) {
                    guess = readLine()?.toIntOrNull() ?: continue

                    when {

                        guess < randNum -> println("The number is higher! Try again.")
                        guess > randNum -> println("The number is lower! Try again.")
                        else -> {println("That is correct!")
                        return
                        }
                    }
                    remainingAttempts--
                    if (remainingAttempts == 0) {
                        println("You are out of trials! Game over!")
                        return

                    }
                }
                }while (guess != randNum)



        }
}