package ReadExcel;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel_Data {
    HSSFWorkbook  wb;
    HSSFSheet sheet1;
    HSSFCell cell;

    public Excel_Data(String fileName) throws Exception {

        FileInputStream  fis = new FileInputStream(fileName);
        wb = new HSSFWorkbook(fis);
    }

    public  String getData(int sheetNumber, int row, int column) { 

        sheet1 = wb.getSheetAt(sheetNumber);
        String data = "";
        try{
            cell = sheet1.getRow(row).getCell(column);
            switch(cell.getCellTypeEnum()) {
                
                case NUMERIC:
                    data = cell.getNumericCellValue()     +   "\t\t";
                    break;
                case STRING:
                    data = cell.getStringCellValue()   +     "\t\t";
                    break;
                default:
                    break;
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return data;
    }
}