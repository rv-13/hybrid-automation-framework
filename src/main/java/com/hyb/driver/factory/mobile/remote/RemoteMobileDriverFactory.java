package com.hyb.driver.factory.mobile.remote;

import com.hyb.driver.factory.web.remote.BrowserStackFactory;
import com.hyb.driver.factory.web.remote.RemoteDriverFactory;
import com.hyb.driver.factory.web.remote.SeleniumGridFactory;
import com.hyb.driver.factory.web.remote.SelenoidFactory;
import com.hyb.enums.BrowserRemoteModeType;
import com.hyb.enums.BrowserType;
import com.hyb.enums.MobilePlatformType;
import com.hyb.enums.MobileRemoteModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteMobileDriverFactory {
    private RemoteMobileDriverFactory() {

    }

    private static final Map<MobileRemoteModeType, Function<MobilePlatformType, WebDriver>> MAP =
            new EnumMap<>(MobileRemoteModeType.class);
//    private static final Function<MobileRemoteModeType, WebDriver> SAUCE_LABS =mobileRemoteModeType -> getDriver();
//    private static final Function<MobileRemoteModeType, WebDriver> BROWSER_STACK = BrowserStackMobileFactory::getDriver;

    static {
//        MAP.put(MobileRemoteModeType.SAUCE_LABS, MO);
        MAP.put(MobileRemoteModeType.BROWSER_STACK, BrowserStackMobileFactory::getDriver);
    }

    public static WebDriver getDriver(MobileRemoteModeType mobileRemoteModeType, MobilePlatformType mobilePlatformType) {
        return MAP.get(mobileRemoteModeType).apply(mobilePlatformType);
    }
}
