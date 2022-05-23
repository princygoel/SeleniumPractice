package UIelements;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow2 {
	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
        System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.online.citibank.co.in/");
		//Clicking on image
		driver.findElement(By.id("loginId")).click();
		System.out.println("Window id of current window is" +driver.getTitle());
		Set<String> windowIDs = driver.getWindowHandles();		
	    Iterator<String> itr = windowIDs.iterator();
		String win1 =  itr.next();
		String win2 = itr.next();
		driver.switchTo().window(win2);
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(win1);
		System.out.println("Window id of current window is" +driver.getTitle());
		driver.quit();
	}

}
