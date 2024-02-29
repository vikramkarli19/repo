package Healper;


import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class driverSetup {

    final  static ChromeOptions chromeOptions = new ChromeOptions();
    public  static  WebDriver driver;

    public static WebDriver setDriver(){
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--ignore-certificare-errors");
        chromeOptions.addArguments("--silient");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--test-type");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        chromeOptions.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS);
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().clearResolutionCache().setup();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        return driver;

    }
}
