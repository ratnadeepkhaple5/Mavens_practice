package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider1 {
/**
 * fetching all physible data from file and convert and print it as a string array
 * @param args
 * @throws Exception
 */
	public static void main(String[] args) throws Exception {

		File file=new File("C:\\Users\\HP\\Desktop\\datasupply1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wrkbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = wrkbook.getSheet("Sheet1");
		int noOfRows=sheet.getPhysicalNumberOfRows();
		int noOfColumn=sheet.getRow(0).getLastCellNum();

		String[][] data=new String[noOfRows-1][noOfColumn];
		for (int i = 0; i < noOfRows-1; i++) {
			for (int j = 0; j < noOfColumn; j++) {
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		for (String[] dataarray : data) {
			
			System.out.println(Arrays.toString(dataarray));
			//[admin, 1234]
			//[sunny, 5555]
			//[raj, 7777]
			//[manoj, 5550]

		}
		wrkbook.close();
		fis.close();

	}

}
