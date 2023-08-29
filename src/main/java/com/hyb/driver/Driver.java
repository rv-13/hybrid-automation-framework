package com.hyb.driver;

import com.hyb.config.factory.ConfigFactory;
import com.hyb.driver.factory.web.local.LocalDriverFactory;
import com.hyb.driver.factory.web.remote.RemoteDriverFactory;
import com.hyb.enums.BrowserRemoteModeType;
import org.openqa.selenium.WebDriver;

public final class Driver {

    private Driver() {
    }

//    static WebDriver driver = null;

    //local web , remote web,  local mobile , remote mobile
    //LocalDriverFactory
    public static void initDriver() {
        WebDriver driver =
                RemoteDriverFactory.getDriver
                        (ConfigFactory.getConfig().browserRemoteModeType(), ConfigFactory.getConfig().browser());
        driver.get("https://google.co.in");
        driver.quit();
    }

    public static void quitDriver() {
//        driver.quit();
    }
}
