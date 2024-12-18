package My_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_URL_Verification {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//Step1:Open Chrome Browser [https://www.google.co.in/]
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.facebook.com");
		driver.get("https://www.google.co.in");
		String ActualURL="https://www.google.co.in/";
		String ExpectedURL=driver.getCurrentUrl();
		
		System.out.println("Actual Tittle: " +ActualURL);
		System.out.println("Expected Tittle: "+ ExpectedURL);
		driver.close();
		
		if(ActualURL.equalsIgnoreCase(ExpectedURL))
		{
			System.out.println("URL Matched");
		}
		else
		{
			System.out.println("URL Not Matched");
			
		}
		
		

	}

}
