package ite.career

import geb.spock.GebReportingSpec

class CareerPageTest extends GebReportingSpec {

    def "Navigate to company page"() {

        when: "You are on company page"
        CareerPage page = to CareerPage

        and: "Open career with us"
        page.openYourCareerWithUs()

        then: "Check you see the pen career with us content"
        at CareerPage
    }

    def cleanup(){
        browser.quit()
    }
}
