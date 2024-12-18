package Excel_Operations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create_Single_Sheet 
{

	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook wb = new XSSFWorkbook();
		
		File file=new File("D:\\Selenium June-24 Batch\\Excel\\Example_Excel_POI_Single.xlsx");
		
		FileOutputStream fileOut = new FileOutputStream(file);

		XSSFSheet sheet1=wb.createSheet("Amazon");
		
			System.out.println("Sheet Created");
		
		wb.write(fileOut);

	}

}
