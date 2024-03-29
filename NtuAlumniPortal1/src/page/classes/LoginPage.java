package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	WebDriver driver;
	
	
	public static WebElement element= null;
	
	public static WebElement linkedinLogin(WebDriver driver){
		element= driver.findElement(By.id("dnn_ctr532_ntuLogin_Login_Linkedin_loginButton"));
		return element;
		
		
	}
	
	public static WebElement facebookLogin(WebDriver driver){
	
		element= driver.findElement(By.id("dnn_ctr532_ntuLogin_Login_Facebook_loginButton"));
		return element;
		
	
	}

	
	@FindBy(id= "session_key-oauth2SAuthorizeForm")
    WebElement linkedinemailTextbox ;
	
	@FindBy(id="session_password-oauth2SAuthorizeForm")
	WebElement linkedinpasswordTextbox;
	
	@FindBy(name= "authorize")
	WebElement linkedinAllowAccessButton;
	
	@FindBy(linkText= "http://ntualumniportal.excelindia.com/NTULogin/Admin?error=access_denied&amp;error_description=the+user+denied+your+request&amp;state=Linkedin#!")
	WebElement linkedinCancelButton;
	
	@FindBy(id= "email")
	WebElement facebookEmailTextbox;
	
	@FindBy(id="pass")
	WebElement facebookPasswordTextbox;
	
	@FindBy(id= "loginbutton")
	WebElement facebookLoginButton;
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void linkedinEnterEmail(String email) {
		
		linkedinemailTextbox.sendKeys(email);
	}
	
	public void linkedinEnterPassword(String password) {
		
		linkedinpasswordTextbox.sendKeys(password);
	}
	
	public void linkedinClickAllowAccessButton(){
		
		linkedinAllowAccessButton.click();
	}
	
	public void linkedinClickCancelButton(){
		linkedinCancelButton.click();
	}
	
	public void facebookEnterEmail(String email){
		
		facebookEmailTextbox.sendKeys(email);
	}
	
	public void facebookEnterPassword(String password){
		
		facebookPasswordTextbox.sendKeys(password);
	}
	
	public void facebookClickLoginButton(){
		
		facebookLoginButton.click();
	}
	
	
}
