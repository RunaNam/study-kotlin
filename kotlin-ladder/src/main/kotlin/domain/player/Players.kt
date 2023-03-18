package domain.player

class Players(val names: List<String>) {

    val value: List<Player>

    init {
        require(names.distinct().size == names.size) { "사다리 게임 참여자의 이름은 중복이 없어야합니다." }

        val tmpValue: MutableList<Player> = ArrayList()
        for (i in names.indices) {
            tmpValue.add(Player(names[i], i))
        }
        value = tmpValue
    }

    fun getSize(): Int {
        return value.size
    }
}
