package My_Scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screen_Shots {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
			
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(3000);
		File u=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(u, new File("D:\\Selenium June-24 Batch\\ScreenShots\\URL.jpeg"));
		
		
		driver.navigate().back();
		File u1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(u1, new File("D:\\Selenium June-24 Batch\\ScreenShots\\Backward.jpeg"));
		
		Thread.sleep(3000);
		
		
		driver.navigate().forward();
		File u2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(u2, new File("D:\\Selenium June-24 Batch\\ScreenShots\\Forward.jpeg"));
		
		Thread.sleep(3000);
		
		String Accepted_Usernames="standard_user";
		WebElement UserName=driver.findElement(By.id("user-name"));
		UserName.sendKeys(Accepted_Usernames);
		
		File u3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(u3, new File("D:\\Selenium June-24 Batch\\ScreenShots\\UserName.jpeg"));
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		File u4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(u4, new File("D:\\Selenium June-24 Batch\\ScreenShots\\Refresh.jpeg"));
		
		Thread.sleep(3000);
		
		driver.close();
		File u5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(u5, new File("D:\\Selenium June-24 Batch\\ScreenShots\\Close.jpeg"));
		
	}

}
