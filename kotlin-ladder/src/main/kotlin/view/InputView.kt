package view

object InputView {

    fun inputPlayerNames(): List<String> {
        println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)")
        return readln().split(",")
    }
}