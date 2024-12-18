package Swag_Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOut_Swag_Labs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//User Name:
		String Accepted_Usernames="standard_user";
		WebElement UserName=driver.findElement(By.id("user-name"));
		UserName.sendKeys(Accepted_Usernames);
	
		//Password:
		String Accepted_Password="secret_sauce";
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys(Accepted_Password);
		
		//Login
		WebElement Login=driver.findElement(By.id("login-button"));
		Login.click();
		
		//Options DropDown
		WebElement OptionsDropDown=driver.findElement(By.id("react-burger-menu-btn"));
		OptionsDropDown.click();
        Thread.sleep(3000);
		//LogOut Button
		WebElement LogOutButton=driver.findElement(By.id("logout_sidebar_link"));
		LogOutButton.click();
	}

}
