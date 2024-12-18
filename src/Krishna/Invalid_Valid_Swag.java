package Krishna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Invalid_Valid_Swag extends Browsers
{

	
	//WebDriver driver;
/*
	@BeforeMethod
	public void OpenBrowser() {
		driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();

	}
	*/

	
	@Test
	public void InValidUserNameValidPassword() 
	{
		 driver.get("https://www.saucedemo.com/");
		// User Name:
		String Accepted_Usernames = "abcdefgh";
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys(Accepted_Usernames);
		// Thread.sleep(3000);
		// Password:
		// String Accepted_Password = "secret_sauce";
		String Accepted_Password = "secret_sauce";
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(Accepted_Password);
		// Thread.sleep(3000);
		// Login
		WebElement Login = driver.findElement(By.id("login-button"));
		Login.click();

	}
	/*
	@AfterMethod
	public void BrowserClose()
	{
		driver.close();
	}
	*/
}
