package launchingBrowsers;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocatebyTagName {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver","Driver/ChromeDriver/chromedriver");
	// System.setProperty("webdriver.chrome.driver","Users/princygoel/eclipse-workspace/SeleniumWebDriver/Driver/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		for(WebElement w : alllinks) {
			System.out.println(w.getText());
		}
		driver.close();
		driver.quit();
		}

}
