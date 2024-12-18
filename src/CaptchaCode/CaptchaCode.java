package CaptchaCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptchaCode {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			driver.manage().window().maximize();
			driver.get("https://codepen.io/dsr/full/ExwVMjO");
			
			WebElement UserName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
			UserName.sendKeys("Krishna");
			
			WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
			Password.sendKeys("1234");
			
			WebElement captchaElement = driver.findElement(By.xpath("/html/body/div/div[4]/div[1]"));

	        // Extract the CAPTCHA value
	        String captchaValue = captchaElement.getText();

	        // Locate the CAPTCHA input field
	        WebElement captchaInputField = driver.findElement(By.id("captcha-form"));

	        // Enter the CAPTCHA value
	        captchaInputField.sendKeys(captchaValue);

	        
	}

}
