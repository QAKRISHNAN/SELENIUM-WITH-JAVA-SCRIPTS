package KeyBoard_Mouse_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_And_Hold_Drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dragabble");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		WebElement DragMe = driver.findElement(By.id("dragBox"));
		
		action.clickAndHold(DragMe).perform();
		
		action.moveByOffset(-300, 300).perform();
		
		
		action.release().perform();
		
		//action.moveToElement(DragMe, 50, 00).perform();
	}

}
