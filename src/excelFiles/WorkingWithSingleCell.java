package excelFiles;

import java.io.File;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class WorkingWithSingleCell {
	File file;
	FileOutputStream fos;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell cl;
	String fpath = "Users\\princygoel\\Desktop\\ExcelFile\\writeFile.xlsx";
	
	
   @BeforeTest  
   public void beforeTest() throws FileNotFoundException  {

       file = new File(fpath);
	   fos = new FileOutputStream(file);
	   
	   wb = new HSSFWorkbook();
	   sh = wb.createSheet("My Sheet");
	   }
	
   
   
   @Test
   public void test1() {
	   rw = sh.createRow(0);
	   cl = rw.createCell(0);
	   cl.setCellValue("My Cell");
   }
   
 /*  @Test 
   public void writeData() {
	   for(int i =0; i<3;i++) {
		   rw = sh.createRow(i);
		   for (int j = 0;j<i;j++) {
			   cl = rw.createCell(j);
			   cl.setCellValue("Row" +i +"Col" +j);
		   }
			   
	   }
   } */
   
   @AfterTest 
   public void afterTest() throws IOException {
	   wb.write(fos);
	   fos.close();
	   wb.close();
	   System.out.println("Done ... ");
   }

}
