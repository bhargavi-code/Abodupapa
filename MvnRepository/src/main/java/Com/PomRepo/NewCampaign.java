package Com.PomRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCampaign 
{
	@FindBy(xpath="//a[text()='More']")
	private WebElement more;
	
	@FindBy(xpath="//a[text()='Campaigns']")
	private WebElement campaign;

	public WebElement getMore() {
		return more;
	}

	public WebElement getCampaign() {
		return campaign;
	}
}
