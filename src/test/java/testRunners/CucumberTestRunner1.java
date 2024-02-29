package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;

@CucumberOptions(
        features = "@target/failed.txt",
        glue = "stepDefinitions", // Replace with your actual steps package
        plugin = {
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
                "pretty",
                "json:target/cucumber-reports/cucumber.json",
                "rerun:target/failed.txt"
        },
        dryRun = false,
        monochrome = true,
        tags = "@login"
)
@Listeners(AllureTestNg.class)
public class CucumberTestRunner1 extends AbstractTestNGCucumberTests {
}