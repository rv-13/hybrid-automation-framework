package com.hyb.driver.web.remote;

import com.hyb.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.hyb.driver.manager.web.remote.selenoid.SelenoidFirefoxManager;
import com.hyb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SelenoidFactory {
    private SelenoidFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME ?
                SelenoidChromeManager.getDriver()
                : SelenoidFirefoxManager.getDriver();

    }
}
