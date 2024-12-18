package TestNG_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Swag_Labs_Login_VUVP_TestResult 
{
	WebDriver driver;
	
	@Test(priority=1)
	public void OpenBrowser()
	{
		  //Local 
		 driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
			
	}
	
	@Test(priority=2)
	public void VUVP() throws InterruptedException 
	{
		
		 driver.get("https://www.saucedemo.com/");
		
		// User Name:
		String Accepted_Usernames = "standard_user";
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys(Accepted_Usernames);
		Thread.sleep(3000);
		// Password:
		//String Accepted_Password = "secret_sauce";
		String Accepted_Password = "secret_sauce";
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(Accepted_Password);
		Thread.sleep(3000);
		// Login
		WebElement Login = driver.findElement(By.id("login-button"));
		Login.click();
		
		String ExceptedTitle="Swag Labs";
		String ActualTitle=driver.getTitle();
		
		System.out.println("Excepted Title: "+ExceptedTitle);
		System.out.println("Actual Title: "+ ActualTitle);
						
		if(ExceptedTitle.equalsIgnoreCase(ActualTitle)) //T
		{
			System.out.println("Test Case is Pass");  //TBS 
			}
		else
		{
			System.out.println("Test Case is Fail"); //FBS 
		}
		
	}
	
	@Test(priority=3)
	public void BrowserClose()
	{
		driver.close();
	}

}
