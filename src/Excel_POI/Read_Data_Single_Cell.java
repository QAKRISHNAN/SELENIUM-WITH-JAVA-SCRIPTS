package Excel_POI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_Single_Cell {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();

		File file=new File("D:\\Selenium June-24 Batch\\Excel\\Write Data Multiple Cells.xlsx");
		//File file=new File("D:\\Automation6pm\\FaceBook Data.xlsx");
		
		
		FileOutputStream inputStream = new FileOutputStream(file);

	//XSSFSheet sheet1 = wb.createSheet("FaceBookData");
	//	XSSFRow row2 = sheet1.createRow(0);
	//	row2.createCell(0).setCellValue("Krishna");

		XSSFSheet sheet2 = wb.getSheetAt(0);
		XSSFRow row3 = sheet2.getRow(2);

		XSSFCell cell = row3.getCell(1);
		

		String address = cell.getStringCellValue();

		System.out.println("Address is :" + address);

		FileOutputStream fileOut = new FileOutputStream(file);
		wb.write(fileOut);
		wb.write(inputStream);
		wb.close();

	}

}
