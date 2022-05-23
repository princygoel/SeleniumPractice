package UIelements;

//import java.awt.List;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
System.out.println(projectPath);

System.setProperty("webdriver.chrome.driver","Driver/ChromeDriver/chromedriver");
// System.setProperty("webdriver.chrome.driver","Users/princygoel/eclipse-workspace/SeleniumWebDriver/Driver/ChromeDriver/chromedriver");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://echoecho.com/htmlforms09.htm");
List<WebElement> wb = driver.findElements(By.xpath("//input[contains(@name,'option')]"));
/* for(int i =0;i<wb.size();i++) {
	 if(wb.get(i).isEnabled()==true) {
		 System.out.println("the checkbox "+(i+1)+" is selected" +wb.get(i).isSelected());
		 wb.get(i).click();
	 }
	 */
   int i =1;
	 for (WebElement w : wb) {
		 if(w.isEnabled()) {
			 System.out.println("Before click cb" +i + " with title " + w.getAttribute("Value")+ " is selected?" +w.isSelected());
			 w.click();
			 System.out.println("After click cb" +i+  " with title " + w.getAttribute("Value")+ " is selected?"  +w.isSelected());
			 }
		 i++;
		 
	 }
	driver.close();
	driver.quit();

 }
	
 

  }
	
