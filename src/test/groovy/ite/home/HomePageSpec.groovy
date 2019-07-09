package ite.home

import ite.BasePageGebSpec
import ite.career.CareerPage
import ite.company.CompanyPage
import ite.contact.ContactUsPage
import ite.references.ReferencesPage
import ite.search.SearchPage
import ite.services.ServicesPage

class HomePageSpec extends BasePageGebSpec {

    def "Navigate to company page"() {

        when: "You are on home page"
        def page = to HomePage

        and: "Open Company"
        page.mainNavigation.openCompany()

        then: "Check you see the company page"
        at CompanyPage
    }

    def "Navigate to services page"() {

        when: "You are on home page"
        def page = to HomePage

        and: "Open Services"
        page.mainNavigation.openServices()

        then: "Check you see the company page"
        at ServicesPage
    }

    def "Navigate to references page"() {

        when: "You are on home page"
        def page = to HomePage

        and: "Open References"
        page.mainNavigation.openReferences()

        then: "Check you see the references page"
        at ReferencesPage
    }

    def "Navigate to career page"() {

        when: "You are on home page"
        def page = to HomePage

        and: "Open Career"
        page.mainNavigation.openCareer()

        then: "Check you see the career page"
        at CareerPage
    }

    def "Navigate to contact us page"() {

        when: "You are on home page"
        def page = to HomePage

        and: "Open contact us"
        page.mainNavigation.openContactUs()

        then: "Check you see the contact us page"
        at ContactUsPage
    }

    def "Navigate to search page"() {

        when: "You are on home page"
        def page = to HomePage

        and: "Open search"
        page.mainNavigation.openSearch()

        then: "Check you see the search page"
        at SearchPage
    }
}
