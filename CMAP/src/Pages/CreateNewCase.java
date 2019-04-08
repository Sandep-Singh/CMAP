package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.description.modifier.SynchronizationState;

public class CreateNewCase  extends AdminDashboard{
	
	
	public void ReportedOn()
	{
		WebElement reportedondate = driver.findElement(By.id("txtReportedOn"));
		reportedondate.getText();
			
	}
	
	public void CompanyClient() throws InterruptedException
	{
		WebElement Client = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$txtCompanyClient"));
		Client.sendKeys("Deloitte");
		
		Client.sendKeys(Keys.ARROW_DOWN);
		Client.sendKeys(Keys.ADD);
		/*
		WebElement company = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$SearchIconBtn"));
		company.click();
	

		driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
		
		
		WebElement clientname = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$EntitySearchPopup$txtOCMSearch"));
		
		clientname.sendKeys("amazon");
	
		
		driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
		
		driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$EntitySearchPopup$btnSearch")).click();
		

		driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
		
		
		
		
		
		driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$EntitySearchPopup$EntitySearchResults$ctl04$hdnDgmfId")).click();
		

		driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
		*/
	}

	public void IntakeSource()
	{
		Select intakesource = new Select(driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$ddlIntakeSrc")));
		intakesource.selectByIndex(2);
		
	}
	
	public void PeerGroup()
	{
		Select peergroup = new Select(driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$ddlPeerGroup")));
		peergroup.selectByIndex(2);
		
	}
	
	public void AddJursidction() throws Throwable
	{
		driver.findElement(By.id("lnkBtnAddJurisdictionEnabled")).click();
		
		//country//
		
		Select country = new Select(driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$ddlCountry")));
		country.selectByIndex(1);
		
		Thread.sleep(5000);
		
		//state//
		Select state = new Select(driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$ddlState")));
		state.selectByIndex(1);
		
		Thread.sleep(5000); 
		
		//city//
		Select city = new Select(driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$ddlCity")));
		city.selectByIndex(1);
		
		driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$btnAdd")).click();
		
	}
	
	public void PersonId() throws Exception
	{
		WebElement personid = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$textBoxPersonnelNumber"));
		personid.getText();
		
		Thread.sleep(5000);
	}
	
	public void ReportedBy() throws Throwable
	{
		WebElement reportedby = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$tbReportedBy"));
		reportedby.getText();
		
		Thread.sleep(5000);
	}
	
	public void StragticClient()
	{
		Select stragtic = new Select(driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$ddlStrategicClient")));
		stragtic.selectByIndex(1);
	}
	
	public void Priority()
	{
	  Select priority = new Select(driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$ddlPriority")));
	  priority.selectByIndex(1);
	}
	
	public void PPMD()
	{
		Select ppmd = new Select(driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$ddlPPD")));
		ppmd.selectByIndex(0);
	}
	
	public void Unasignedmode()
	{
		WebElement unassignedmode = driver.findElement(By.id("ContentLayoutPlaceHolder_DashBoardPageContentPlaceHolder_rblAssignedTo_0"));
		unassignedmode.isSelected();
	}
	
	
	public void Me()
	{
		WebElement me = driver.findElement(By.id("ContentLayoutPlaceHolder_DashBoardPageContentPlaceHolder_rblAssignedTo_1"));
		me.click();
	}
	
	public void Other()
	{
		WebElement other = driver.findElement(By.id("ContentLayoutPlaceHolder_DashBoardPageContentPlaceHolder_rblAssignedTo_2"));
		other.click();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		Select manager = new Select(driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$ddlICManager")));
		manager.selectByIndex(3);
	}
	
	public void Continue()
	{
		WebElement cont= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$btnContinue"));
		cont.click();
		
		driver.manage().timeouts().pageLoadTimeout(4000,TimeUnit.SECONDS);
	}
	
	public void CaseTopics() 
	{
		WebElement casetopics = driver.findElement(By.xpath(".//td[@id='ContentLayoutPlaceHolder_DashBoardPageContentPlaceHolder_ucTopics_cell_6']"));
		casetopics.click();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		WebElement TopicDesc = driver.findElement(By.xpath(".//span[@id='spnDescr']"));
	if(TopicDesc.getAttribute("Value") != null)
    {
    	TopicDesc.getText();
    }
    
	WebElement Questionnaire= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$ucTopics$btnGotoQuestionnaire"));
	Questionnaire.click();
 

	driver.manage().timeouts().pageLoadTimeout(4000,TimeUnit.SECONDS);
    
	}
	
	
	public void SubTopic()
	{
		Select subtopic = new Select(driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$RoundedBoxGrid$ddlSubTopic")));
		subtopic.selectByIndex(1);
	}
	
	
	public void SendCreateEmail()
	{
		Select sendcreateemail = new Select(driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$RoundedBoxGrid$ddlEmail")));
		sendcreateemail.selectByIndex(1);
	}
	
	public void SummaryKeywords()
	{
		WebElement summarykeywords = driver.findElement(By.id("ContentLayoutPlaceHolder_DashBoardPageContentPlaceHolder_RoundedBoxGrid_textboxTags"));
		summarykeywords.sendKeys(" Its dummy case for testing purpose");
	}
	
	public void Fbackground() throws Exception
	{
		WebElement fbackground = driver.findElement(By.id("txtFactsBackgrounds"));
		fbackground.sendKeys(" Its dummy case for testing purpose");
		
		Thread.sleep(5000);
	}
	
	public void pagecsrolldown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)", "");
	}
	
	
	public void CaseCreatedSuccessfullMessage()
	{
		WebElement casenumber= driver.findElement(By.xpath(".//div[@id='ContentLayoutPlaceHolder_tblMessage']"));
		casenumber.getAttribute("value");
		
		System.out.println("Successfully case created by ICG team member");
	}
	
}
