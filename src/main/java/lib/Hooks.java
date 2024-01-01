package lib;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks  {
    WebDriver driver;
    @Before("@setup")
    public WebDriver driverManager(){
        WebDriverManager.chromedriver().setup();
        // Initialize the WebDriver
        driver = new ChromeDriver();
        return driver;
    }

    @After("@teardown")
    public void teardown() {
        // Custom teardown logic
        driver.quit();
        System.out.println("This hook runs after scenarios with @teardown tag.");
    }
}
