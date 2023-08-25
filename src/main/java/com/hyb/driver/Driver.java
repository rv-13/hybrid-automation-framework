package com.hyb.driver;

import org.openqa.selenium.WebDriver;

public class Driver {
    static WebDriver driver = null;

    public static void initDriver() {
        WebDriver driver = LocalDriverFactory.getDriver();
        driver.get("https://google.co.in");

    }

    public static void quitDriver() {
        driver.quit();
    }
}
