package ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_Data {
    HSSFWorkbook  wb;
    HSSFSheet sheet1;
    public Excel_Data(String fileName,String sheetName) throws Exception {
        File src= new File("E:\\Jino_testing\\Git_Hub\\Zmarta_se\\resources\\Zmarta.xls");
        FileInputStream  fis = new FileInputStream(src);
        HSSFWorkbook wb = new HSSFWorkbook(fis);
    }

    public  String  readData( int  sheetNumber, int row,int column) { 
        HSSFSheet sheet1 =wb.getSheetAt(0);
        String data =sheet1.getRow(row).getCell(column).getStringCellValue();
        return  data;
    }

	
}