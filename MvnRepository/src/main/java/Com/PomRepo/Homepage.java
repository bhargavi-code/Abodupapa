package Com.PomRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage 
{
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement createbtn;
	
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement campaignname;
	
	@FindBy(xpath="//input[@type='radio'][1]")
	private WebElement radiobtn;
	
	@FindBy(xpath="//input[@type='submit'][1]")
	private WebElement savebtn;

	public WebElement getCreatebtn() {
		return createbtn;
	}

	public WebElement getCampaignname() {
		return campaignname;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
}
