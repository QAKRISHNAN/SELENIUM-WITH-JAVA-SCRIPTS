package Excel_Operations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data_MultipleCells {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();

		File file = new File("D:\\Selenium June-24 Batch\\Excel\\Example_Excel_POI_WriteData_MultipleCells.xlsx");

		XSSFSheet sheet1 = wb.createSheet("FaceBook");
		XSSFRow row2 = sheet1.createRow(5);

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
