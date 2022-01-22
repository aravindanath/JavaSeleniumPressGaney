package day3;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExl {

    public static void main(String[] args) throws IOException {


        String path = System.getProperty("user.dir")+ File.separator+"data"+File.separator+"testdata.xlsx";


        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        Sheet st = wb.getSheet("emp");

        int getAllRow = st.getLastRowNum();

        for(int i=0; i<getAllRow+1;i++){
            String name =  st.getRow(i).getCell(0).getStringCellValue();
            String city =  st.getRow(i).getCell(1).getStringCellValue();
            System.out.println(name + "   "+ city);

        }


    }
}
