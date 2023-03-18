package domain.prize


import spock.lang.Specification
import spock.lang.Unroll

class PrizesTest extends Specification {

    @Unroll
    def "상품 개수가 맞지 않는 경우 예외 케이스 테스트"() {
        given:
        def inputNames = new ArrayList()
        inputNames.add("name")

        when:
        new Prizes(inputNames, 2)

        then:
        thrown(IllegalArgumentException)
    }
}
