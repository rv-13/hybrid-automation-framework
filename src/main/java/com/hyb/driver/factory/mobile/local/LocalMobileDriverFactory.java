package com.hyb.driver.factory.mobile.local;

import com.hyb.driver.manager.mobile.local.AndroidManager;
import com.hyb.driver.manager.mobile.local.IOSManager;
import com.hyb.driver.manager.web.local.ChromeManager;
import com.hyb.driver.manager.web.local.FireFoxManager;
import com.hyb.enums.BrowserType;
import com.hyb.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalMobileDriverFactory {
    private LocalMobileDriverFactory() {
    }

    private static final Map<MobilePlatformType, Supplier<WebDriver>>
            MAP = new EnumMap<>(MobilePlatformType.class);
    private static final Supplier<WebDriver> CHROME = AndroidManager::getDriver;
    private static final Supplier<WebDriver> FIREFOX = IOSManager::getDriver;

    static {
        MAP.put(MobilePlatformType.ANDROID, CHROME);
        MAP.put(MobilePlatformType.IOS, FIREFOX);
    }

    public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {
        return MAP.get(mobilePlatformType).get();
    }


}
