package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	public static WebElement element= null;
	private WebDriver driver;
	

	public static WebElement linkedinButton(WebDriver driver){
		element= driver.findElement(By.id("dnn_ctr532_ntuLogin_Login_Linkedin_loginButton"));
		return element;
		
    }
	
	public static void clicklindekinButton(WebDriver driver){
		
		element = linkedinButton(driver);
		element.click();
	}
	
	public static WebElement facebookButton(WebDriver driver){
	
		element= driver.findElement(By.id("dnn_ctr532_ntuLogin_Login_Facebook_loginButton"));
		return element;
	}
	
	public static  void clickfacebookButton(WebDriver driver){
		element = facebookButton(driver);
		element.click();
	}
	

}