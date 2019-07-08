package ite.career

import geb.Page

class CareerPage extends Page {

    static url = "/careers"

    static at = {
        title == "Career — it-economics"
    }

    static content = {
        units { $("div.col-units-3") }
    }

    void openYourCareerWithUs() {
        units[0].click()
    }
}
