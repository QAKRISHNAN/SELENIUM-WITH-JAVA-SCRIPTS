package KeyBoard_Mouse_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		Actions action=new Actions(driver);
		
		WebElement DragMeSource = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement DragHereTarget = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		//action.dragAndDrop(DragMeSource, DragHereTarget).perform();
		
		action.dragAndDropBy(DragMeSource, 0, 200).perform();
	}

}
