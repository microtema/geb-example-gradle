package ite.navigation

import geb.Module

class NavigationModule extends Module {

    static content = {
        nav { $("nav.main-nav") }
        links { nav.find("li.showcase-index-collection") }
        search { nav.find("li.external-link") }
    }

    void openCompany() {

        links[0].click()
    }

    void openServices() {

        links[1].click()
    }

    void openReferences() {

        links[2].click()
    }

    void openCareer() {

        links[3].click()
    }

    void openContactUs() {

        links[4].click()
    }

    void openSearch() {

        search.first().click()
    }
}
