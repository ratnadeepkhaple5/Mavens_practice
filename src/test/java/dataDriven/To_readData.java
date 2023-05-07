package dataDriven;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class To_readData {

	
	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\Org details.xlsx");
		

		 Workbook wb = WorkbookFactory.create(fis);
	/*	
		Sheet st = wb.getSheet("Sheet1");
		
		Row row = st.getRow(3);
		
		Cell cel = row.getCell(0);
		
		String data = cel.getStringCellValue();
		
		System.out.println(data);
		
		wb.close();
	*/
	}
}
