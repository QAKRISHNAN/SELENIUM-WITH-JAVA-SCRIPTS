package My_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
			
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(3000);
		
	WebElement Browse = driver.findElement(By.xpath("//*[@id=\"input-4\"]"));
		
	Browse.sendKeys("D:\\Selenium June-24 Batch\\ScreenShots\\Forward.jpeg");
	Thread.sleep(3000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,200)", "");
	Thread.sleep(3000);
	
	WebElement Remove = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/button[1]"));
	Remove.click();
	Thread.sleep(3000);
	
	Browse.sendKeys("D:\\Thumbnails\\Addition of given 3 Numbers.jpg");
	Thread.sleep(3000);
	Remove.click();
	}

}
