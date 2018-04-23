package page.classes;

import org.testng.annotations.Test;

import page.classes.LoginPage;


import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class TestNG {
	
	private static  WebDriver driver;
	private String baseURL = "http://ntualumniportal.excelindia.com/NTULogin";
	private static String social= "linkedin";


 
	
  @BeforeSuite
  public void beforeClass() {

	 System.setProperty("webdriver.chrome.driver","C:\\Users\\shilpi.agarwal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 driver.get(baseURL);
	   }
  
 
  @Test
  public static void socialLogin() throws InterruptedException {
	  
	  if(social.equals("linkedin")) {
		  
		  LoginPage.clicklindekinButton(driver);
		  Thread.sleep(2000);
	  }
	  
	  else {
		  
		  LoginPage.clickfacebookButton(driver);
	  }
	    
  }

  @AfterSuite
  public void afterClass() {
	  driver.quit();
  }

}
