package domain.ladderGame

import domain.ladder.Ladder
import domain.player.Player
import domain.player.Players
import domain.prize.Prize
import domain.prize.Prizes

class LadderGame(val players: Players, val ladder: Ladder, val prizes: Prizes) {

    val result = LinkedHashMap<Player, Prize>()

    fun run() {
        movePlayers()
        setResult()
    }

    private fun movePlayers() {
        for (line in ladder.value) {
            players.move(line)
        }
    }

    private fun setResult() {
        for (player in players.value) {
            result[player] = prizes.value[player.position]
        }
    }

    fun getPlayerResult(input: String): String {
        val player = players.findByName(input)
        return result[player]?.name
            ?: throw IllegalArgumentException(":throw IllegalArgumentException([ERROR] 사다리 게임에 참여한 플레이어의 이름을 입력해주세요.)")
    }

    fun getPlayerNames(): List<String> {
        return players.value.map { it.name }
    }

    fun getLadderValue(): List<Int> {
        return ladder.value
    }

    fun getPrizesNames(): List<String> {
        return prizes.value.map { it.name }
    }
}
