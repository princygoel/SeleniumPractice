package UIelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadio {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
System.out.println(projectPath);

System.setProperty("webdriver.chrome.driver","Driver/ChromeDriver/chromedriver");
// System.setProperty("webdriver.chrome.driver","Users/princygoel/eclipse-workspace/SeleniumWebDriver/Driver/ChromeDriver/chromedriver");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
List<WebElement> wb = driver.findElements(By.xpath("//input[contains(@name,'gender')]"));


int i =0;
for (WebElement w : wb) {
	 if(w.isEnabled()) {
		 System.out.println("Before click cb" +i + " with title " + w.getAttribute("Value")+ " is selected?" +w.isSelected());
		 wb.get(i).click();
		 System.out.println("After click cb" +i+  " with title " + w.getAttribute("Value")+ " is selected?"  +w.isSelected());
		 
		 }
	 i++;
	}
	 
}
	
 }
	



