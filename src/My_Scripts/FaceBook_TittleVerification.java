package My_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_TittleVerification {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//Step1:Open Chrome Browser [https://www.google.co.in/]
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.facebook.com");
		driver.get("https://www.google.co.in");
		String ActualTittle="Facebook – log in or sign up";
		String ExpectedTittle=driver.getTitle();
		
		System.out.println("Actual Tittle: " +ActualTittle);
		System.out.println("Expected Tittle: "+ ExpectedTittle);
		
		if(ActualTittle.equalsIgnoreCase(ExpectedTittle))
		{
			System.out.println("Tittle Matched");
		}
		else
		{
			System.out.println("Tittle Not Matched");
			
		}
		driver.close();
		}

}
