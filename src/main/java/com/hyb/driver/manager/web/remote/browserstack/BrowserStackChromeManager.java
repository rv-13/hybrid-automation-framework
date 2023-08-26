package com.hyb.driver.manager.web.remote.browserstack;

import com.hyb.config.factory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackChromeManager {
    private BrowserStackChromeManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browser_Version", "chrome");
        capabilities.setCapability("os", "windows");
        capabilities.setCapability("os_version", "10");
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), capabilities);
    }
}
