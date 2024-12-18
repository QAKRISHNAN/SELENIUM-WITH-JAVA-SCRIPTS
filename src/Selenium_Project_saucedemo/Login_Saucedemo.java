package Selenium_Project_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Saucedemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
			
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		//Enter Valid User Name
		String UserNameValid="standard_user";
		WebElement UserName=driver.findElement(By.id("user-name"));
		UserName.sendKeys(UserNameValid);
		
		//Enter Valid Password
		String PasswordValid="secret_sauce";
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys(PasswordValid);
		
		//Click on Login Button
		WebElement LoginButton=driver.findElement(By.xpath("//input[@name=\"login-button\"]"));
		LoginButton.click();
	
		

	}

}
