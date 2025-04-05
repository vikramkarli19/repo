package Healper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class PropertiesReader {
    private Properties properties;
    public static String enviroments;

    public PropertiesReader(String filePath) {
        properties = new Properties();
        try (InputStream input = new FileInputStream(filePath)) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
    public static void load() {
        // Provide the path to your config.properties file
        PropertiesReader reader = new PropertiesReader("config.properties");

        // Retrieve properties
        enviroments = reader.getProperty("Enviroment");

    }


}
