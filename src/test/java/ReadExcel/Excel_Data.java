package ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import jxl.Cell;
import jxl.Sheet;

public class Excel_Data {

	public static void main(String[] args) throws Exception
	
	
	{
		
		
		File src  = new File ("E:\\Jino_testing\\Automation_Project\\Zmarta_se\\resources\\Zmarta.xls ");
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook  wb = new HSSFWorkbook(fis);
		HSSFSheet sheet1  = wb.getSheetAt(0);
		String data0 = sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Data is" +data0);
		
		
		

	}
	public Sheet sheet;
	public String  readData(int i, int j) {
		
		
		  Cell cell=sheet.getCell(i,j);
	
		return cell.getContents();
	}
}
	
