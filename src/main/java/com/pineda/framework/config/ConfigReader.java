package com.pineda.framework.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;
    private static final String CONFIG_PATH = "src/main/resources/config.properties";

    static {
        try {
            properties = new Properties();
            FileInputStream fis = new FileInputStream(CONFIG_PATH);
            properties.load(fis);
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String property) {
        return properties.getProperty(property);
    }
}
