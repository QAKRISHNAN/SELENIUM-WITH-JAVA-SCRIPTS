package TestNG_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations {
	WebDriver driver;

	@BeforeClass
	public void DriverConfigure() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void EnterURL() {
		driver.get("https://www.saucedemo.com/");
	}

	@Test(priority=0)  //Method
	public void Swag_VU_VP() throws InterruptedException {
		String Accepted_Usernames = "standard_user";
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys(Accepted_Usernames);
		Thread.sleep(3000);
		// Password:
		// String Accepted_Password = "secret_sauce";
		String Accepted_Password = "secret_sauce";
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(Accepted_Password);
		Thread.sleep(3000);
		// Login
		WebElement Login = driver.findElement(By.id("login-button"));
		Login.click();
		Thread.sleep(3000);
	}
	
	@Test(priority=1) //Method2
	public void Swag_VU_IVP() throws InterruptedException {
		String Accepted_Usernames = "standard_user";
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys(Accepted_Usernames);
		Thread.sleep(3000);
		// Password:
		// String Accepted_Password = "secret_sauce";
		String Accepted_Password = "fgfxh";
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(Accepted_Password);
		Thread.sleep(3000);
		// Login
		WebElement Login = driver.findElement(By.id("login-button"));
		Login.click();
		Thread.sleep(3000);
	}
	@AfterClass

	public void DriverClose() {
		driver.close();
	}

}
