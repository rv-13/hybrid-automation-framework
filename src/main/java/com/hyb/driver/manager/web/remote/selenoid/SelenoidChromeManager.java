package com.hyb.driver.manager.web.remote.selenoid;

import com.hyb.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SelenoidChromeManager {
    private SelenoidChromeManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browserVersion", "116.0");
        capabilities.setCapability("enableVNC", "true");
        capabilities.setCapability("enableVideo", "false");
        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(), capabilities);
    }
}
