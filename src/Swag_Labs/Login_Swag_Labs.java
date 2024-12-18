package Swag_Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login_Swag_Labs 
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		 Thread.sleep(3000);
		 
		driver.manage().window().maximize();
		 Thread.sleep(3000);
		driver.get("https://www.saucedemo.com/");
				
		 Thread.sleep(3000);
		//User Name:
		String Accepted_Usernames="standard_user";
		WebElement UserName=driver.findElement(By.id("user-name"));
		UserName.sendKeys(Accepted_Usernames);
		Thread.sleep(3000);
		//Password:
		String Accepted_Password="secret_sauce";
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys(Accepted_Password);
		Thread.sleep(3000);
		//Login
		WebElement Login=driver.findElement(By.id("login-button"));
		Login.click();
		

	}

}
