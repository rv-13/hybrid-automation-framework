package com.hyb.driver.web.remote;

import com.hyb.enums.BrowserRemoteModeType;
import com.hyb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteDriverFactory {
    private RemoteDriverFactory() {

    }

    private static final Map<BrowserRemoteModeType, Function<BrowserType, WebDriver>> MAP =
            new EnumMap<>(BrowserRemoteModeType.class);
    private static final Function<BrowserType, WebDriver> SELENIUM = SeleniumGridFactory::getDriver;
    private static final Function<BrowserType, WebDriver> SELENOID = SelenoidFactory::getDriver;
    private static final Function<BrowserType, WebDriver> BROWSER_STACK = BrowserStackFactory::getDriver;

    static {
        MAP.put(BrowserRemoteModeType.SELENIUM, SELENIUM);
        MAP.put(BrowserRemoteModeType.SELENOID, SELENOID);
        MAP.put(BrowserRemoteModeType.BROWSER_STACK, BROWSER_STACK);
    }

    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType) {
        return MAP.get(browserRemoteModeType).apply(browserType);
    }
}
