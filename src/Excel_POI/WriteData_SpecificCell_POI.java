package Excel_POI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_SpecificCell_POI {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();

		File file = new File("D:\\Selenium June-24 Batch\\Excel\\WriteDataExcel_POI.xlsx");

		XSSFSheet sheet1 = wb.createSheet("WriteData");
		XSSFRow row2 = sheet1.createRow(4);
		row2.createCell(3).setCellValue("Selenium");
	

		FileOutputStream fileOut = new FileOutputStream(file);
		wb.write(fileOut);
		System.out.println("Written Successfully");

	}

}
