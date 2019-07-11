package ite.company

import ite.BasePageGebSpec
import spock.lang.Unroll

class CompanyPageTest extends BasePageGebSpec {

    def "Navigate to company page"() {

        when: "You are on company page"
        def page = to CompanyPage

        and: "Open philosophy"
        page.openPhilosophy()

        then: "Check you see the philosophy content"
        at CompanyPage
    }

    /**
     *
     * NOTE: that when a test is Unrolled,
     *       spock-reports shows each iteration as a separate feature,
     *       unlike on the first report shown at the top of this blog post,
     *       where the test is example-based but not unrolled.
     */
    @Unroll
    def "Addition #x plus #y should be #result"() {

        expect: "#x + #y should equals #result"
        x + y == result

        where: "#x + #y = #result"
        x | y | result
        1 | 1 | 2
        1 | 2 | 3
        1 | 3 | 4
    }
}
