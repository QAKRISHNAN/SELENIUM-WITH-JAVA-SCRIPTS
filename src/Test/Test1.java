package Test;

import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		//driver.manage().window().maximize();
		// Launch DemoQA registration page
        driver.get("https://demoqa.com/automation-practice-form");
        
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        
        js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(2000);
        
        js.executeScript("window.scrollBy(0,-1000)", "");
        Thread.sleep(2000);
        
        js.executeScript("window.scrollBy(1000,0)", "");
        Thread.sleep(2000);
        
        js.executeScript("window.scrollBy(-500,0)", "");
        Thread.sleep(2000);
	}

}
