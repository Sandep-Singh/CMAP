package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class USOfficial extends CMAP_Homepage {
	
	
	//Seeking Pre Approval//
	public void SeekingPreApproval()
	{
		WebElement seekingpreapproval = driver.findElement(By.id("ContentLayoutPlaceHolder_ContentPlaceHolderAdditionalControls_repeaterEndUserLevel1_btn_subsection_0"));
		seekingpreapproval.click();
	}
	
	public void MealorGift()
	{
		WebElement mealorgift = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl00$RadioButtonGroup"));
		mealorgift.click();
	}
	
	public void OutsideActivityPreapproval()
	{
		WebElement outsideactivitypreapproval = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl01$RadioButtonGroup"));
		outsideactivitypreapproval.click();
	}
	
	public void PoliticalContributionPreapproval()
	{
		WebElement politicalcontributionpreapproval= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl02$RadioButtonGroup"));
		politicalcontributionpreapproval.click();
	}
	
	public void OtherPreApproval()
	{
		WebElement otherpreapproval = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl03$RadioButtonGroup"));
		otherpreapproval.click();
	}
	
	
	//Deloitte Policy//
	
	public void DeloittePolicy()
	{
		WebElement deloittepolicy = driver.findElement(By.id("ContentLayoutPlaceHolder_ContentPlaceHolderAdditionalControls_repeaterEndUserLevel1_btn_subsection_1"));
		deloittepolicy.click();
	}
	
	public void APR130()
	{
		WebElement apr130= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl00$RadioButtonGroup"));
		apr130.click();
	}

	
	public void APR131()
	{
		WebElement apr131= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl01$RadioButtonGroup"));
		apr131.click();
	}

	
	public void APR135()
	{
		WebElement apr135= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl02$RadioButtonGroup"));
		apr135.click();
	}
	
	public void DPM31100()
	{
		WebElement dpm31100 = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl03$RadioButtonGroup"));
		dpm31100.click();
	}

	
	
	
	//Lobbying//
	public void Lobbying()
	{
		WebElement seekingpreapproval = driver.findElement(By.id("ContentLayoutPlaceHolder_ContentPlaceHolderAdditionalControls_repeaterEndUserLevel1_btn_subsection_2"));
		seekingpreapproval.click();
	}
	
	public void Federal()
	{
      WebElement federal = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl00$RadioButtonGroup"));
      federal.click();
		
	}
	
	
	public void StateAndLocal()
	{
		WebElement stateandlocal = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl01$RadioButtonGroup"));
		stateandlocal.click();
	}
	
	//A topic not listed above//
    public void ATopicNotListedAbove()
    {
    	WebElement seekingpreapproval = driver.findElement(By.id("ContentLayoutPlaceHolder_ContentPlaceHolderAdditionalControls_repeaterEndUserLevel1_btn_subsection_3"));
		seekingpreapproval.click();
    }
	
    public void Other()
    {
    	WebElement other = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl00$RadioButtonGroup"));
    	other.click();
    }
}
