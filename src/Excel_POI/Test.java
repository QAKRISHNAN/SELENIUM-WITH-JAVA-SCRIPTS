package Excel_POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();

		File file = new File("D:\\Selenium June-24 Batch\\Excel\\WriteDataExcel_POI.xlsx");

		XSSFSheet sheet1 = wb.createSheet("WriteData");
		XSSFRow row2 = sheet1.createRow(0);
		row2.createCell(0).setCellValue("Selenium");
	

		FileOutputStream fileOut = new FileOutputStream(file);
		wb.write(fileOut);
		System.out.println("Written Successfully");
		
		String filePath = "D:\\Selenium June-24 Batch\\Excel\\Excel_Data_POI.xlsx";
		
		FileInputStream file1 = new FileInputStream(filePath);
		wb = new XSSFWorkbook(file1);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		String cellValue = cell.getStringCellValue(); 
		System.out.println("Cell value: " + cellValue);
		
		wb.close();
        file1.close();

	}

}
