package excelFiles;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadFiles {
	File file;
	FileInputStream fis;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell cl;
	String fpath = "Users\\princygoel\\Desktop\\ExcelFile\\klk.xls";
	int rowCount, cellCount,i,j;
	
	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fpath);
		fis = new FileInputStream(file);
		wb = new HSSFWorkbook(fis);
		sh = wb.getSheetAt(0); // get first sheet
	}
	@Test 
	public void readTest() {
		rowCount = sh.getPhysicalNumberOfRows(); 
		cellCount = sh.getRow(0).getPhysicalNumberOfCells();
	
		for(i=0;i<rowCount;i++) {
			rw = sh.getRow(i);
			for(j=0;j<cellCount;j++) {
				cl = rw.getCell(j);
				System.out.println(cl.getStringCellValue());
			}
		}
	}
	@AfterTest 
	   public void afterTest() throws IOException {
		   fis.close();
		   wb.close();
		   System.out.println("Done ... ");
	   }
}
