package TestNG_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Swag_Labs_Login_VUVP 
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
		String Accepted_Password = "scfvbvhcjbh";
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(Accepted_Password);
		Thread.sleep(3000);
		// Login
		WebElement Login = driver.findElement(By.id("login-button"));
		Login.click();
		
	}
	
	@Test(priority=3)
	public void BrowserClose()
	{
		driver.close();
	}

}
