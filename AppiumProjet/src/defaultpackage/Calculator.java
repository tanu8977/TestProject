package defaultpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("Automation_Name", "Appium");
    	capabilities.setCapability("VERSION", "v1.17.1"); 
    	capabilities.setCapability("deviceName","Android");
    	capabilities.setCapability("platformName","Android");

        dc.setCapability("appPackage", "com.tct.calculator");
        dc.setCapability("appActivity", "com.android.calculator.Calculator"); // This is Launcher activity of your app
                                                                                // (you can get it from apk info app)

        URL url = new URL("http://127.0.0.1:4721/wd/hub");

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);

        Thread.sleep(5000);

        // locate the Text on the calculator by using By.name()
        WebElement seven = driver.findElementById("com.android.calculator:id/digit_7");
        seven.click();
        WebElement plus = driver.findElementById("com.android.calculator:id/op_add");
        plus.click();
        WebElement three = driver.findElementById("com.android.calculator:id/digit_3");
        three.click();
        WebElement equalTo = driver.findElementById("com.android.calculator:id/eq");
        equalTo.click();

        // locate the edit box
        WebElement results = driver.findElementById("com.android.calculator:id/result");

        if(results.getText().equals("10"))
        {
            System.out.println("Test Passed...");
        }
        else
        {
            System.out.println("Test Failed...");
        }
    }

}

