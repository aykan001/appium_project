package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class DriverFactory {

    static AppiumDriver driver;
    static Properties properties;
    static DesiredCapabilities capabilities;

    public static AppiumDriver initializeDriver(String browser){

        properties=ConfigReader.getProperties();
        capabilities=new DesiredCapabilities();

        if (browser.equals("Android")){
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("udid","");
            capabilities.setCapability("appPackage","");
            capabilities.setCapability("appActivity","");
        } else if (browser.equals("IOS")) {
            capabilities.setCapability("platformName","IOS");
            capabilities.setCapability("udid","");
            capabilities.setCapability("appPackage","");
            capabilities.setCapability("appActivity","");
        }
        try {
            driver=new AppiumDriver(new URL("https://0.0.0.0.4723/wd/hub"),capabilities);
        }catch (MalformedURLException e){
            throw new RuntimeException(e);
        }
        int impWait=Integer.parseInt(properties.getProperty("implicityWait"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(impWait));
        return getDriver();
    }
    public static AppiumDriver getDriver(){
        return driver;
    }
}
