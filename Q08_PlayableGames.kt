// Question 8: Cricket and Football implement the Playable interface.

interface Playable {
    fun play()
}

class Cricket : Playable {
    override fun play() {
        println("Playing cricket.")
    }
}

class Football : Playable {
    override fun play() {
        println("Playing football.")
    }
}

fun main() {
    val games: List<Playable> = listOf(Cricket(), Football())

    for (game in games) {
        game.play()
    }
}
