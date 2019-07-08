package ite.contact

import geb.spock.GebReportingSpec

class ContactPageTest extends GebReportingSpec {

    def "Navigate to contact us page"() {

        when: "You are on contact us page"
        ContactUsPage page = to ContactUsPage

        and: "contact us"
        page.contactUs()

        then: "Check you see the pen career with us content"
        at ContactUsPage
    }

    def cleanup(){
        browser.quit()
    }
}
