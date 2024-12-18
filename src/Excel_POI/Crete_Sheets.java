package Excel_POI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Crete_Sheets 
{

	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook wb = new XSSFWorkbook();
		

		File file=new File("D:\\Selenium June-24 Batch\\Excel\\Excel_Data_POI.xlsx");
		FileOutputStream fileOut = new FileOutputStream(file);
		
		XSSFSheet sheet1=wb.createSheet("First Class");
		XSSFSheet sheet2=wb.createSheet("Second  Class");
		XSSFSheet sheet3=wb.createSheet("Third  Class");
		XSSFSheet sheet4=wb.createSheet("Fourth  Class");
		XSSFSheet sheet5=wb.createSheet("Fifth  Class");
		
		System.out.println("Sheet Created");
		
		wb.write(fileOut);

	}

}
