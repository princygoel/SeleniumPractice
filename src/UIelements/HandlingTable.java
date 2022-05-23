package UIelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
		// System.setProperty("webdriver.chrome.driver","Users/princygoel/eclipse-workspace/SeleniumWebDriver/Driver/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		/*List<WebElement> all = driver.findElements(By.cssSelector("table.dataTable>thead>tr>th"));
		List<WebElement> all = driver.findElements(By.xpath("//table[@class ='dataTable']/thead/tr/th"));
		for (WebElement w : all) {
			System.out.println(w.getText());
		}
		System.out.println("Size of column: " + all.size());
	}*/
		List<WebElement> allrow = driver.findElements(By.xpath("//table[@class ='dataTable']/tbody/tr"));
		for (WebElement w : allrow) {
			System.out.println(w.getText());
		}
		System.out.println("Size of column: " + allrow.size());
	}
		
	}

