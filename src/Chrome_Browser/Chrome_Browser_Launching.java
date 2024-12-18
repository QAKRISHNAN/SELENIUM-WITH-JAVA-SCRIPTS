package Chrome_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser_Launching {

	public static void main(String[] args) throws InterruptedException 
	{
		
/*1.Launch the Chrome browser.
2.Maximize the browser.
3.Open URL: https://www.google.co.in.
4.Wait for the page to load.
5.Print a message (URL is opened successfully) on the console.
6.Close the browser.
		 * 
		 */
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.co.in");
		Thread.sleep(2000);
		System.out.println("URL is opened successfully");
		Thread.sleep(2000);
		
		
		//driver.close();
		
		

	}

}
