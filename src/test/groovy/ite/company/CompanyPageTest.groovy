package ite.company

import geb.spock.GebSpec

class CompanyPageTest extends GebSpec {

    def "Navigate to company page"() {

        when: "You are on company page"
        CompanyPage page = to CompanyPage

        and: "Open philosophy"
        page.openPhilosophy()

        then: "Check you see the philosophy content"
        at CompanyPage
    }

    def cleanup(){
        browser.quit()
    }
}
