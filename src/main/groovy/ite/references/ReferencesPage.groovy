package ite.references

import geb.Page

class ReferencesPage extends Page {

    static url = "/projects"

    static at = {
        title == "References — it-economics"
    }

    static content = {
        units { $("div.col-units-3") }
    }

    void openProjects() {
        units[0].click()
    }
}
