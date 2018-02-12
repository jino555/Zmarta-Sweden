package ReadExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class Excel_Data {
    HSSFWorkbook  wb;
    HSSFSheet sheet1;
    public Excel_Data(String fileName) throws Exception {

        FileInputStream  fis = new FileInputStream(fileName);
        wb = new HSSFWorkbook(fis);
    }

    public  String getData(int sheetNumber, int row, int column) { 

        sheet1 = wb.getSheetAt(sheetNumber);
        String data = sheet1.getRow(row).getCell(column).getStringCellValue();
        return data;
    }
}