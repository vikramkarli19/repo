package Healper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class support  {
    private  WebDriver driver;

    @FindBy(xpath = "//span[text()='Sign in']")
    private WebElement signIn;
    public void setup(){
        driver = driverSetup.setDriver();
        driver.get("https://www.amazon.in/");
    }

    public void login(){
        signIn.click();
    }

}
