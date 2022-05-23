package UIelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterForm {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
		// System.setProperty("webdriver.chrome.driver","Users/princygoel/eclipse-workspace/SeleniumWebDriver/Driver/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");	
	}	
}


