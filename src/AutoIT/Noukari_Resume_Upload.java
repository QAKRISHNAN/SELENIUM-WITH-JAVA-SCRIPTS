package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Noukari_Resume_Upload {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=Cj0KCQiAh8OtBhCQARIsAIkWb6_dVMwfhHSmzDVSdX0etwUqeQh644rwB3NuR5rXcIHgIr8mFd-zG34aAuZwEALw_wcB&gclsrc=aw.ds");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Vertical Scrolling Top to Bottom
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[4]/div[2]/div[1]/div[2]/h2")).click();
		Thread.sleep(3000);
		
		WebElement	UploadResume=driver.findElement(By.xpath("//button[normalize-space()='Upload Resume']"));
		UploadResume.click();
		
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("D:\\Selenium June-24 Batch\\Noukari AutoIT Script\\ResumeUpload.exe");

	}

}
