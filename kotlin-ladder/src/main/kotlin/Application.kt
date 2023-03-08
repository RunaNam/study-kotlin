import domain.player.Players
import view.InputView
import view.OutputView

fun main() {
    val players = generatePlayers()
}

fun generatePlayers(): Players =
    try {
        val playerNames = InputView.inputPlayerNames()
        Players(playerNames)
    } catch (e: RuntimeException) {
        OutputView.printException(e)
        generatePlayers()
    }


