package ite.services

import geb.spock.GebReportingSpec

class ServicesPageTest extends GebReportingSpec {

    def "Navigate to service page"() {

        when: "You are on service page"
        ServicesPage page = to ServicesPage

        and: "Open digital transformation"
        page.openDigitalTransformation()

        then: "Check you see the Digital Transformation content"
        at ServicesPage
    }

    def cleanup() {
        browser.quit()
    }
}
