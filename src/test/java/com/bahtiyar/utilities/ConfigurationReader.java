package com.bahtiyar.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();
    static {
        String path = "configuration.properties";
        try {
            FileInputStream file = new FileInputStream( path );
            properties.load( file );
            file.close();
        } catch (Exception e) {
            System.out.println("Properties file not found.");
        }

    }
    public static String getProperty(String KeyWord){
        return properties.getProperty( KeyWord );
    }

}
