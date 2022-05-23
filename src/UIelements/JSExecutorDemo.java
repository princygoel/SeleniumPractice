package UIelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Driver/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1000");");
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		/*js.executeScript("document.getElementById('login1').value='deepika';");
		js.executeScript("document.getElementById('password').value='deepika';");
        WebElement username = driver.findElement(By.id("login1"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement signInBtn = driver.findElement(By.name("proceed"));
        js.executeScript("arguments[0].value='deepika'",username);
        js.executeScript("arguments[0].value='princy'",password);
        js.executeScript("arguments[0].click()",signInBtn);
        String unValue = js.executeScript("return document.getElementById('login1').value;").toString();
        String pwdValue = js.executeScript("return document.getElementById('password').value;").toString();
        System.out.println(unValue);
        System.out.println(pwdValue);*/
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		js.executeScript("window.location = 'https://www.google.com';");
		js.executeScript("history.go(0)");
		
  
	}
}
