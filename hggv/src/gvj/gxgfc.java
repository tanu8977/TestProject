package gvj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gxgfc {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		//"C:\Users\tanuj.000\Downloads\geckodriver-v0.16.1-win64\geckodriver.exe"
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.mercuryholidays.co.uk");
		

	}

}



