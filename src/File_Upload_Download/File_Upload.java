package File_Upload_Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
		
		WebElement Browse = driver.findElement(By.id("input-4"));
		Browse.sendKeys("D:\\Thumbnails\\Eclipse Installation, Project, Package , Class Creation and Execution of Java Programs-1.jpg");
		Thread.sleep(2000);
		
		Browse.sendKeys("D:\\Thumbnails\\Addition of given 3 Numbers.jpg");
		
Thread.sleep(2000);
		
		Browse.sendKeys("D:\\Thumbnails\\Addition of given 3 Numbers.jpg");
Thread.sleep(2000);
		
		Browse.sendKeys("D:\\Thumbnails\\Addition of given 3 Numbers.jpg");
	}

}
