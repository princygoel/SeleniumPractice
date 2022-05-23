package testNG;

import org.testng.annotations.Test;





import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;


public class Parameterfromxml {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
	
    @Parameters({"un","pwd"})
	@Test
	public void loginTest(String un, String pwd) {
        String exp = "Invalid message";
		driver.findElement(By.id("txtCustomerID")).sendKeys(un);
		driver.findElement(By.id("txtPassword")).sendKeys("");
		driver.findElement(By.id("Butsub")).click();
		 String act = "Invalid message";
		 Assert.assertEquals(exp, act);

	}
		

	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.id("txtCustomerID")).clear();

	}

}
