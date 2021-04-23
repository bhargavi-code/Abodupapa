package Pom.TestCaseRepo;

import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import Com.GenericRepo.BaseClass;
import Com.GenericRepo.ExcelUtility;
import Com.PomRepo.Homepage;
import Com.PomRepo.NewCampaign;

public class Createcmpeign extends BaseClass
{
	@Test
	 public void samplecampgn() throws Exception
	 {
		NewCampaign nc = PageFactory.initElements(driver, NewCampaign.class);  
		ExcelUtility ex = new ExcelUtility();
		Homepage hp = PageFactory.initElements(driver, Homepage.class);
		Actions act = new Actions(driver);
		act.moveToElement(nc.getMore()).perform();
		nc.getCampaign().click();
		System.out.println("success");
		
		hp.getCreatebtn().click();
		String data = ex.getreaddata("Sheet1",1,2);
		hp.getCampaignname().sendKeys(data);
		hp.getRadiobtn().click();
		hp.getSavebtn().click();
		System.out.println("success");
		
	 }
}
