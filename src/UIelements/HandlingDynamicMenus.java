package UIelements;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDynamicMenus {
	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
        System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.istqb.in/");
		WebElement agile = driver.findElement(By.linkText("AGILE"));
		Actions act = new Actions(driver);
		act.moveToElement(agile).perform();
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[3]/ul[1]/li[5]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li"));
		for(WebElement w : options) {
			System.out.println(w.getText());	
		}
		//Random Testing 
		Random ran = new Random();
		int x =ran.nextInt(options.size());
		options.get(x).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		System.out.println(driver.getTitle());
	}
}

