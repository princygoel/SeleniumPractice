package testNG;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderdemo {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.echotral.com");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

	@Test(dataProvider = "dp")
	public void loginTest(String un, String pwd) {
        String exp = "Invalid message";
		driver.findElement(By.id("txtCustomerID")).sendKeys(un);
		driver.findElement(By.id("txtPassword")).sendKeys("");
		driver.findElement(By.id("Butsub")).click();
		 String act = "Invalid message";
		 Assert.assertEquals(exp, act);

	}
	@DataProvider
	
	public Object[][] dp() {
		Object [][] data = new Object[5][2];
		data[0][0] = "user1";
		data[0][1] = "user1";
		data[1][0] = "user2";
		data[1][1] = "user2";
		data[2][0] = "user3";
		data[2][1] = "user3";
		data[3][0] = "user4";
		data[3][1] = "user4";
		data[4][0] = "user5";
		data[4][1] = "user5";
		return data;
		
	}
		

	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.id("txtCustomerID")).clear();

	}

}
