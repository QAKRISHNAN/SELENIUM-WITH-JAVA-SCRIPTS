package Swag_Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_On_Cart_CheckOut {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
			
		//User Name:
		String Accepted_Usernames="standard_user";
		WebElement UserName=driver.findElement(By.id("user-name"));
		UserName.sendKeys(Accepted_Usernames);
	
		//Password:
		String Accepted_Password="secret_sauce";
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys(Accepted_Password);
		
		//Login
		WebElement Login=driver.findElement(By.id("login-button"));
		Login.click();
		Thread.sleep(2000);
		
		//1.Add to Cart Sauce Labs Backpack
		WebElement AddCart_SauceLabsBackpack=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		AddCart_SauceLabsBackpack.click();
		Thread.sleep(2000);
		
		//2.Add to Cart Sauce Labs Bike Light
		WebElement AddCart_SauceLabsBikeLight=driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		AddCart_SauceLabsBikeLight.click();
		Thread.sleep(2000);
		
		//3.Sauce Labs Bolt T-Shirt
		WebElement AddCart_SauceLabsBoltTShirt=driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
		AddCart_SauceLabsBoltTShirt.click();
		Thread.sleep(2000);
		
		//4.Sauce Labs Fleece Jacket
		WebElement AddCart_SauceLabsFleeceJacket=driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		AddCart_SauceLabsFleeceJacket.click();
		Thread.sleep(2000);
		
		//5.Sauce Labs Onesie
		WebElement AddCart_SauceLabsOnesie=driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
		AddCart_SauceLabsOnesie.click();
		Thread.sleep(2000);
		
		//6.Test.allTheThings() T-Shirt (Red)
		WebElement AddCart_SauceLabsAllTheThings=driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
		AddCart_SauceLabsAllTheThings.click();
		Thread.sleep(2000);
		
		//Click on Cart
		WebElement ClickonCart=driver.findElement(By.id("shopping_cart_container"));
		ClickonCart.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(2000);
		
		//CheckOut Button Click
		WebElement CheckOutButton=driver.findElement(By.id("checkout"));
		CheckOutButton.click();
		Thread.sleep(2000);
		
		//First Name
		WebElement FirstName=driver.findElement(By.id("first-name"));
		FirstName.sendKeys("Krishna");
		Thread.sleep(2000);
		
		//Last Name
		WebElement LastName=driver.findElement(By.id("last-name"));
		LastName.sendKeys("Rao");
		Thread.sleep(2000);
		
		//Zip/Postal Code
		WebElement Zipcode=driver.findElement(By.id("postal-code"));
		Zipcode.sendKeys("500001");
		Thread.sleep(2000);
		
		//Continue Button
		WebElement ContinueButton=driver.findElement(By.id("continue"));
		ContinueButton.click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(2000);
		
		//Finish Button
		WebElement FinishButton=driver.findElement(By.id("finish"));
		FinishButton.click();
		Thread.sleep(2000);
		
	}

}
