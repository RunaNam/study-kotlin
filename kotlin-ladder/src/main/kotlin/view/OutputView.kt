package view

import domain.player.Player
import domain.prize.Prize

object OutputView {

    fun printException(e: Exception) {
        println(e.message)
        println()
    }

    fun printLadderGame(players: List<String>, ladders: List<Int>, prizes: List<String>) {
        println(players.joinToString(separator = "     "))
        for (ladder in ladders) {
            for (i in players.indices) {
                print("|")
                if (i == ladder) {
                    print("-----")
                } else {
                    print("     ")
                }
            }
            println()
        }
        println(prizes.joinToString(separator = "     "))
    }

    fun printAllResult(results: LinkedHashMap<Player, Prize>) {
        println("실행결과")
        for (result in results) {
            println("${result.key.name} : ${result.value.name}")
        }
    }

    fun printOneResult(playerPrize: String) {
        println("실행결과")
        println(playerPrize)
    }
}
