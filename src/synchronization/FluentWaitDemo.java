package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDemo {
	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("testing");
		FluentWait<WebDriver> fw  = new FluentWait(driver);
		fw.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofNanos(1))
		.ignoring(NoSuchElementException.class);
		fw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[conatins(text(),'tools')]"))).click();
	}

}
