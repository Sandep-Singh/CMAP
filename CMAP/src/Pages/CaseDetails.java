package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Baseclass.Login;

public class CaseDetails extends Login {

	public void CaseDetailsTab()
	{
		WebElement casedetailstab = driver.findElement(By.xpath(".//span[@class='labelField CDTab0Text']"));
		casedetailstab.click();
		//*[@id="spanOverviewNavigatorText"]
		//*[@id="spanOverviewNavigatorText"]
	}
	
	public void AttachmentTab()
	{
		WebElement attachtab = driver.findElement(By.xpath(".//span[@class='labelField CDTab1Text']"));
		attachtab.click();
		
	}
	
	public void WorkflowLogandComment()
	{
		WebElement workflowtab = driver.findElement(By.xpath(".//span[@class='labelField CDTab2Text']"));
		workflowtab.click();
		
	}
	
	public void Savebtn()
	{
		WebElement savebtn = driver.findElement(By.name("ctl00$ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderSiteMap$ActionButtonContentPlaceHolder$btnSaveCaseTop"));
		savebtn.click();
	}
	
	public void DoNotShowThisCaseOutsideCMAPTeam()
	{
		WebElement donotshow = driver.findElement(By.id("ContentLayoutPlaceHolder_DashBoardPageContentPlaceHolder_RecordOverviewNavigationControl_RecordOverviewContentHolder_ucCaseType_chklistCaseAttribute_0"));
		donotshow.click();
	}
	
	public void ClassifiedCase()
	{
		WebElement classifiedcase = driver.findElement(By.id("ContentLayoutPlaceHolder_DashBoardPageContentPlaceHolder_RecordOverviewNavigationControl_RecordOverviewContentHolder_ucCaseType_chklistCaseAttribute_1"));
		classifiedcase.click();
	}
	
	public void None()
	{
		WebElement none = driver.findElement(By.id("ContentLayoutPlaceHolder_DashBoardPageContentPlaceHolder_RecordOverviewNavigationControl_RecordOverviewContentHolder_ucCaseType_chklistCaseAttribute_2"));
		none.isSelected();
	}
	
	public void Conculsion()
	{
		WebElement conculsion = driver.findElement(By.name("ctl00$ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$RecordOverviewNavigationControl$RecordOverviewContentHolder$ucFactsBackgrounds$txtNotes"));
		conculsion.getAttribute("value");
	}
	
	public void PPMD()
	{
		WebElement ppmd = driver.findElement(By.name("ctl00$ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$RecordOverviewNavigationControl$RecordOverviewContentHolder$ucCaseReview$ddlPPD"));
		Select md = new Select(ppmd);
		md.selectByIndex(7);
	}
	
	public void ReviewRequiredCheckbox()
	{
		WebElement review = driver.findElement(By.id("ContentLayoutPlaceHolder_DashBoardPageContentPlaceHolder_RecordOverviewNavigationControl_RecordOverviewContentHolder_ucCaseReview_chkAcknowledge"));
		review.click();
	}
	
	public void AdditionalReviewers()
	{
		WebElement additionalreviewers= driver.findElement(By.name("ctl00$ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$RecordOverviewNavigationControl$RecordOverviewContentHolder$ucCaseReview$repReviewers$ctl00$ddlReviewer"));
		additionalreviewers.click();
	}
	
	
}
