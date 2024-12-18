package Excel_Operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data_SigleCell {

	public static void main(String[] args) throws IOException, InvalidFormatException {
		XSSFWorkbook wb = new XSSFWorkbook();

		File file = new File("D:\\Selenium June-24 Batch\\Excel\\Example_Excel_POI_WriteData_SingleCell.xlsx");
		
		XSSFSheet sheet1 = wb.createSheet("WriteData");

		XSSFRow row2 = sheet1.createRow(2);
		row2.createCell(2).setCellValue("Sri Harshini");

		FileOutputStream fileOut = new FileOutputStream(file);
		wb.write(fileOut);
		
		System.out.println("Written Successfully");
	}

}
