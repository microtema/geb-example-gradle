package ite.references

import ite.BasePageGebSpec
import spock.lang.Issue

class ReferencesPageTest extends BasePageGebSpec {

    @Issue("http://jira.ag.com/AGT-102")
    def "Navigate to references page"() {

        when: "You are on references page"
        def page = to ReferencesPage

        and: "Open projects"
        page.openProjects()

        then: "Check you see the projects content"
        at ReferencesPage
    }
}
