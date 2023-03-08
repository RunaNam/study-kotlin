package domain.player

import spock.lang.Specification
import spock.lang.Unroll

class PlayerTest extends Specification {

    @Unroll
    def "#testcase의 경우 생성 예외 테스트"() {
        when:
        new Player(name, position)

        then:
        thrown(IllegalArgumentException)

        where:
        testcase    | name          | position
        "이름이 0자"    | ""            | 1
        "이름이 5자 초과" | "1".repeat(6) | 1
        "위치가 0 미만"  | "1".repeat(3) | -1
    }
}
