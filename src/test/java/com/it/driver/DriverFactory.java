package com.it.driver;

import com.it.common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
   /* public static final String USERNAME = "smilyk1";
    public static final String AUTOMATE_KEY = "1UmSFBb6C64GssL6wDjo";
    public static final String URL1 = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";*/
    public static RemoteWebDriver getDriver() {
        RemoteWebDriver driver;
        String name = System.getProperty("driver");
        if (name == null || "chrome".equals(name)) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if ("gecko".equals(name)) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if ("edge".equals(name)) {
            System.setProperty("webdriver.edge.driver", "drivers/MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        } else {
            throw new UnsupportedOperationException();
        }
        driver.manage().window().fullscreen();
       /* DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "75.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1024x768");
        caps.setCapability("name", "Bstack-[Java] Sample Test");

        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL(URL1), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }*/
        driver.get(Constants.BASE_URL);
        return driver;
    }
}
