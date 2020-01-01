package yt.parent.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExcleUtil {

    public static void jx(File file) throws IOException {
        InputStream is = new FileInputStream(file);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
        int rowstart = xssfSheet.getFirstRowNum();
        int rowEnd = xssfSheet.getLastRowNum();
        Integer num = 0;
        System.out.println("\"<Request>\" + ");
        for (int i = rowstart; i <= rowEnd; i++) {
            XSSFRow row = xssfSheet.getRow(i);
            if (null == row) {
                continue;
            }
            XSSFCell cell = row.getCell(0);
            String str = cell.getStringCellValue();
            System.out.println("    \"<" + str + ">{" + num + "}</" + str + ">\" + ");
            num++;
        }
        System.out.print("\"</Request>\"");
    }


    public static void jx1(File file) throws IOException {
        InputStream is = new FileInputStream(file);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
        int rowstart = xssfSheet.getFirstRowNum();
        int rowEnd = xssfSheet.getLastRowNum();
        Integer num = 0;
        for (int i = rowstart; i <= rowEnd; i++) {
            XSSFRow row = xssfSheet.getRow(i);
            if (null == row) {
                continue;
            }
            XSSFCell cell = row.getCell(0);
            String str = cell.getStringCellValue();
            XSSFCell cell1 = row.getCell(1);
            String str1 = null == cell1 ? "" : cell1.getStringCellValue();
            System.out.println("/**");
            System.out.println(" * " + str1);
            System.out.println(" **/");
            System.out.println("private String " + str + ";");
            num++;
        }
    }
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ytyuanf\\Desktop\\1.xlsx");
        ExcleUtil.jx1(file);
    }
}
