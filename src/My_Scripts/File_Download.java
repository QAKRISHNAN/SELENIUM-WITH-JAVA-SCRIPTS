package My_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Download {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
			
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.automationtesting.in/FileDownload.html");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(3000);
		
	//	WebElement Download = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/a"));
		//Download.click();
		
		WebElement TextArea = driver.findElement(By.xpath("//textarea[@id='textbox']"));
		TextArea.sendKeys("He is Good Boy");
		Thread.sleep(3000);
		
		WebElement GenerateFile = driver.findElement(By.xpath("//button[@id='createTxt']"));
		GenerateFile.click();
		Thread.sleep(3000);
		
		WebElement DownloadFile = driver.findElement(By.xpath("//a[@id='link-to-download']"));
		DownloadFile.click();
		Thread.sleep(3000);

	}

}
