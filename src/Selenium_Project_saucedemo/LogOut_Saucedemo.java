package Selenium_Project_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOut_Saucedemo {

	public static void main(String[] args) throws InterruptedException {
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
		//Thread.sleep(2000);
		
		//Click on Memu Button
		WebElement MenuButton=driver.findElement(By.id("react-burger-menu-btn"));
		MenuButton.click();
		Thread.sleep(2000);
		
		//Click on LogOut Button
		WebElement LogOutButton=driver.findElement(By.id("logout_sidebar_link"));
		LogOutButton.click();
		Thread.sleep(2000);

	}

}
