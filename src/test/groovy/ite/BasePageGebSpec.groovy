package ite


import geb.spock.GebReportingSpec

class BasePageGebSpec extends GebReportingSpec {

    def cleanup() { driver.quit() }
}
