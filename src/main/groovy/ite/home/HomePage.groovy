package ite.home

import geb.Page
import ite.navigation.NavigationModule

class HomePage extends Page {

    static url = "/"

    static at = {
        title == "it-economics"
    }

    static content = {
        mainNavigation {
            module NavigationModule
        }
    }
}
