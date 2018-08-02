package com.PackageCode.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class TestConfig {

    private static Config config;

    public static Config getInstance() {
        if (config == null)
        {
            config = ConfigFactory.load();
            String env = config.getString("env");
            config = config.getConfig(env.toLowerCase()).withFallback(config);
        }
        return config;
    }

}
