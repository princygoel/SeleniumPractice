package UIelements;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","Driver/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		try {
			driver.findElement(By.name("nq")).sendKeys("test");
		}
		catch(Exception e) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File f = ts.getScreenshotAs(OutputType.FILE);
			File desFile = new File("./Screenshots/Image.png");
			
			FileUtils.copyFile(f,desFile);
			driver.quit();
				
		}
		System.out.println("Completed successfully..");

	}

}
