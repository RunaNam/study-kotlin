package domain.prize

class Prizes(val names: List<String>, private val size: Int) {

    val value: List<Prize> = names.map { Prize(it) }

    init {
        require(names.size == size) { "사다리 게임의 실행 결과는 사람 수와 동일하게 입력해야합니다." }
    }
}
