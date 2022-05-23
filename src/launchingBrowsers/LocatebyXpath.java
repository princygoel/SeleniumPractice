package launchingBrowsers;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocatebyXpath {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
System.out.println(projectPath);

System.setProperty("webdriver.chrome.driver","Driver/ChromeDriver/chromedriver");
// System.setProperty("webdriver.chrome.driver","Users/princygoel/eclipse-workspace/SeleniumWebDriver/Driver/ChromeDriver/chromedriver");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.rediff.com/");

/*driver.findElement(By.xpath("div.table>div:nth-child[2]>a:nth-child[1)]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//input[@name = 'login']")).sendKeys("deepika");
		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("deepika");
	String text =	driver.findElement(By.xpath("//*[text()='TOP HEADLINES']")).getText();
	System.out.println(text);
	driver.findElement(By.xpath("//input[contains(@id,'log')]")).sendKeys("deepika");
   driver.findElement(By.xpath("//*[contains(text(),'Enterprise')]/following-sibling::a[1]")).click();
   driver.findElement(By.xpath("//*[contains(text(),'Business')]/preceding-sibling::a[1]")).click();
		 */


	}

}
