package Noukari;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Noukari_RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
						
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
			
		//driver.manage().window().maximize();
		
		driver.get
		("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=Cj0KCQjwvb-zBhCmARIsAAfUI2sUTs_Qlg_BIs2ZXA9367BM43u9UHnr1OS28FcJFmyml-_fXPzr8ooaAkFEEALw_wcB&gclsrc=aw.ds");
	
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Vertical Scrolling Top to Bottom
				
		js.executeScript("window.scrollBy(0,500)", "");
		
		Thread.sleep(3000);
		//Bottom to Top 
		js.executeScript("window.scrollBy(0,-500)", "");
		
		Thread.sleep(3000);
		//Left to Right
		js.executeScript("window.scrollBy(500,0)", "");
	
		Thread.sleep(3000);
		//Right to Left 
		js.executeScript("window.scrollBy(-500,0)", "");
		
		driver.manage().window().maximize();
		
		driver.close();
	}

}
