package Shyam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Browsers 
{
	public WebDriver driver;

	@BeforeClass
	
	public void OpenBrowser() {
		driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	@AfterClass
	//@AfterSuite
	public void BrowserClose()
	{
		driver.close();
	}
	
}
