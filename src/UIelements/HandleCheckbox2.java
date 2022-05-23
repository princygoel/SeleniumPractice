package UIelements;

//import java.awt.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox2 {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
        // System.setProperty("webdriver.chrome.driver","Users/princygoel/eclipse-workspace/SeleniumWebDriver/Driver/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/span/label/span[1]")).click();

		}
		
	}
