package KeyBoard_Mouse_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_RightClick_SingleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		
		//Double Click
		WebElement DoubleClickButton = driver.findElement(By.id("doubleClickBtn"));
		Thread.sleep(2000);
		action.doubleClick(DoubleClickButton).build().perform();

		//Right Click
		WebElement RightClickButton = driver.findElement(By.id("rightClickBtn"));
		Thread.sleep(2000);
		action.contextClick(RightClickButton).perform();
		
		//Single Click
		WebElement SingleClickButton = driver.findElement(By.xpath("//button[text()=\"Click Me\"]"));
		Thread.sleep(2000);
		action.click(SingleClickButton).perform();
	}

}
