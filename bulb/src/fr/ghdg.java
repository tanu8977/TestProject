package fr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import hgf.ExcelDataConfig;

public class ghdg {
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	//"C:\Users\tanuj.000\Downloads\geckodriver-v0.16.1-win64\geckodriver.exe"
	
	@Test
	public void loginApplication()
	{
		//report=new ExtentReports("");
		//logger=report.startTest("Test1VerifyBlogTitle");
		//logger.log(LogStatus.INFO, "Browser started");
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//FirefoxOptions firefoxOptions = new FirefoxOptions();
    	//firefoxOptions.setAcceptInsecureCerts(true);
    	//firefoxOptions.setLogLevel(FirefoxDriverLogLevel.TRACE);
    	//FirefoxDriver firefoxDriver = new FirefoxDriver(firefoxOptions);
		//binary = FirefoxBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
	//	driver = webdriver.Firefox();
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.26.0-win64//geckodriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.mercuryholidays.co.uk");
		//logger.log(LogStatus.INFO, "Application");
		String title= driver.getTitle();
		Assert.assertTrue(title.contains("Selenium"));
		//logger.log(LogStatus.PASS,"Title Verified");
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("ngvg");
		WebElement month_dropdown=driver.findElement(By.xpath(".//*[@id='RegionID']"));
		logger.log(LogStatus.INFO, "Region");
		Select month_dd=new Select(month_dropdown);
		month_dd.selectByVisibleText("Bali");
		WebElement month_dropdown1=driver.findElement(By.xpath("//input[@id='departureDate']"));
		Select month_dt=new Select(month_dropdown1);
	month_dt.selectByVisibleText("Airport");
        driver.findElement(By.xpath("//*[@id='SearchFormClickTag']")).click();

}

	@DataProvider(name="wordpressData")
	public Object[][] passData()
	{
		ExcelDataConfig config=new ExcelDataConfig("C:\\Users\\tanuj.000\\workspace\\ecli\\testdata");
		int rows=config.getRowCount(0);
		Object[][] data=new Object[rows][2];
		for(int i=0;i<rows;i++)
		{
			data[i][0]=config.getData(0, i, 0);
			data[i][1]=config.getData(0, i, 0);
		}
		
		return data;
		
	}
	}

	



