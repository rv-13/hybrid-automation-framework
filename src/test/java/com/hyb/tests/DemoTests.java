package com.hyb.tests;

import com.hyb.config.ConfigFactory;
import com.hyb.config.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigCache;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTests {
    @Test
    public void testLogin() {
        System.out.println(ConfigFactory.getConfig().browser());
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.co.in");
//        driver.quit();
    }
}
