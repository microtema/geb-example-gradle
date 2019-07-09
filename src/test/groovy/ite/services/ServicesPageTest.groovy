package ite.services

import ite.BasePageGebSpec

class ServicesPageTest extends BasePageGebSpec {

    def "Navigate to service page"() {

        when: "You are on service page"
        def page = to ServicesPage

        and: "Open digital transformation"
        page.openDigitalTransformation()

        then: "Check you see the Digital Transformation content"
        at ServicesPage
    }
}
