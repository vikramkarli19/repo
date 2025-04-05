package factory;

import Healper.PropertiesReader;
import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class DriverFactory {
    public Browser browser;
    public static BrowserContext context;
    public static Page page;
    private static  DriverFactory driverFactory;
    public static DriverFactory getDriverFactory(){
        if(driverFactory == null){
            synchronized (DriverFactory.class){
                if(driverFactory == null){
                    driverFactory = new DriverFactory();
                }
            }
        }
        return driverFactory;
    }

   public Page initDriver(String browserName){
       BrowserType browserType = null;
       boolean headless = Boolean.parseBoolean(PropertiesReader.browser_headless);
       switch (browserName){
           case "firefox":
               browserType = Playwright.create().firefox();
               browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(headless));

           case "chromium":
               browserType = Playwright.create().chromium();
               browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(headless));

           case "webkit":
               browserType = Playwright.create().webkit();
               browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(headless));
       }
       if(browserType==null)
           throw new IllegalArgumentException("Could not the Browser");
       context=browser.newContext(new Browser.NewContextOptions()
               .setRecordVideoDir(Paths.get("recordings/videos"))
               .setRecordVideoSize(1280,720)
       );
       page = context.newPage();
       return page;
   }
}
