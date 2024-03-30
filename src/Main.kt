fun main() {
    println("This is a new Number Guessing Game written with Kotlin!")
    println()

    while(true) {
        val game = Game()
        game.play()

        println("Do you want to play again? Write yes/no")
        val playAgain = readLine()?.trim()?.toLowerCase()
        if (playAgain != "yes") {
            println("Thanks for playing!")
            break
        }
    }
}