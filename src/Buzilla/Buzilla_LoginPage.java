package Buzilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buzilla_LoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		//Step1:Open Chrome Browser [https://www.google.co.in/]
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		
		//Step2:Maximize Browser
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Step3:Enter Valid URL [https://www.facebook.com/]
		driver.get("https://bugs.documentfoundation.org/");
		Thread.sleep(2000);
		
		//Step4: Click on Login Link
		
	//datatype WebElementName=Elemnt Finding 
		
		//WebElement LogInLink=driver.findElement(By.id("login_link_top"));
		//WebElement LogInLink=driver.findElement(By.linkText("Log In"));
		WebElement LogInLink=driver.findElement(By.partialLinkText("Log"));
		LogInLink.click();
		
		//Step5: Enter EMail Address
		//WebElement EMailAddress = driver.findElement(By.id("Bugzilla_login_top"));
		//WebElement EMailAddress = driver.findElement(By.name("Bugzilla_login"));
		WebElement EMailAddress = driver.findElement(By.className("bz_login"));
		//EMailAddress.sendKeys("Krishna@"); //IV Email
		EMailAddress.sendKeys("Krishna@gmail.com");
		
		//Step6: Enter Password
		
		WebElement Password=driver.findElement(By.id("Bugzilla_password_top"));
		Password.sendKeys("1234567");
		
		//Step7: Click on LogIn Button
		
		//WebElement LogInButton=driver.findElement(By.name("GoAheadAndLogIn"));
		WebElement LogInButton=driver.findElement(By.id("log_in_top"));
		LogInButton.click();

	}

}
