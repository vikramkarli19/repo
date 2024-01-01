package testRunners;

import org.testng.annotations.Listeners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.qameta.allure.testng.AllureTestNg;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions", // Replace with your actual steps package
        plugin = {
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
                "pretty",
                "json:target/cucumber-reports/cucumber.json"
        },
        dryRun = false,
        monochrome = true,
        tags = "@login"
)
@Listeners(AllureTestNg.class)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}