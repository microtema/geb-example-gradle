package ite.contact

import geb.spock.GebSpec
import ite.career.CareerPage

class ContactPageTest extends GebSpec {

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
