import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.safari.SafariDriver

// default driver
driver = {

}

atCheckWaiting = true
cacheDriver = false
autoClearCookies = false

waiting {
    timeout = 20
}

environments {


    chrome {

        driver = {
            new ChromeDriver()
        }
    }

    chromeHeadless {

        driver = {
            def options = new ChromeOptions()
            options.setHeadless(true)
            new ChromeDriver(options)
        }
    }

    safari {

        driver = {
            new SafariDriver()
        }
    }

    firefoxHeadless {

        atCheckWaiting = 1

        driver = {
            def options = new FirefoxOptions()
            options.setHeadless(true)
            new FirefoxDriver(options)
        }
    }

    firefox {

        atCheckWaiting = 1

        driver = { new FirefoxDriver() }
    }

    souceLabs {

        def username = Optional.ofNullable(System.getenv("SAUCE_USERNAME")).orElse("mtema")
        def accessKey = Optional.ofNullable(System.getenv("SAUCE_ACCESS_KEY")).orElse("5991966c-a0d9-4a2d-8411-50e9d9c015f7")
        def remoteUrl = "https://${username}:${accessKey}@ondemand.eu-central-1.saucelabs.com:443/wd/hub"

        def map = ["browserName": "Firefox", "platform": "Windows 10", "version": "42"]
        def capabilities = new DesiredCapabilities(map)

        capabilities.setCapability("newCommandTimeout", 180)
        capabilities.setCapability("extendedDebugging", true)


        driver = {
            new RemoteWebDriver(new URL(remoteUrl), capabilities)
        }
    }

}

// To run the tests with all browsers just run “./gradlew test”
baseUrl = "https://www.it-economics.com"
