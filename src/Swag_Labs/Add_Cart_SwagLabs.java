package Swag_Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Cart_SwagLabs {

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
		
	}

}
