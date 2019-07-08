package ite.contact

import geb.Page

class ContactUsPage extends Page {

    static url = "/contact-us"

    static at = {
        title == "Contact us — it-economics"
    }

    static content = {
        form { $("form") }
    }

    void contactUs() {

        form.with {
            fname = "test"
            lname = "test"
            email = "foo@bar.de"
        }

        form.find("textarea", 0).value("Some description")
    }
}
