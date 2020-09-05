package defaultpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class DialaNumber {
	AndroidDriver dr;
	@Test
	public void call() throws MalformedURLException, InterruptedException {


	DesiredCapabilities dc = new DesiredCapabilities();
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("Automation_Name", "UiAutomator");
	capabilities.setCapability("VERSION", "v1.17.1"); 
	capabilities.setCapability("deviceName","VSCQ9LGQA6WG7HA6");
	capabilities.setCapability("platformName","Android");
	//caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, “uiAutomator2”);
	//capabilities.setCapability("Automation_Name", "Appium");
	//automationName: 'UiAutomator2
	//capabilities.setCapability("platfo","Android");
	
	//automationName=UiAutomator1

    dc.setCapability("appPackage", "com.android.dialer");
    dc.setCapability("appActivity", "com.android.dialer.DialtactsActivity"); // This is Launcher activity of your app
                                                                            // (you can get it from apk info app)
   // dr = new AndroidDriver(new URL("http://127.0.0.1:4721/wd/hub"),capabilities);
    URL url = new URL("http://127.0.0.1:4721/wd/hub");

    AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);

   // Thread.sleep(5000);
   // driver.findElement(By.id("com.android.dialer:id/dialtacts_mainlayout")).click();
   // driver.findElement(By.id("com.android.dialer:id/floating_action_button")).click();
    driver.findElementById("com.android.dialer:id/floating_action_button").click();
    //com.android.dialer:id/floating_action_button
    //com.android.dialer:id/floating_action_button
    //com.android.dialer:id/floating_action_button
    //com.android.dialer:id/floating_action_button
    //com.android.dialer:id/floating_action_button
    //com.android.dialer:id/dialpad_key_number
    //com.android.dialer:id/dialpad_key_number
    //com.android.dialer:id/dialpad_key_number
    //com.android.dialer:id/floating_action_button
    //com.android.dialer:id/five
 //   com.android.dialer:id/nine
    //com.android.dialer:id/eight
   // driver.findElementById("com.android.dialer:id/dialpad_key_nin").click();
  // driver.findElement(By.id("com.android.dialer:id/five")).click();
    //driver.findElementById("com.android.dialer:id/three").click();
    //driver.findElementById("com.android.dialer:id/two").click();
   //driver.findElementById("com.android.dialer:id/one").click();
    //driver.findElementById("com.android.dialer:id/dialpad_floating_action_button").click();
    
    //Thread.sleep(3000);
}
}


