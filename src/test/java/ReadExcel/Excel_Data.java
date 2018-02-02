package ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;




public class Excel_Data {

 public static void main(String []args){
  
  try {
  // Specify the path of file
  File src=new File("E:\\Jino_testing\\Automation_Project\\Zmarta_se\\resources\\Zmarta.xls");

   // load file
   FileInputStream fis=new FileInputStream(src);
 
   // Load workbook
   HSSFWorkbook wb=new HSSFWorkbook(fis);
   
   // Load sheet- Here we are loading first sheetonly
      HSSFSheet sh1= wb.getSheetAt(0);
 
  // getRow() specify which row we want to read.

  // and getCell() specify which column to read.
  // getStringCellValue() specify that we are reading String data.


 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());

 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());

 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());

 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());

// System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());

 //System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
 
  } catch (Exception e) {

   System.out.println(e.getMessage());

  }
  
 }
 
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


