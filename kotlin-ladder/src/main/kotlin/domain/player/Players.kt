package domain.player

class Players(names: List<String>) {

    val value: List<Player>

    init {
        require(names.distinct().size == names.size) { "사다리 게임 참여자의 이름은 중복이 없어야합니다." }

        val tmpValue: MutableList<Player> = ArrayList()
        for (i in names.indices) {
            tmpValue.add(Player(names[i], i))
        }
        value = tmpValue
    }

    fun findByName(name: String): Player {
        return value.find { it.name == name }
            ?: throw IllegalArgumentException("[ERROR] 사다리 게임에 참여한 플레이어의 이름을 입력해주세요.")
    }

    fun move(position: Int) {
        val firstPlayer = value.find { it.position == position }
        val secondPlayer = value.find { it.position == position + 1 }

        firstPlayer?.move(1)
        secondPlayer?.move(-1)
    }

    fun getSize(): Int {
        return value.size
    }
}
