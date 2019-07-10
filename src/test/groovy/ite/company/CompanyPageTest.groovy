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
    def "Map #key to #value"() {

        setup: "Create a map with 3 entries"
        def map = ["foo": "bar", "one": "1", "two": "2"]

        expect: "Match key: #key within map value: #value"
        map[key] == value

        where: "#key to #value"
        key   | value
        "foo" | "bar"
        "one" | "1"
        "two" | "2"
    }
}
