package Swag_Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage_TestResult 
{
WebDriver driver;
	
	@Test(priority=1)
	public void OpenBrowser()
	{
		  //Local 
		//Step1:Open Chrome Browser
		 driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		//Step2:Maximize Browser
		driver.manage().window().maximize();
			
	}
	
	@Test(priority=2)
	public void VUVP() throws InterruptedException 
	{
		//Step3:Enter Application URL
		 driver.get("https://www.saucedemo.com/");
		
		// Step4:Enter Valid UserName
		String Accepted_Usernames = "standard_user";
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys(Accepted_Usernames);
		Thread.sleep(3000);
		
		// Step5:Enter Valid Password
		
		String Accepted_Password = "secret_sauce";
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(Accepted_Password);
		Thread.sleep(3000);
		
		// Step6:Click on Login button
		WebElement Login = driver.findElement(By.id("login-button"));
		Login.click();
		
		String ExceptedURL="https://www.saucedemo.com/inventory.html";
		String ActualURL=driver.getCurrentUrl();
		
		//Test Result
		
		if(ExceptedURL.equalsIgnoreCase(ActualURL))
		{
			System.out.println("TC1: Pass");//TBS 
		}
		else
		{
			System.out.println("TC1: Fail"); //FBS 	
		}
		
	}
/*
	@Test(priority=3)
	public void BrowserClose()
	{
		driver.close();
	}
*/

}
