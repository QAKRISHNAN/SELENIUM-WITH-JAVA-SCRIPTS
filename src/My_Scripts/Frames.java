package My_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		/*
		 * driver.get("D:\\SELENIUM\\Selenium Scripts\\Frames\\frames.html");
		 * 
		 * //Frame-1 driver.switchTo().frame(0); WebElement
		 * Frame1=driver.findElement(By.id("001"));
		 * 
		 * Frame1.sendKeys("Krishna");
		 * 
		 * //Frame-2 driver.switchTo().defaultContent();
		 * 
		 * driver.switchTo().frame(1);
		 * 
		 * WebElement Frame2=driver.findElement(By.id("002")); //
		 * driver.switchTo().frame("002"); Frame2.sendKeys("Ramesh");
		 * 
		 * //Frame-3 driver.switchTo().defaultContent(); driver.switchTo().frame(2);
		 * WebElement Frame3=driver.findElement(By.id("003"));
		 * 
		 * Frame3.sendKeys("Lakshmi");
		 */

		driver.get("https://demo.automationtesting.in/Frames.html");
		// driver.switchTo().frame("singleframe");
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Krishna");

		driver.switchTo().defaultContent();

		// Navigate to the nested frames section
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		// Switch to the outer frame
		WebElement outerFrame = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
		driver.switchTo().frame(outerFrame);

		// Switch to the inner frame
		WebElement innerFrame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerFrame);

		// Interact with elements inside the nested frame
		WebElement nestedFrameInput = driver.findElement(By.xpath("//input[@type='text']"));
		nestedFrameInput.sendKeys("Hello Nested Frame!");

        // Switch back to the outer frame
        driver.switchTo().parentFrame();

        // Switch back to the main content
        driver.switchTo().defaultContent();

	}

}
