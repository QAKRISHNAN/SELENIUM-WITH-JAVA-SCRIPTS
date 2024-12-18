package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.navigate().to("file:///D:/SELENIUM/Selenium%20Scripts/Frames/frames.html");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("001")).sendKeys("Krishna");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		WebElement SwitchFrame2 = driver.findElement(By.xpath("/html/frameset/frame[2]"));
		
		driver.switchTo().frame(SwitchFrame2);
		
		//driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[2]")));
		
		driver.findElement(By.id("002")).sendKeys("Suresh");
		Thread.sleep(2000);
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		
		driver.findElement(By.id("003")).sendKeys("Ramesh");
		Thread.sleep(2000);

	}

}
