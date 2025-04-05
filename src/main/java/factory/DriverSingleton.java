package factory;

import Healper.PropertiesReader;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.io.IOException;

public class DriverSingleton {
    private static Playwright playwright;
    private static Browser browser;
    private static Page page;
    public DriverFactory driverFactory = new DriverFactory();
    PropertiesReader propertiesReader = new PropertiesReader();

    // Private constructor to prevent instantiation
    public DriverSingleton() {
    }

    // Synchronized method to get the instance of DriverSingleton
    public synchronized Page getPage() throws IOException {
        if (page == null) {
            if (playwright == null) {
                PropertiesReader.loadProperties();
                String browserName = PropertiesReader.browser;
                System.out.println("Using Browser: " + browserName); // Debug log
                page = driverFactory.initDriver(browserName);
            }
        }
        return page;
    }

    // Method to close the browser and playwright instance
    public static synchronized void close() {
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }
}