package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
	
	@FindBy(tagName = "img")
	WebElement profileImage;
	
	@FindBy(xpath = "//a[text()="View all Events"])
	WebElement viewAllEvents;
	
	

}
