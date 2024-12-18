package File_Upload_Download;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Download {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/FileDownload.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)", "");
		Thread.sleep(2000);
		
		//Direct Download
		//WebElement DownloadDirect = driver.findElement(By.xpath("//a[@type='button']"));
		//DownloadDirect.click();
		
		//Text File Generation and Download
		/*
		WebElement TextDataTextArea = driver.findElement(By.xpath("//textarea[@id='textbox']"));
		TextDataTextArea.sendKeys("The URLs listed above will remain the same for update releases to allow their use in scripts.\r\n"
				+ "\r\n"
				+ "Learn more about automating these downloads");
		Thread.sleep(2000);
		
		WebElement GenerateTextFile = driver.findElement(By.xpath("//button[@id='createTxt']"));
		GenerateTextFile.click();
		Thread.sleep(2000);
	
		WebElement TextFileDownload=driver.findElement(By.xpath("//a[@id='link-to-download']"));
		TextFileDownload.click();
		*/
		
		////PDF File Generation and Download
		
		WebElement PDFDataTextArea = driver.findElement(By.xpath("//textarea[@id='pdfbox']"));
		PDFDataTextArea.sendKeys("Facebook helps you connect and share with the people in your life.");
		Thread.sleep(2000);
		
		WebElement GeneratePDFFile = driver.findElement(By.xpath("//button[@id='createPdf']"));
		GeneratePDFFile.click();
		Thread.sleep(2000);
	
		WebElement PDFFileDownload=driver.findElement(By.xpath("//a[@id='pdf-link-to-download']"));
		PDFFileDownload.click();
	}

}
