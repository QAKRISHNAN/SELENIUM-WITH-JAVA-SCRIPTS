package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Step1:Open Chrome Browser [https://www.google.co.in/]

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");

		// Step2:Maximize Browser

		// Thread.sleep(2000);

		driver.manage().window().maximize();

		// Thread.sleep(2000);
/*
		driver.get("file:///D:/SELENIUM/Selenium%20Scripts/Frames/frames.html");
		driver.switchTo().frame(0);

		WebElement Frame1 = driver.findElement(By.id("001"));

		Frame1.sendKeys("Krishna");
		driver.switchTo().defaultContent();

		WebElement SwitchFrame2 = driver.findElement(By.xpath("/html/frameset/frame[2]"));
		driver.switchTo().frame(SwitchFrame2);

		WebElement Frame2 = driver.findElement(By.id("002"));

		Frame2.sendKeys("Ramesh");

		driver.switchTo().defaultContent();

		WebElement SwitchFrame3 = driver.findElement(By.xpath("/html/frameset/frame[3]"));
		driver.switchTo().frame(SwitchFrame3);

		WebElement Frame3 = driver.findElement(By.id("003"));

		Frame3.sendKeys("MUrali");
		*/
		
		driver.get("https://www.tronixtechs.com/contact-us.html");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.facebook.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.saucedemo.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		driver.quit();
		//driver.close();
		
		
		
	}

}
