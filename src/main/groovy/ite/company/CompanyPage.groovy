package ite.company

import geb.Page

class CompanyPage extends Page {

    static url = "/company"

    static at = {
        title == "Company — it-economics"
    }

    static content = {
        units { $("div.col-units-5") }
    }

    void openPhilosophy() {

        units[0].click()
    }
}
