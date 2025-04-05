package Hooks;

import Healper.PropertiesReader;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import factory.DriverFactory;
import factory.DriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import factory.DriverFactory;

import java.io.IOException;

public class Hooks  {
    WebDriver driver;
    private static DriverSingleton driverSingleton = new DriverSingleton();
    public static Page page;
    public WebDriver driverManager(){
        WebDriverManager.chromedriver().setup();
        // Initialize the WebDriver
        driver = new ChromeDriver();
        return driver;
    }

    @Before()
    public static void Setup(Scenario scenario) throws IOException {
        scenario.getName();
        PropertiesReader.loadProperties();
        page = driverSingleton.getPage();

    }

    @After("@teardown")
    public void teardown() {
        // Custom teardown logic
        driver.quit();
        System.out.println("This hook runs after scenarios with @teardown tag.");
    }
}
