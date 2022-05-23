import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.Assert;


public class objectRepository {

	
		File file;
		FileInputStream fis;
		Properties p;
		WebDriver driver;
		Properties pr;
		String expMsg = "Wrong username and password combination.";
				
		
		@BeforeTest 
		public void beforeTest() throws IOException {
			file = new File("/Users/princygoel/eclipse-workspace/SeleniumPractice/src/rediff.properties");
			fis = new FileInputStream(file);
			p = new Properties();
			p.load(fis);
			System.setProperty("webdriver.chrome.driver","Driver/ChromeDriver/chromedriver");
			driver = new ChromeDriver();
			driver.get(p.getProperty("url"));
		}
		@Test
		public void test() {
			driver.findElement(By.id(p.getProperty("userNameID"))).sendKeys("abc");
			driver.findElement(By.id(p.getProperty("passwdID"))).sendKeys("abc");
			driver.findElement(By.name(p.getProperty("loginBtnName"))).click();
			String actMsg = driver.findElement(By.id(p.getProperty("errMsgId"))).getText();
			Assert.assertEquals(expMsg,actMsg);
			
		}
		
		@AfterTest
		public void afterTest()throws IOException  {
			fis.close();
			driver.close();
			System.out.println("done");
			
		}
		
	

}
