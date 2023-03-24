package domain.player

class Player(inputName: String, var position: Int) {

    val name: String = inputName.trim()

    init {
        require(name.isNotEmpty() && name.length <= 5) { "사람 이름은 1글자에서 5글자 사이이어야 합니다." }
        require(0 <= position) { "사람의 위치는 자연수여야합니다." }
    }

    fun move(value: Int) {
        position += value
    }
}
