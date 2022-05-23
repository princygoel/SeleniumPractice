package UIelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable2 {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
		// System.setProperty("webdriver.chrome.driver","Users/princygoel/eclipse-workspace/SeleniumWebDriver/Driver/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		String exp = "KSB";
		List<WebElement> name = driver.findElements(By.xpath("//table[@class ='dataTable']/tbody/tr/td[1]/a"));
		int i = 0;
		for (WebElement w : name) {
			if (name.get(i).getText().equalsIgnoreCase(exp)) {
				System.out.println("Company Found at:" +(i+1));
				System.out.println(driver.findElement(By.xpath("//table[@class ='dataTable']/tbody/tr["+(i+1)+"]")).getText());

			}
			i++;
			

		}

	}
}
