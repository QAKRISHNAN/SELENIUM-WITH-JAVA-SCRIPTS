package Excel_Operations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data_Multiple_Cells {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String filePath = "D:\\Selenium June-24 Batch\\Excel\\Example_Excel_POI_WriteData_MultipleCells.xlsx";
	    FileInputStream file = new FileInputStream(filePath);
	    Workbook workbook = WorkbookFactory.create(file);
	    
	    Sheet sheet = workbook.getSheetAt(0); // assuming you want to read from the first sheet
	    
	    // Define the cell range you want to read
	
	    for (int i = 5; i <= 5; i++) {
	        Row row = sheet.getRow(i);
	        for (int j = 0; j <= 5; j++) {
	            Cell cell = row.getCell(j);
	            // Assuming all cells contain string data
	          String cellValue = cell.getStringCellValue();
	          
	          
	          // int cellValue = (int) cell.getNumericCellValue();
	            System.out.print(cellValue + "\t");
	        }
	        System.out.println();
	    }
	    
	    workbook.close();
	    file.close();
	    

	}

}
