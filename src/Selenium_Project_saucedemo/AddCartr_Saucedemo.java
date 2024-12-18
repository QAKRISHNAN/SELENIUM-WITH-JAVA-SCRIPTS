package Selenium_Project_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCartr_Saucedemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
			
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		//Enter Valid User Name
		String UserNameValid="standard_user";
		WebElement UserName=driver.findElement(By.id("user-name"));
		UserName.sendKeys(UserNameValid);
		
		//Enter Valid Password
		String PasswordValid="secret_sauce";
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys(PasswordValid);
		
		//Click on Login Button
		WebElement LoginButton=driver.findElement(By.xpath("//input[@name=\"login-button\"]"));
		LoginButton.click();
		Thread.sleep(2000);

		//Add to Cart
		//1.Sauce Labs Backpack
		WebElement SauceLabsBackpack=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		SauceLabsBackpack.click();
		Thread.sleep(2000);
		
		//2.Sauce Labs Bike Light
		WebElement SauceLabsBikeLight=driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		SauceLabsBikeLight.click();
		Thread.sleep(2000);
		
		//3.Sauce Labs Bolt T-Shirt
		WebElement SauceLabsBoltTShirt=driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
		SauceLabsBoltTShirt.click();
		Thread.sleep(2000);
		
		//4.Sauce Labs Fleece Jacket
		WebElement SauceLabsFleeceJacket=driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		SauceLabsFleeceJacket.click();
		Thread.sleep(2000);
		
		//Scroll Web Page Vertical 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
		
		//5.Sauce Labs Onesie
		WebElement SauceLabsOnesie=driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
		SauceLabsOnesie.click();
		Thread.sleep(2000);	
		
		//6.Test.allTheThings() T-Shirt (Red)
		WebElement AllTheThingsTShirt=driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
		AllTheThingsTShirt.click();
		Thread.sleep(2000);	
		

		
	}

}
