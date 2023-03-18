import domain.ladder.Ladder
import domain.player.Players
import domain.prize.Prizes
import view.InputView
import view.OutputView

fun main() {
    val players = generatePlayers()
    val ladder = generateLadder(players)
    val prizes = generatePrizes(players)
}

fun generatePrizes(players: Players): Prizes =
    try {
        val prizeNames = InputView.inputPrizeNames()
        Prizes(prizeNames, players.getSize())

    } catch (e: RuntimeException) {
        OutputView.printException(e)
        generatePrizes(players)
    }

fun generatePlayers(): Players =
    try {
        val playerNames = InputView.inputPlayerNames()
        Players(playerNames)
    } catch (e: RuntimeException) {
        OutputView.printException(e)
        generatePlayers()
    }

fun generateLadder(players: Players): Ladder =
    try {
        val height = InputView.inputHeight()
        Ladder(height, players.getSize())
    } catch (e: RuntimeException) {
        OutputView.printException(e)
        generateLadder(players)
    }
