package domain.prize


import spock.lang.Specification
import spock.lang.Unroll

class PrizeTest extends Specification {

    @Unroll
    def "#testcase의 경우 생성 예외 테스트"() {
        when:
        new Prize(name)

        then:
        thrown(IllegalArgumentException)

        where:
        testcase    | name
        "이름이 0자"    | ""
        "이름이 5자 초과" | "1".repeat(6)
    }
}
