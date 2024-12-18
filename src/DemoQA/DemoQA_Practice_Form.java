package DemoQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA_Practice_Form {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		// Launch DemoQA registration page
        driver.get("https://demoqa.com/automation-practice-form");

        // Add implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Find and fill out the form fields
        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("Doe");
        driver.findElement(By.id("userEmail")).sendKeys("johndoe@example.com");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Vertical Scrolling Top to Bottom
		js.executeScript("window.scrollBy(0,250)", "");
		
		
		
        // Select gender
        driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();

        // Fill mobile number
        driver.findElement(By.id("userNumber")).sendKeys("1234567890");

        // Fill date of birth
        driver.findElement(By.id("dateOfBirthInput")).click();
        driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).sendKeys("May");
        driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).sendKeys("1990");
        driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day--015')]")).click();

        // Subjects
        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
        subjectsInput.sendKeys("Maths");
        subjectsInput.sendKeys(Keys.RETURN);
        driver.findElement(By.id("subjectsInput")).sendKeys("\n");
        
        // Fill subjects
      //  driver.findElement(By.id("subjectsInput")).sendKeys("Computer Science");

        // Select hobbies
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();

        // Upload picture
        WebElement uploadElement = driver.findElement(By.id("uploadPicture"));
        uploadElement.sendKeys("path/to/your/image.jpg");

        // Fill current address
        driver.findElement(By.id("currentAddress")).sendKeys("1234 Elm Street");

        // Select state
        driver.findElement(By.id("react-select-3-input")).sendKeys("NCR");
        driver.findElement(By.id("react-select-3-option-0")).click();

        // Select city
        driver.findElement(By.id("react-select-4-input")).sendKeys("Delhi");
        driver.findElement(By.id("react-select-4-option-0")).click();

        // Submit the form
        driver.findElement(By.id("submit")).click();

	}

}
