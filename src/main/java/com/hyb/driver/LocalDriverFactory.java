package com.hyb.driver;

import com.hyb.config.ConfigFactory;
import com.hyb.driver.manager.ChromeManager;
import com.hyb.driver.manager.FireFoxManager;
import com.hyb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory() {
    }

    public static WebDriver getDriver() {
        WebDriver driver = null;
        if (isBrowseChrome()) driver = ChromeManager.getDriver();
        else driver = FireFoxManager.getDriver();
        return driver;
    }

    private static boolean isBrowseChrome() {
        return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }


}
