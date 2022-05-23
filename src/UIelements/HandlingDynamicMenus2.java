package UIelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDynamicMenus2 {
	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
        System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.americangolf.co.uk/club-page");
		WebElement agile = driver.findElement(By.linkText("Golf Clubs"));
		Actions act = new Actions(driver);
		act.moveToElement(agile).perform();
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//body[1]/div[2]/div[2]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));
		for(WebElement w : options) {
			System.out.println(w.getText());
			
		}
		
	}

}
