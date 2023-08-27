package com.hyb.driver.factory.web.remote;

import com.hyb.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.hyb.driver.manager.web.remote.selenium.SeleniumGridFirefoxManager;
import com.hyb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {

    private SeleniumGridFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType ==  BrowserType.CHROME ? SeleniumGridChromeManager.getDriver()
                : SeleniumGridFirefoxManager.getDriver();


    }

}
