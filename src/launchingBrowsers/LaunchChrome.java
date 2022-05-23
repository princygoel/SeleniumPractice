package launchingBrowsers;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChrome {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver","Driver/ChromeDriver/chromedriver");
	// System.setProperty("webdriver.chrome.driver","Users/princygoel/eclipse-workspace/SeleniumWebDriver/Driver/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("URl of the application"+driver.getPageSource());
		System.out.println("URl of the application"+driver.getCurrentUrl());
		System.out.println("Title of the application"+driver.getTitle());
		driver.close();
		driver.quit();
		}

}
