package com.hyb.tests;

import com.hyb.config.factory.BrowserStackConfigFactory;
import com.hyb.config.factory.ConfigFactory;
import com.hyb.driver.Driver;
import com.hyb.driver.factory.web.local.LocalDriverFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class DemoTests extends WebBase {
    @Test
    public void testLogin() {
        Driver.initDriver();
 //        System.out.println(
//                BrowserStackConfigFactory.getConfig().browserStackURL());

    }
}
