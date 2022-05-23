package excelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadFromExcelDemo {
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell cl;
	String fpath = "Users\\princygoel\\Desktop\\ExcelFile\\demo2.xlsx";
	int rowCount, cellCount, i, j, row =1, col =2;
	WebDriver driver;
	String expMsg = "Invalid username/password";

	
	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fpath);
		fis = new FileInputStream(file);
		wb = new HSSFWorkbook(fis);
		sh = wb.getSheetAt(0);
		System.setProperty("webdriver.chrome.driver","Driver/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://echotrak.com");
		
	}
	
	@DataProvider
	public Object[][] dp() {
		Object[][] data = new Object[3][2];
		rowCount = sh.getPhysicalNumberOfRows();
        cellCount = sh.getRow(0).getPhysicalNumberOfCells();
        for(int i=0;i<rowCount;i++) {
        	rw = sh.getRow(i+1);
        	for(j=0; j<cellCount-1;j++) {
        		cl = rw.getCell(j);
        		data[i][j] = cl.getStringCellValue();
        	}
        }
		return data;
	}
	
	@Test(dataProvider = "dp")
	public void login(String un, String pwd) throws IOException {
		driver.findElement(By.id("txtCustomerID")).sendKeys(un);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("Butsub")).click();
		String actMsg = driver.findElement(By.id("lblMsg")).getText();
		//Assert.assertEquals(actMsg,expMsg);
		fos = new FileOutputStream(file);
		rw = sh.getRow(row);
		cl = rw.createCell(col);
		if(actMsg.equals(expMsg)) {
			cl.setCellValue("PASS");
		}
		else {
			cl.setCellValue("FAILS");
		}
		wb.write(fos);
		fos.close();
		row++;
		
	}
	
	@AfterTest
	public void afterTest() throws IOException {
		fis.close();
		wb.close();
		driver.close();
		System.out.println("Done....");
		
	}
	

}
