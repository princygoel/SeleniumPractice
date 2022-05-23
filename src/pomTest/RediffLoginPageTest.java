package pomTest;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomPage.RediffLoginPage;

public class RediffLoginPageTest {
	WebDriver driver;
	RediffLoginPage rlp;
	String expMsg = "Wrong username and password combination.";
	
	@BeforeTest 
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","Driver/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		rlp = new RediffLoginPage(driver);
	}
	
	@Test
	public void validateLogin() {
		rlp.setUserName("test");
		rlp.setPassword("test");
		rlp.clickLoginBtn();
		
		String actMsg = rlp.checkError();
		Assert.assertEquals(actMsg,expMsg);
	}
	@Test
	public void validateForgotPassword() {
		rlp.checkForgotPwdLink();
		Assert.assertEquals(driver.getTitle(),  "Password help assistance");
		driver.navigate().back();
	}
	@Test
	public void validateCreateAccount() throws InterruptedException {
		rlp.checkCreatActLink();
		Assert.assertEquals(driver.getTitle(),  "Rediffmail Free Unlimited Storage");
		driver.navigate().back();
		Thread.sleep(2000);
	}
	@Test
	public void validateCB() {
		rlp.checkStatus();
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
		System.out.println("Done ...");
		
	}

}
