package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Baseclass.Login;

public class CMAP_Homepage extends Login{
	
	
	public void CMAPtitle()
	{
		String pagetitle = driver.getTitle();
		Assert.assertEquals("The page title does not matched", "C-MAP End User Landing Page", pagetitle);
	}

	public void CasesTab()
	{ 
		WebElement Case = driver.findElement(By.xpath(".//a[@title='Cases']"));
		Case.click();
		
		driver.navigate().to("https://qlrr.hosting.deloitte.com/CMAP/Consultation/EndUserDashboard.aspx");
		
		
	}
	
	public void ForeignOfficial()
	{
		
		WebElement foreign = driver.findElement(By.xpath("xpath=(//div[@id='divMainSection'])[2]"));
		//WebElement foreign = driver.findElement(By.id("ContentLayoutPlaceHolder_ContentPlaceHolderAdditionalControls_repeaterEndUserDashboard_hdnCurrentSectionID_0"));
		   foreign.click();
		   //foreign.sendKeys(Keys.ENTER);
	}
	
	public void USOfficial()
	{
		WebElement US= driver.findElement(By.id("ContentLayoutPlaceHolder_ContentPlaceHolderAdditionalControls_repeaterEndUserDashboard_hdnCurrentSectionID_1"));
		US.click();
	}
	
	public void NonGovernmentMatter()
	{
		WebElement NonGM = driver.findElement(By.id("ContentLayoutPlaceHolder_ContentPlaceHolderAdditionalControls_repeaterEndUserDashboard_hdnCurrentSectionID_2"));
		NonGM.click();
	}
	
	
}
