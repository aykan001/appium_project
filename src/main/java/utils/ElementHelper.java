package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {
    AppiumDriver driver;
    WebDriverWait wait;
    Actions actions;

    public ElementHelper(AppiumDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions=new Actions(driver);
    }

}
