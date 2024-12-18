package Excel_Operations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_SingleCell {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();

		
		String filePath = "D:\\Selenium June-24 Batch\\Excel\\Example_Excel_POI_WriteData_SingleCell.xlsx";
		
		FileInputStream file = new FileInputStream(filePath);
		wb = new XSSFWorkbook(file);
		
	
		//XSSFSheet sheet = wb.getSheetAt(0);
		XSSFSheet sheet = wb.getSheet("WriteData");
		
		XSSFRow row = sheet.getRow(5);
		XSSFCell cell = row.getCell(5);
		String cellValue = cell.getStringCellValue(); 
		System.out.println("Cell value: " + cellValue);
		
		wb.close();
        file.close();

	}

}
