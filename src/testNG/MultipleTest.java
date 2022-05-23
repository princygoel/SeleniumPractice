package testNG;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class MultipleTest {
	
	WebDriver driver;

  @BeforeTest(alwaysRun =true)
  public void beforeTest() {
	    String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
}
  @AfterTest(alwaysRun =true)
  public void afterTest() {
	  driver.close();
  }
 
  @Test(priority = 5,groups = "L")
  public void visitBusiness() {
	  driver.findElement(By.linkText("Business")).click();
	  
  }
  @Test(priority=4,groups = "L")
  public void visitAbout() {
	  driver.findElement(By.linkText("About")).click();
  }
  
  @Test(priority=1,groups = "L")
  public void visitAdvertising() {
	  driver.findElement(By.linkText("Advertising")).click();
  }
  @Test(priority=2,groups = "R")
  public void visitTerms() {
	  driver.findElement(By.linkText("Terms")).click();
  }
  
  @Test(priority=3,groups = "R")
  public void visitPrivacy() {
	  driver.findElement(By.linkText("Privacy")).click();
  }
  
  @AfterMethod(alwaysRun =true)
  public void afterMethod() throws InterruptedException {
	  driver.navigate().back();
	  Thread.sleep(2000);
	  
  }

}
