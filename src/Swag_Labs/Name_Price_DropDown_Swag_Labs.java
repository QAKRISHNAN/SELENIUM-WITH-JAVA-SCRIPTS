package Swag_Labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Name_Price_DropDown_Swag_Labs {

	public static void main(String[] args) {
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
		
		//Name(A to Z)
		WebElement NameDropDown=driver.findElement(By.className("product_sort_container"));
		NameDropDown.click();
		
		//Select DropDown
		Select select=new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		//select.selectByVisibleText("Name (Z to A)");
		//select.selectByIndex(3);
		select.selectByValue("lohi");

	}

}
