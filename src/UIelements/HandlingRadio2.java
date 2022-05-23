package UIelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadio2 {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
System.out.println(projectPath);

System.setProperty("webdriver.chrome.driver","Driver/ChromeDriver/chromedriver");
// System.setProperty("webdriver.chrome.driver","Users/princygoel/eclipse-workspace/SeleniumWebDriver/Driver/ChromeDriver/chromedriver");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://echoecho.com/htmlforms10.htm");
 
List<WebElement> wb = driver.findElements(By.name("group1"));

for(WebElement w : wb) {
	System.out.println("Before Status of " +  w.getAttribute("Value") + " " + w.isSelected());
	w.click();
	System.out.println("-----");
	System.out.println("After Status of " +  w.getAttribute("Value") + " " + w.isSelected());
	
}



}
	
 }
	



