package com.hyb.config.factory;

import com.hyb.config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {
    private ConfigFactory() {
    }

    public static FrameworkConfig getConfig() {
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }


}
