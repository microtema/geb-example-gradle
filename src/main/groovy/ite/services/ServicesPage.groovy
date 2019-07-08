package ite.services

import geb.Page

class ServicesPage extends Page {

    static url = "/services"

    static at = {
        title == "Services — it-economics"
    }

    static content = {
        units { $("div.col-units-9") }
    }

    void openDigitalTransformation() {

        units[0].click()
    }
}
