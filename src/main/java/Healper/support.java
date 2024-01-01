package Healper;

import lib.Hooks;
import org.openqa.selenium.WebDriver;

public class support extends Hooks {
    WebDriver driver;
    public void openBrowser(){
        driver = driverManager();
        driver.get("https://www.youtube.com/");
    }
}
