package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataSupplier {
//note:- excel file is 2 dimensional data
	public static void main(String[] args) throws Exception {
		// Define file path
		File file=new File("C:\\Users\\HP\\Desktop\\datasupply1.xlsx");
		System.out.println(file.canRead());
		//to read data from file
		FileInputStream fis=new FileInputStream(file);
		//to read data from workbook
		XSSFWorkbook wrkbook=new XSSFWorkbook(fis);
		//to select specific sheet from workbook
		XSSFSheet sheet = wrkbook.getSheet("Sheet1");
		//to get total no of rows & columns having data cells
		int noOfRows=sheet.getPhysicalNumberOfRows();
		int noOfColumn=sheet.getRow(0).getLastCellNum();//it will give how many number of column present in 1st row
		//to iterate the data that we get
	for (int i = 1; i < noOfRows; i++) {
		
		for (int j = 0; j< noOfColumn; j++) {
			//to print entire data present on console
			DataFormatter df=new DataFormatter();
			System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
			//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
		}
		System.out.println();
	}
	wrkbook.close();
	fis.close();//to close file
  }
}
