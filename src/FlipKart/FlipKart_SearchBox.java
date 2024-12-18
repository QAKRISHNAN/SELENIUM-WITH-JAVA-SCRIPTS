package FlipKart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_SearchBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		// Close the login popup if it appears
		//WebElement closeButton = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
       // closeButton.click();
		// Popup did not appear, continue with the script
		
        // Locate the search button and click it
        WebElement searchBox = driver.findElement(By.name("q"));
        // Enter search term into the search box
        searchBox.sendKeys("laptop");
        
        // Locate the search button and click it
        //WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
      
        searchButton.click();

	}

}
