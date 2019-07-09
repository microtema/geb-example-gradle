package ite.contact

import ite.BasePageGebSpec

class ContactPageTest extends BasePageGebSpec {

    def "Navigate to contact us page"() {

        when: "You are on contact us page"
        def page = to ContactUsPage

        and: "contact us"
        page.contactUs()

        then: "Check you see the pen career with us content"
        at ContactUsPage
    }
}
