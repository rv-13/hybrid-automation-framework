package com.hyb.driver.factory.web.remote;

import com.hyb.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.hyb.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import com.hyb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackFactory {

    private BrowserStackFactory() {
    }

    private static final Map<BrowserType, Supplier<WebDriver>> MAP =
            new EnumMap<>(BrowserType.class);

    static {
        MAP.put(BrowserType.CHROME, BrowserStackChromeManager::getDriver);
        MAP.put(BrowserType.FIREFOX, BrowserStackFirefoxManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return MAP.get(browserType).get();

    }

}
