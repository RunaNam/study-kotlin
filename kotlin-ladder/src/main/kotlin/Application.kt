import domain.ladder.Ladder
import domain.player.Players
import view.InputView
import view.OutputView

fun main() {
    val players = generatePlayers()
    val ladder = generateLadder(players)

    for (player in players.value) {
        println(player.position)
    }
    
    println()

    for (a in ladder.value) {
        println(a)
    }
}

fun generateLadder(players: Players): Ladder =
    try {
        val height = InputView.inputHeight()
        Ladder(height, players.value.size)
    } catch (e: RuntimeException) {
        OutputView.printException(e)
        generateLadder(players)
    }

fun generatePlayers(): Players =
    try {
        val playerNames = InputView.inputPlayerNames()
        Players(playerNames)
    } catch (e: RuntimeException) {
        OutputView.printException(e)
        generatePlayers()
    }


