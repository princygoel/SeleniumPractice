package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Demo3 {
	WebDriver driver;
	
  @Test
  public void googleSearch() {
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
  
  @BeforeTest
  public void beforeTest() {
	    String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
