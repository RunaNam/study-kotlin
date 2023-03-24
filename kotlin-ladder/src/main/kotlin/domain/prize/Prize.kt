package domain.prize

class Prize(private val inputName: String) {

    val name: String = inputName.trim()

    init {
        require(name.isNotEmpty() && name.length <= 5) { "사다리 게임의 실행 결과는 1글자에서 5글자 사이로 입력해야합니다." }
    }
}
