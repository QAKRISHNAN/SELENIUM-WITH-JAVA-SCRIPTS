package Excel_Operations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create_MultipleSheets {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();
		
		File file=new File("D:\\Selenium June-24 Batch\\Excel\\Example_Excel_POI_Multiple.xlsx");
		
		FileOutputStream fileOut = new FileOutputStream(file);

		XSSFSheet sheet1=wb.createSheet("Amazon");
		XSSFSheet sheet2=wb.createSheet("FaceBook");
		XSSFSheet sheet3=wb.createSheet("Noukari");
		XSSFSheet sheet4=wb.createSheet("FlipKart");
		XSSFSheet sheet5=wb.createSheet("Tronix");
		
			System.out.println("Sheet Created");
		
		wb.write(fileOut);
		
	}

}
