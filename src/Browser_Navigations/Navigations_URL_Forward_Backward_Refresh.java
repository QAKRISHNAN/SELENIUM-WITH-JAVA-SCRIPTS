package Browser_Navigations;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Navigations_URL_Forward_Backward_Refresh 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		
		//driver.get("https://www.google.co.in/");
		
		driver.navigate().to("https://www.google.co.in/");
		Actions action=new Actions(driver);
		
		File s1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s1, new File("D:\\Selenium June-24 Batch\\ScreenShots\\1.GooglePage.jpeg"));
		
		
		WebElement GoogleSearchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		GoogleSearchBox.sendKeys("https://www.facebook.com");
		
		File s2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s2, new File("D:\\Selenium June-24 Batch\\ScreenShots\\2.FaceBookAllLinksPage.jpeg"));
		
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();
		
		WebElement GoogleSearchButton = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		GoogleSearchButton.click();
		
		File s3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s3, new File("D:\\Selenium June-24 Batch\\ScreenShots\\3.FaceBookURLPage.jpeg"));
		
		
		WebElement FaceBookLink = driver.findElement(By.xpath("//h3[normalize-space()='Facebook - log in or sign up']"));
		FaceBookLink.click();
		
		File s4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s4, new File("D:\\Selenium June-24 Batch\\ScreenShots\\4.FaceBookPage.jpeg"));
		
		
		//Back Ward
		//Thread.sleep(2000);
		driver.navigate().back();
		
		File s5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s5, new File("D:\\Selenium June-24 Batch\\ScreenShots\\5.Back1Page.jpeg"));
		
			
		//Thread.sleep(2000);
		driver.navigate().back();

		File s6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s6, new File("D:\\Selenium June-24 Batch\\ScreenShots\\6.Back2Page.jpeg"));
		
		//Thread.sleep(2000);
		driver.navigate().forward();
		
		File s7=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s7, new File("D:\\Selenium June-24 Batch\\ScreenShots\\7.Forward1Page.jpeg"));
		
		
		//Thread.sleep(2000);
		driver.navigate().forward();
		
		File s8=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s8, new File("D:\\Selenium June-24 Batch\\ScreenShots\\8.Forward2Page.jpeg"));
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Krishna");
		
		File s9=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s9, new File("D:\\Selenium June-24 Batch\\ScreenShots\\9.NameEnter.jpeg"));
		
		
		//Thread.sleep(2000);
		driver.navigate().refresh();
		
		File s10=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s10, new File("D:\\Selenium June-24 Batch\\ScreenShots\\10.RefreshPage.jpeg"));
		
		driver.close();
	}

}
