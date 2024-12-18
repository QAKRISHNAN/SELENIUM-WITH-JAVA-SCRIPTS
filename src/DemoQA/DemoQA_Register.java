package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQA_Register {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		//Step1:Open Chrome Browser [https://www.google.co.in/]
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
		
		//Step2:Maximize Browser
		
		//Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		
		//Step3:Enter Valid URL
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//1.First Name
	WebElement FirstName=driver.findElement(By.tagName("input"));
	FirstName.sendKeys("Krishna");
	
	//2.Last Name
	WebElement LastName=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
	LastName.sendKeys("Rao");

	//3. Address
	WebElement Address=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
	Address.sendKeys("Hyderabad");
	
	//4.EMail
	WebElement EMail=driver.findElement(By.xpath("//input[@type=\"email\"]"));
	EMail.sendKeys("Krishna@gmail.com");
	
	//5.PhoneNumber
	WebElement PhoneNumber=driver.findElement(By.xpath("//input[@type=\"tel\"]"));
	PhoneNumber.sendKeys("1234656789");
	
	//5.Gender
	WebElement GenderMale=driver.findElement(By.name("radiooptions"));
	GenderMale.click();
	//Thread.sleep(4000);
	
	WebElement GenderFemale=driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
	GenderFemale.click();

	//6. Hobbies
	WebElement HobbiesCricket=driver.findElement(By.id("checkbox1"));
	HobbiesCricket.click();
	//Thread.sleep(2000);
	
	WebElement HobbiesMovies=driver.findElement(By.id("checkbox2"));
	HobbiesMovies.click();
	//Thread.sleep(2000);
	
	WebElement HobbiesHockey=driver.findElement(By.id("checkbox3"));
	HobbiesHockey.click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//Vertical Scrolling Top to Bottom
			
	js.executeScript("window.scrollBy(0,500)", "");
	
	WebElement Languages=driver.findElement(By.id("msdd"));
	Languages.click();

	//WebElement LanguagesSelect=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]/a"));
	WebElement LanguagesSelect=driver.findElement(By.xpath("//*[text()=\"Catalan\"]"));
	LanguagesSelect.click();
	
	//Select select = new Select(driver.findElement(By.xpath("//*[text()=\"Catalan\"]")));
	//select.selectByIndex(0);
	//select.selectByVisibleText("Arabic");
	
	WebElement Skills=driver.findElement(By.id("Skills"));
	Skills.click();
	
	}

}
