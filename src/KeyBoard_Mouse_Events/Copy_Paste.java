package KeyBoard_Mouse_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy_Paste {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/#");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		/*
		 * 	Find WebElement Text Area Source
			Ctrl+A  
			Ctrl+C
			Find WebElement Text Area Target
			Ctrl+V 
		 */
		
		  Actions action=new Actions(driver);
	/*	WebElement TextAreaSource = driver.findElement(By.xpath("//textarea[normalize-space()='The cat was playing in the garden.']"));
		TextAreaSource.click();
		
		
		
		//action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		//action.keyDown(TextAreaSource, Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//Ctrl+A  
		action.keyDown(Keys.CONTROL).perform();
		action.sendKeys("a").perform();
		//action.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		
		//Ctrl+C
		//action.keyDown(Keys.CONTROL).perform();
		action.sendKeys("c").perform();
		//action.keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(3000);
		TextAreaSource.click();
		
		//Ctrl+V
		
		//action.keyDown(Keys.CONTROL).perform();
		action.sendKeys("v").perform();
		action.keyUp(Keys.CONTROL).perform();
		*/
	/*	
		WebElement TextAreaSource =driver.findElement(By.xpath("//textarea[normalize-space()='The cat was playing in the garden.']"));
		Thread.sleep(3000);
		
		action.keyDown(TextAreaSource, Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		WebElement TextAreaTarget= driver.findElement(By.xpath("//textarea[@id='ta1']"));
		
		action.keyDown(TextAreaTarget, Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		*/
		  WebElement TextAreaSource =driver.findElement(By.xpath("//textarea[normalize-space()='The cat was playing in the garden.']"));
			Thread.sleep(3000);
			
			action.keyDown(TextAreaSource, Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
			action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
			Thread.sleep(3000);
		
			action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
			Thread.sleep(3000);
			
			action.keyDown( Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
			Thread.sleep(3000);
	}

}
