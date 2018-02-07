package ReadExcel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_Data {
	public  File inputWorkbook;
	public Sheet sheet;

	public Excel_Data(String fileName,String sheetName) throws BiffException, IOException
	{
		File src = new File("E:\\Jino_testing\\Git_Hub\\Zmarta_se\\resources\\Zmarta.xls");
		 Workbook w= Workbook.getWorkbook(inputWorkbook);
	      inputWorkbook.getAbsoluteFile();
	       sheet=w.getSheet(sheetName);
	      
	       
	}
	
	
	public  String readData(int i,int j) throws BiffException, IOException {
		

      
      Cell cell=sheet.getCell(i,j);
      //Cell cell1=sheet1.getCell(i,j);
     
return cell.getContents();
      
         
         


      }
	
}