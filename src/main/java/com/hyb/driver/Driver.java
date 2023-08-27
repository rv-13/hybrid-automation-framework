package com.hyb.driver;

import com.hyb.config.factory.ConfigFactory;
import com.hyb.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public final class Driver {

    private Driver() {
    }

    static WebDriver driver = null;

    //LocalDriverFactory
    public static void initDriver() {
        WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
        driver.get("https://google.co.in");

    }

    public static void quitDriver() {
        driver.quit();
    }
}
