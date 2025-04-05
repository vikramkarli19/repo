package Healper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    public static String enviroments;
    public static String browser;
    public static String browser_headless;
    public static void loadProperties() throws IOException {
        Properties configProperties = new Properties();
        configProperties.load(new FileInputStream("src/main/resources/config.properties"));
        enviroments = configProperties.getProperty("Enviroment");
        browser = configProperties.getProperty("Browser");
        browser_headless = configProperties.getProperty("BrowserHeadless");


    }
}
