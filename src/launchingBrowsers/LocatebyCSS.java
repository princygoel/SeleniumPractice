package launchingBrowsers;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocatebyCSS {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver","Driver/ChromeDriver/chromedriver");
	// System.setProperty("webdriver.chrome.driver","Users/princygoel/eclipse-workspace/SeleniumWebDriver/Driver/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.cssSelector("input#login1")).sendKeys("geeta");
		driver.findElement(By.cssSelector("input#password")).sendKeys("geeta");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		driver.findElement(By.cssSelector("input[title='Sign in'][tabindex ='4']")).click();
		driver.findElement(By.cssSelector("input[title^ = 'Sign']")).click();
		driver.findElement(By.cssSelector("input[title$ = 'in']")).click();
		driver.findElement(By.cssSelector("input[title* = 'gn']")).click();
		
		
		driver.close();
		driver.quit();
		}

}
