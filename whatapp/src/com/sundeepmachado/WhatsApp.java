package com.sundeepmachado;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeGroups;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WhatsApp {
AndroidDriver driver;

@BeforeMethod
//@BeforeGroups
public void setUp() throws MalformedURLException {
DesiredCapabilities capabilities= new DesiredCapabilities();
capabilities.setCapability("BROWSER_NAME”,“Android”);
capabilities.setCapability(“VERSION”,“4.2.2”);
capabilities.setCapability(“deviceName”,“Motorola”);
capabilities.setCapability(“platformNmae”,“Android”);

capabilities.setCapability("appPackage", "com.android.calculator2");
capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
}

@Test
public void testCal() throws Exception{
driver.findElement(By.id(“com.android.calculator2:id/digit2”)).click();
driver.findElement(By.id(“com.android.calculator2:id/plus”)).click();
driver.findElement(By.id(“com.android.calculator2:id/digit4”)).click();
driver.findElement(By.id(“com.android.calculator2:id/equal”)).click();
Assert.assertEquals(driver.findElement(By.className(“android.widget.EditText”)).getText(), “6”);

}


@AfterMethod
@AfterClass
public void tearDown(){
driver.quit();
}
}



