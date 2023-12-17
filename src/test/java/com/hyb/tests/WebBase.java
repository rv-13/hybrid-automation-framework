package com.hyb.tests;

import com.hyb.driver.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class WebBase {

    @BeforeMethod
    public void setUp() {
        Driver.initDriver();

    }

}
