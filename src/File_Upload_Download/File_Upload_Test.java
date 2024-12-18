package File_Upload_Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Test {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
		
		WebElement Browse = driver.findElement(By.xpath("//input[@id='input-4']"));
		Browse.sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\Saved Pictures\\Screenshot 2024-02-26 121037.png");
		
		Browse.sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\Saved Pictures\\Screenshot 2024-02-26 121037.png");
	}

}
