package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RediffLoginPage {
	
	@CacheLookup
	@FindBy(id = "login1")
	WebElement userName;
	@CacheLookup
	@FindBy(id = "password")
	WebElement password;
	@CacheLookup
	@FindBy(name = "proceed")
	WebElement loginBtn;
	@FindBy(linkText = "Forgot Password?")
	WebElement forgotPwdLink;
	@FindBy(partialLinkText = "Create a")
	WebElement creatActLink;
	@FindBy(id = "remember")
	WebElement keepMeSignInCB;
	WebDriver driver;
	@FindBy(id = "div_login_error")
	WebElement error;
	
	
	
	//Constructor
	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this);
	}
	public void setUserName(String un) {
		userName.sendKeys(un);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickLoginBtn() {
		loginBtn.click();
	}
	public void login() {
		setUserName("abc");
		setPassword("abc");
		clickLoginBtn();
	}
	public void checkStatus() {
		System.out.println("Keep me sign in box ? " +keepMeSignInCB.isDisplayed());
		System.out.println("Keep me sign in box ? " +keepMeSignInCB.isEnabled());
		System.out.println("Keep me sign in box ? " +keepMeSignInCB.isSelected());
		
	}
	public void checkForgotPwdLink() {
		forgotPwdLink.click();
		
	}
     public void checkCreatActLink() {
    	 
    	 creatActLink.click();
		
	}
	
	public String checkError() {
		String errMsg = error.getText();
		return errMsg;
	}
	
}
