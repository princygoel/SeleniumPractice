package UIelements;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
        System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jobserve.com/in/en/Job-Search/");
		//Clicking on image
		driver.findElement(By.className("bannerslider")).click();
		System.out.println("Window id of current window is" +driver.getWindowHandle());
		Set<String> windowIDs = driver.getWindowHandles();		
	    Iterator<String> itr = windowIDs.iterator();
		String win1 =  itr.next();
		String win2 = itr.next();
		driver.switchTo().window(win2);
		driver.findElement(By.id("JobSearch_Keywords")).sendKeys("testing");
		driver.findElement(By.className("fat")).click();
		driver.close();
		driver.switchTo().window(win1);
		System.out.println("Window id of current window is" +driver.getWindowHandle());
		Thread.sleep(3000);
		driver.quit();
	}

}
