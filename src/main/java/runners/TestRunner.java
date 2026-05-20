package runners;

import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.DriverFactory;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepdefinitions","util"},
        tags = "",
        plugin = {"summary","pretty","html:reports/cucumberReport/Report.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
    static AppiumDriver driver= DriverFactory.getDriver();
}
