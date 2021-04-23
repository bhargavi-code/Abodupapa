package Com.PomRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout 
{
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement logout;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signout;

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getSignout() {
		return signout;
	}
}
