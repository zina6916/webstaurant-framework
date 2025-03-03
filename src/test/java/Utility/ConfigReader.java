package Utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Properties;

public class ConfigReader {
    public final static Properties properties;

    static {
        properties = new Properties();
        try{
            properties.load(new BufferedReader(new FileReader("config.properties")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
