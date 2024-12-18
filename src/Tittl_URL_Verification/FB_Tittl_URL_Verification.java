package Tittl_URL_Verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Tittl_URL_Verification {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//Step1:Open Chrome Browser [https://www.google.co.in/]
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		
		//Step2:Maximize Browser
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Step3:Enter Valid URL [https://www.facebook.com/]
		//driver.get("https://www.facebook.com/");
		
		driver.get("https://www.facebook.com/ads/library/?active_status=all&ad_type=political_and_issue_ads&country=IN&media_type=all");
		Thread.sleep(2000);
		
		//URL Verification
		
	/*	String ExceptedURL="https://www.facebook.com/";
		String ActualURL=driver.getCurrentUrl();
	
		
		System.out.println("Excepted URL: "+ExceptedURL);
		System.out.println("Actual URL: "+ ActualURL);
		
		driver.close();
		
		if(ExceptedURL.equalsIgnoreCase(ActualURL)) //T
		{
			System.out.println("URL is Matched");  //TBS 
			}
		else
		{
			System.out.println("URL is Not Matched"); //FBS 
		}
		*/
		
		//Title Verification
		
		String ExceptedTitle="Facebook – log in or sign up";
		String ActualTitle=driver.getTitle();
		
		System.out.println("Excepted Title: "+ExceptedTitle);
		System.out.println("Actual Title: "+ ActualTitle);
		
		driver.close();
		
		if(ExceptedTitle.equalsIgnoreCase(ActualTitle)) //T
		{
			System.out.println("Title is Matched");  //TBS 
			}
		else
		{
			System.out.println("Title is Not Matched"); //FBS 
		}
		
		
	}

}
