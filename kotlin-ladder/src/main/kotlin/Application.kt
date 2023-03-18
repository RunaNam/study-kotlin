import domain.ladder.Ladder
import domain.ladderGame.LadderGame
import domain.player.Players
import domain.prize.Prizes
import view.InputView
import view.OutputView

fun main() {
    val ladderGame = generateLadderGame()

    OutputView.printLadderGame(
        ladderGame.getPlayerNames(),
        ladderGame.getLadderValue(),
        ladderGame.getPrizesNames()
    )

    ladderGame.run()
    generateResult(ladderGame)
}

private fun generateLadderGame(): LadderGame {
    val players = generatePlayers()
    val ladder = generateLadder(players)
    val prizes = generatePrizes(players)

    return LadderGame(players, ladder, prizes)
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

fun generatePrizes(players: Players): Prizes =
    try {
        val prizeNames = InputView.inputPrizeNames()
        Prizes(prizeNames, players.getSize())

    } catch (e: RuntimeException) {
        OutputView.printException(e)
        generatePrizes(players)
    }

fun generateResult(ladderGame: LadderGame) {
    var input = InputView.inputResultPlayerName()

    while (input != "finish") {
        if (input == "all") {
            OutputView.printAllResult(ladderGame.result)
        } else {
            OutputView.printOneResult(ladderGame.getPlayerResult(input))
        }
        input = InputView.inputResultPlayerName()
    }
}
