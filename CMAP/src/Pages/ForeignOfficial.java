package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForeignOfficial extends CMAP_Homepage {
	
	
	//Deloitte Policy //
	public void DeloittePolicy() throws Exception
	{
		WebElement deloittepolicy = driver.findElement(By.id("ContentLayoutPlaceHolder_ContentPlaceHolderAdditionalControls_repeaterEndUserLevel1_btn_subsection_0"));
		deloittepolicy.click();
		
		Thread.sleep(4000);
	}
	
	public void APR920()
	{
		WebElement apr920= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl00$RadioButtonGroup"));
		apr920.click();
	}
	
	public void APR921()
	{
		WebElement apr920= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl01$RadioButtonGroup"));
		apr920.click();
	}
	
	public void APR922()
	{
		WebElement apr920= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl02$RadioButtonGroup"));
		apr920.click();
	}
	
	public void DPM1550()
	{
		WebElement apr920= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl03$RadioButtonGroup"));
		apr920.click();
	}
	
	public void DPM1551()
	{
		WebElement apr920= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl04$RadioButtonGroup"));
		apr920.click();
	}
	public void CorssFunctionalDeloittePolicy10150()
	{
		WebElement apr920= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl05$RadioButtonGroup"));
		apr920.click();
	}
	
	//Seeking Pre Approval //
	public void SeekingPreApproval()
	{
    	WebElement seekingpreapproval = driver.findElement(By.id("ContentLayoutPlaceHolder_ContentPlaceHolderAdditionalControls_repeaterEndUserLevel1_btn_subsection_1"));
		seekingpreapproval.click();
	}
	
	public void ExpenditureorEventInvovingaForeignOfficial()
	{
		WebElement apr920= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl00$RadioButtonGroup"));
		apr920.click();
	}
	
	public void OutsideActivityPreApproval()
	{
		WebElement apr920= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl01$RadioButtonGroup"));
		apr920.click();
	}
	
	public void OtherPreApproval()
	{
		WebElement apr920= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl02$RadioButtonGroup"));
		apr920.click();
	}
	
	
	// Third Party Relation//
	public void ThirdPartyRelation()
	{
		WebElement thirdpartyrelation = driver.findElement(By.id("ContentLayoutPlaceHolder_ContentPlaceHolderAdditionalControls_repeaterEndUserLevel1_btn_subsection_2"));
		thirdpartyrelation.click();
	}
	
	public void AntiCorruptionThirdPartyReviewStatusInquiry()
	{
		WebElement apr920= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl00$RadioButtonGroup"));
		apr920.click();
	}
	
	public void TechnicalIssuesWithThirdPartyQuestionnaireorTrainingApplications()
	{
		WebElement apr920= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl01$RadioButtonGroup"));
		apr920.click();
	}
	
	public void InquiryonThridPartyDueDiligenceProcessorTimeline()
	{
		WebElement apr920= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl02$RadioButtonGroup"));
		apr920.click();
	}
	
	public void OtherThirdPartyRelatedInquiries()
	{
		WebElement apr920= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl03$RadioButtonGroup"));
		apr920.click();
	}
	
	
     // A Topic Not listed Above//
	public void ATopicNotListedAbove()
	{
		WebElement topicnotlisted = driver.findElement(By.id("ContentLayoutPlaceHolder_ContentPlaceHolderAdditionalControls_repeaterEndUserLevel1_btn_subsection_3"));
		topicnotlisted.click();
	}
	
	
	public void Other()
	{
		WebElement other = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$repeaterLevel2$ctl00$RadioButtonGroup"));
		other.click();
	}
	

	
}
