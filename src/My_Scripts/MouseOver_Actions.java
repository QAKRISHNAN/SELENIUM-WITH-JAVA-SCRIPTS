package My_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_Actions {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
			
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Click And Hold , Move By Offset and Release
		/*	driver.get("https://demoqa.com/dragabble");
		
		
		js.executeScript("window.scrollBy(0,200)", "");
		
		
		WebElement ClickAndHoldButton = driver.findElement(By.xpath("//div[@id='dragBox']"));
		Actions action=new Actions(driver);
		
		action.clickAndHold(ClickAndHoldButton).perform();
		Thread.sleep(3000);
		action.moveByOffset(100, 100).perform();
		Thread.sleep(3000);
		action.release().perform();
		*/
		
		//Drag and Drop
	/*	driver.get("https://demoqa.com/droppable");
		js.executeScript("window.scrollBy(0,200)", "");
		WebElement DragMe = driver.findElement(By.id("draggable"));
		
		WebElement DropHere = driver.findElement(By.id("droppable"));
		
		//action.dragAndDrop(DragMe, DropHere).perform();
		
		action.dragAndDropBy(DragMe, 00, -50).perform();
		*/
		
		driver.get("https://demoqa.com/buttons");
		js.executeScript("window.scrollBy(0,250)", "");
		
		WebElement DoubleClikMe = driver.findElement(By.id("doubleClickBtn"));
		
		action.doubleClick(DoubleClikMe).perform();
		Thread.sleep(3000);
		
		WebElement RightClikMe = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(RightClikMe).perform();
		Thread.sleep(3000);
		
		WebElement ClikMe = driver.findElement(By.xpath("//button[text()=\"Click Me\"]"));
		action.click(ClikMe).perform();	
		}

}
