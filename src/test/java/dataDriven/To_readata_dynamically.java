package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class To_readata_dynamically {

	public static void main(String[] args) throws Exception {
		
		File exelfile=new File("C:\\Users\\HP\\Desktop\\datasupply1.xlsx");
		System.out.println(exelfile.exists() + " data present");//if true then go further
		System.out.println();
		FileInputStream fis=new FileInputStream(exelfile);
		//it provides raw data
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//to create workbook
		
		//now workbook is created..we have to select sheet from worbook-->
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//to know how many number of rows present in workbook:-->
	//	System.out.println(sheet.getPhysicalNumberOfRows());//5
		int noOfRows=sheet.getPhysicalNumberOfRows();
		//to know how many number of rows present in workbook:-->
		int noOfColumn=sheet.getRow(0).getLastCellNum();
	//	System.out.println(sheet.getLastRowNum());//4..so we have to iterate 4 rows
	
//first row index is zero but we don't want to READ 1st row we have to start 
//from 2nd row for that take int i=1 not int i= 0
		for (int i = 1; i < noOfRows; i++) {

			for (int j = 0; j< noOfColumn; j++) {
				//every time the data that we are fetching will not be string(if other data then we get IllegalStateException)
				//so avoid this we go for dataFormatter object
//dataformatter will convert any type of data to string data
				DataFormatter df=new DataFormatter();
		//this is the cell value--> sheet.getRow(i).getCell(j)		
				System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
				
			//	System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
	}
		
	//to close the connection to avoid the "memory leakages"__>	
	workbook.close();
	fis.close();
		
	}
}
