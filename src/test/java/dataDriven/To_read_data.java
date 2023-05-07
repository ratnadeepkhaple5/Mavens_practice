package dataDriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class To_read_data {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\Org details.xlsx");
												//to read data from source
		
		Workbook wb = WorkbookFactory.create(fis);
						//to read the data from excel workbook
		Sheet st = wb.getSheet("Sheet1");
					//to select the specific sheet from multiple	
		
		Row rw=st.getRow(2);
		
		Cell cel=rw.getCell(1);
		
		String data=cel.getStringCellValue();
		
		System.out.println(data);
	}
}
