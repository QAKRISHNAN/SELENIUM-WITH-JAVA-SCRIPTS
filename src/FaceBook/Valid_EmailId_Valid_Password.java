package FaceBook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Valid_EmailId_Valid_Password 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver=new ChromeDriver();
	
	//Step1:Open Chrome Browser [https://www.google.co.in/]
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium June-24 Batch\\chromedriver-win64\\chromedriver.exe");
	
	//Step2:Maximize Browser
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	//Step3:Enter Valid URL [https://www.facebook.com/]
	String URL="https://www.facebook.com";
	driver.get(URL);
	//String url=URL.get
	Thread.sleep(2000);
	
	//Step4:Enter Valid Email [tronixtechkrishna.gmail.com]
	//driver.findElement(By.id("email")).sendKeys("tronixtechkrishna@gmail.com");
	Thread.sleep(3000);
	//Absolute Xpath
	//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("Krishna");
	
	//Relative Xpath
	driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("tronixtechkrishna@gmail.com");
	
	//Step5:Enter Valid Password [***********]
	driver.findElement(By.name("pass")).sendKeys("Krishna#7167");
	Thread.sleep(3000);
	
	//Step6:Click on Login Button
	driver.findElement(By.name("login")).click();
	Thread.sleep(5000);
	
	//Step7:Close Browser
	//driver.close();
	

	

	}

}
