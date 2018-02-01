package ReadExcel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Test_data {
	public  File inputWorkbook;
	public Sheet sheet;
	//public Sheet sheet1;
	
	public Test_data(String fileName,String sheetName) throws BiffException, IOException
	{//ClassLoader.getSystemClassLoader().getSystemResource(fileName).toString().substring(6)
		// inputWorkbook = new File("C:\\nammude_workspace\\dock1-test-core\\src\\main\\resources\\"+fileName);
		//System.out.println(getClass().getResourceAsStream("\\src\\main\\resources\\"+fileName));
		//System.out.println(System.getProperty("user.dir"));
		inputWorkbook = new File(System.getProperty("user.dir")+"/resources/"+fileName);
		 Workbook w;
		   inputWorkbook.getAbsoluteFile();
	      w = Workbook.getWorkbook(inputWorkbook);
	       sheet=w.getSheet(sheetName);
	       //sheet1=w.getSheet(sheetName);
	       
	}
	
	
	public  String readData(int i,int j) throws BiffException, IOException {
		

      
      Cell cell=sheet.getCell(i,j);
      //Cell cell1=sheet1.getCell(i,j);
     
return cell.getContents();
      
         
         


      }
	
}