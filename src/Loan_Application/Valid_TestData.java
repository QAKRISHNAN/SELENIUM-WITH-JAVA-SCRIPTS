package Loan_Application;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Valid_TestData
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Object Creation for WebDriver Class 
		WebDriver driver=new EdgeDriver();
		
	//Step1:Open Edge Browser
	System.setProperty("webdiver.edge.driver", "D:\\Selenium June-24 Batch\\edgedriver-win64\\msedgedriver.exe");
	Thread.sleep(2000);
	
	//Step2:Maximize Browser
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//Step3:Enter Valid URL
	driver.get("https://demo.nallakrishna.in");
	Thread.sleep(2000);
	
	//Step4: Enter Customer Name
	driver.findElement(By.id("cname")).sendKeys("ab");
	Thread.sleep(2000);
	
	//Step5: Enter Account Number
	driver.findElement(By.id("acNumber")).sendKeys("9999999");
	Thread.sleep(2000);
	
	//Step6: Enter Loan Amount
	driver.findElement(By.id("Lamount")).sendKeys("500");
	Thread.sleep(2000);
	
	//Step7: Term of Loan
	driver.findElement(By.id("term")).sendKeys("1");
	Thread.sleep(2000);
	
	//Step8: Monthly Re-Payment 
	driver.findElement(By.id("repayment")).sendKeys("10");
	Thread.sleep(2000);
	
	//Step9: Click on Submit Button
	driver.findElement(By.className("button")).click();
	Thread.sleep(2000);
	
	
	}

}
