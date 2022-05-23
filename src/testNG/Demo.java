package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver driver;
	
	@Test
	public void visitGoogle() {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		System.out.println("Title of page: " +driver.getTitle());
		
		
	}

}
