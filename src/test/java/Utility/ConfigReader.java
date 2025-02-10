package Utility;

import java.util.Properties;

public class ConfigReader {
    public final static Properties properties;

    static {
        properties = new Properties();
    }


    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
