package com.hyb.driver.manager.web.remote.selenium;

import com.hyb.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.openqa.selenium.remote.Browser.CHROME;

public final class SeleniumGridChromeManager {

    private SeleniumGridChromeManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(CHROME.browserName());
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), capabilities);
    }
}
