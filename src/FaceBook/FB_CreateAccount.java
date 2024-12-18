package FaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_CreateAccount {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//Step1:Open Chrome Browser [https://www.google.co.in/]
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		
		//Step2:Maximize Browser
		
		//Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		
		//Step3:Enter Valid URL
		 driver.get("https://www.facebook.com/");
		 
		//driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]")).click();
		
		driver.findElement(By.id("u_a_a_ii")).sendKeys("rrr");
		//driver.findElement(By.xpath("//input[@placeholder=\"First name\"]")).sendKeys("KK");
		
        
        
        
		//driver.findElement(By.name("reg_email__")).sendKeys("johndoe@example.com");
		
		//driver.findElement(By.id("u_6_c_eA")).sendKeys("johndoe@example.com");
	}

}
