package My_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements_Locators 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		//Step1:Open Chrome Browser [https://www.google.co.in/]
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		
		driver.manage().window().maximize();
		
		//Text Box ID
		
		//driver.get("https://demoqa.com/text-box");
		driver.get("https://bugs.documentfoundation.org/");
		
		//driver.findElement(By.id("userName")).sendKeys("Krishna");
	driver.findElement(By.id("login_link_top")).click();
	
	driver.findElement(By.name("Bugzilla_login")).sendKeys("Krishna@gmail.com");
	
	driver.findElement(By.className("bz_password")).sendKeys("Krishna");
	
	driver.findElement(By.name("GoAheadAndLogIn")).click();
	
	}

}
