package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class PageLoadTimeout {
	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
        System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.navigate().to("https://www.reddif.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.navigate().back();
		System.out.println("Title of previous page :"+driver.getTitle());
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.navigate().forward();
		System.out.println("Title of current page :"+driver.getTitle());
	}
}
