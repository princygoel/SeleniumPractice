package UIelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown2 {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
		// System.setProperty("webdriver.chrome.driver","Users/princygoel/eclipse-workspace/SeleniumWebDriver/Driver/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement dd = driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		Select day = new Select(dd);
		day.selectByVisibleText("01");
		WebElement mm = driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		Select month = new Select(mm);
		month.selectByVisibleText("FEB");
		WebElement yy = driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
		Select year = new Select(yy);
		year.selectByVisibleText("1996");
		System.out.println("My Date of birth is " +day.getFirstSelectedOption().getText() +"-" +month.getFirstSelectedOption().getText() +"-" +year.getFirstSelectedOption().getText());

	}

}
