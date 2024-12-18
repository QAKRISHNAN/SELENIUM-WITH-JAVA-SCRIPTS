package Clear_Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_ClearData {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		//Step1:Open Chrome Browser [https://www.google.co.in/]
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		
		//Step2:Maximize Browser
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Step3:Enter Valid URL [https://www.facebook.com/]
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//Step4:Enter Valid Email [tronixtechkrishna.gmail.com]
		driver.findElement(By.id("email")).sendKeys("tronixtechkrishna@gmail.com");
		Thread.sleep(3000);
		
		//Step5: Clear Data in Email
		driver.findElement(By.id("email")).clear();
		Thread.sleep(3000);
		
		//Step4:Enter Valid Email [tronixtechkrishna.gmail.com]
		driver.findElement(By.id("email")).sendKeys("krishna@gmail.com");
		Thread.sleep(3000);
	}

}
