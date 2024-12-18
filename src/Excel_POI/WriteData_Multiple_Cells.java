package Excel_POI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_Multiple_Cells {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();

		File file = new File("D:\\Selenium June-24 Batch\\Excel\\Write Data Multiple Cells.xlsx");

		XSSFSheet sheet1 = wb.createSheet("StudentDetails");
		XSSFRow row2 = sheet1.createRow(2);

		row2.createCell(0).setCellValue("Diana");
		row2.createCell(1).setCellValue("Jane");
		row2.createCell(2).setCellValue("djanes@gmail.com");
		row2.createCell(3).setCellValue("Female");
		row2.createCell(4).setCellValue("878456789");
		row2.createCell(5).setCellValue("Park Lane, Flat C1 , New Jersey");

		FileOutputStream fileOut = new FileOutputStream(file);
		wb.write(fileOut);
		System.out.println("Written Successfully");

	}

}
