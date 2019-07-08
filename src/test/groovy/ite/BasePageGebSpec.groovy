package ite

import com.saucelabs.common.SauceOnDemandAuthentication
import com.saucelabs.common.SauceOnDemandSessionIdProvider
import geb.spock.GebReportingSpec
import groovy.json.JsonSlurper
import org.junit.Rule
import org.junit.rules.TestName
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.safari.SafariDriver

class BasePageGebSpec extends GebReportingSpec implements SauceOnDemandSessionIdProvider {

    private String username = Optional.ofNullable(System.getenv("SAUCE_USERNAME")).orElse("mtema")
    private String accessKey = Optional.ofNullable(System.getenv("SAUCE_ACCESS_KEY")).orElse("5991966c-a0d9-4a2d-8411-50e9d9c015f7")

    private String sessionId

    public SauceOnDemandAuthentication authentication = new SauceOnDemandAuthentication(username, accessKey)

    @Rule
    public SpecialSauceOnDemandTestWatcher resultReportingTestWatcher = new SpecialSauceOnDemandTestWatcher(this, username, accessKey, true)

    @Rule
    public TestName testNameRule = new TestName() {
        String getMethodName() {
            return super.getMethodName()
        }
    }

    @Override
    String getSessionId() { return sessionId }

    @Override
    void setup() throws Exception {

        def driverType = System.getProperty("geb.env")
        def capabilityString = '{"browserName": "Firefox", "platform": "Windows 10", "version": "42"}'

        if (driverType == "sauce") {

            Map<String, String> capMap = new JsonSlurper().parseText(capabilityString)

            DesiredCapabilities capabilities = new DesiredCapabilities(capMap)

            String methodName = testNameRule.getMethodName()
            String specName = this.class.getSimpleName()
            capabilities.setCapability("testNameRule", String.format("%s.%s", specName, methodName))
            capabilities.setCapability("newCommandTimeout", 180)

            capabilities.setCapability("extendedDebugging", true)

            //capabilities.setCapability("username", authentication.getUsername());
            //capabilities.setCapability("accessKey", authentication.getAccessKey());


            def remoteUrl = "https://" + authentication.getUsername() + ":" + authentication.getAccessKey() + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub"
            //remoteUrl = "https://ondemand.eu-central-1.saucelabs.com/wd/hub";
            driver = new RemoteWebDriver(new URL(remoteUrl), capabilities)

            this.sessionId = (((RemoteWebDriver) driver).getSessionId()).toString()

        } else if (driverType == "safari") {

            driver = new SafariDriver()
        } else if (driverType == "chrome") {

            driver = new ChromeDriver()
        } else if (driverType == "chromeHeadless") {
            ChromeOptions o = new ChromeOptions()
            o.addArguments('headless')
            driver = new ChromeDriver(o)
        } else {

            driver = new FirefoxDriver()
        }
    }

    @Override
    void cleanup() throws Exception { driver.quit() }

}
