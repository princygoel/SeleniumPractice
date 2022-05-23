package UIelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
        // System.setProperty("webdriver.chrome.driver","Users/princygoel/eclipse-workspace/SeleniumWebDriver/Driver/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://xechoecho.com/htmlforms11.htm");
		WebElement dd = driver.findElement(By.name("mydropdown"));
        Select choices = new Select(dd);
        System.out.println("Default selected option is: " +choices.getFirstSelectedOption().getText());
        //choices.selectByVisibleText("Hot Bread");
        //choices.selectByValue("Bread");
        choices.selectByIndex(2);
        System.out.println("Current selected option is: " +choices.getFirstSelectedOption().getText());
        List<WebElement> allOptions = choices.getOptions();
        System.out.println("Total no of option" +allOptions.size());
        for(WebElement w : allOptions) {
        	System.out.println(w.getText());
      
        }
	}

}
