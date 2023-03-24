package domain.ladder

import kotlin.random.Random

class Ladder(height: Int, width: Int) {

    val value: List<Int>

    init {
        require(width <= height) { "사다리의 높이는 열의 개수 이상이어야 합니다." }
        require(0 < height) { "사다리의 높이는 자연수이어야 합니다." }

        val tmpValue: MutableList<Int> = ArrayList()
        for (i in 1..height) {
            tmpValue.add(Random.nextInt(width - 1))
        }
        value = tmpValue
    }
}
