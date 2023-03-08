package domain.player

class Players(val names: List<String>) {

    val value: List<Player>

    init {
        require(names.distinct().size == names.size) { "사다리 게임 참여자의 이름은 중복이 없어야합니다." }
        value = names.map { Player(it, 0) }
    }
}