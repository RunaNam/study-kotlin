package domain.ladder

import spock.lang.Specification
import spock.lang.Unroll

class LadderTest extends Specification {

    @Unroll
    def "#testcase의 경우 예외테스트"() {
        when:
        new Ladder(height, width)

        then:
        thrown(IllegalArgumentException)

        where:
        testcase       | height | width
        "높이가 열의 개수 미만" | 1      | 2
        "높이가 0 이하"     | 0      | 0
    }
}
