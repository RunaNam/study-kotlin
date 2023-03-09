package view

object InputView {

    fun inputPlayerNames(): List<String> {
        println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)")
        return readln().split(",")
    }

    fun inputHeight(): Int {
        println("최대 사다리 높이는 몇 개인가요?")
        val input = readln()
        require(input.toIntOrNull() != null) { "사다리의 높이는 숫자여야 합니다." }
        return input.toInt()
    }
}
