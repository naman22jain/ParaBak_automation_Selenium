package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class DataProvider {
    @org.testng.annotations.DataProvider
    public Object[][] getsheet() throws IOException {
        Object data[][] = null;
        String src = "C:\\Users\\naman\\IdeaProjects\\ParaBank\\Data\\Credentials.xlsx";
        FileInputStream fileInputStream = new FileInputStream(src);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheetAt(0);
        int rowcount = sheet.getLastRowNum();
        int column = sheet.getRow(0).getLastCellNum();
        data = new String[rowcount][column];
        for (int i = 1; i <= rowcount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < column; j++) {
                String cellvalue = row.getCell(j).getStringCellValue();
                data[i - 1][j] = cellvalue;
            }
        }
        fileInputStream.close();
        xssfWorkbook.close();
        return data;
    }
}
