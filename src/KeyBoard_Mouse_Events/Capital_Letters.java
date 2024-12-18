package KeyBoard_Mouse_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Capital_Letters {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/#");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		WebElement TextArea = driver.findElement(By.xpath("//textarea[@id='ta1']"));
		
		Actions action=new Actions(driver);
		
		action.keyDown(TextArea, Keys.SHIFT).perform();
		
		//action.keyDown(Keys.SHIFT).perform();
		
		action.sendKeys("abcdefgh").perform();
		
		action.keyUp(Keys.SHIFT).perform();
		

	}

}
