package ite.career


import ite.BasePageGebSpec

class CareerPageTest extends BasePageGebSpec {

    def "Navigate to company page"() {

        when: "You are on company page"
        CareerPage page = to CareerPage

        and: "Open career with us"
        page.openYourCareerWithUs()

        then: "Check you see the pen career with us content"
        at CareerPage
    }

    def cleanup(){

        browser.quit()
    }
}
