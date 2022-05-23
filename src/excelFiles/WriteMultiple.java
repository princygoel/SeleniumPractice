package excelFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WriteMultiple {
	File file;
	FileOutputStream fos;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell cl;
	String fpath = "Users/princygoel/Documents/ExeclFiles/file1.xls";
	int i =0,j;
	@BeforeTest 
	public void beforeTest() throws FileNotFoundException {
		file = new File(fpath);
		fos = new FileOutputStream(file);
		wb = new HSSFWorkbook();
		sh = wb.createSheet("Sheet1");
	}
	@Test(dataProvider = "dp")
	public void writeInMultiple(String name, String company, String location) {
		j =0;
		rw =sh.createRow(i);
		cl = rw.createCell(j); //create first cell
		cl.setCellValue(name);
		cl = rw.createCell(j+1); //create second cell
		cl.setCellValue(company); 
		cl = rw.createCell(j+2); //create third cell
		cl.setCellValue(location);
		
        i++;
	
	}
	@DataProvider
	public Object[][] dp() {
		Object [][] data = new Object[5][3];
		data[0][0] = "Dheraj";
		data[0][1] = "MindTree";
		data[0][2] = "Noids";
		data[1][0] = "Princy";
		data[1][1] = "Algoworks";
		data[1][2] = "Noids";
		data[2][0] = "Deepika";
		data[2][1] = "Infosys";
		data[2][2] = "Pune";
		data[3][0] = "Diksha";
		data[3][1] = "Veativ";
		data[3][2] = "Noida";
		data[4][0] = "Akansha";
		data[4][1] = "Prodo";
		data[4][2] = "Gurugram";
		
		return data;
	}
	
	@AfterTest 
	public void afterTest() throws IOException {
		wb.write(fos);
		fos.close();
		wb.close();
	}
}
