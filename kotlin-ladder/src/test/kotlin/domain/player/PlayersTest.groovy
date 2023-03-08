package domain.player

import spock.lang.Specification
import spock.lang.Unroll

class PlayersTest extends Specification {

    @Unroll
    def "이름이 중복된 경우 생성 예외 테스트"() {
        given:
        def inputNames = new ArrayList()
        inputNames.add("name")
        inputNames.add("name")

        when:
        new Players(inputNames)

        then:
        thrown(IllegalArgumentException)
    }
}
