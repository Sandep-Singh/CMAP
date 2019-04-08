package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class FormeandOther extends CMAP_Homepage {

	public void createbtn()
	{
		WebElement create = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$btnCreateCase"));
		create.click();
	}
	
	

	// Create a new case for himeself//
	public void formeradiobutton()
	{	
		
		WebElement continuebtn = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$btnContinue"));
		continuebtn.click();
		
		WebElement FactsandBackground = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$RoundedBoxGrid$txtFactsBackgrounds"));
		FactsandBackground.getAttribute("value");
		}
	
	//Create a new case for Others users//
	public void otherradiobutton() 
	{
			WebElement For = driver.findElement(By.id("ContentLayoutPlaceHolder_ContentPlaceHolderAdditionalControls_rdbForOthers"));
			For.click();
	}
	
	public void peoplepicker() throws Exception
	{
				WebElement peoplePicker = driver.findElement(By.xpath(".//img[@src='/CMAP/Images/People Picker.png']"));
			peoplePicker.click();
			
			driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
			
			WebElement SearchContactName= driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$PeoplePickerControl$ContentLayoutPlaceHolder_DashBoardPageContentPlaceHolder_PeoplePickerControl_textboxPeopleName"));
			SearchContactName.sendKeys("mrokes");
			
			Thread.sleep(5000);
			
			WebElement Userradiobtn = driver.findElement(By.name("selectPeople"));
			Userradiobtn.click();
			
			
			WebElement OkBtn = driver.findElement(By.xpath(".//span[@class='ui-button-text']"));
			OkBtn.click();
			
			Thread.sleep(3000);
	}
	
	public void continuebutton()
	{
			WebElement continuebtn = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$ContentPlaceHolderAdditionalControls$btnContinue"));
			continuebtn.click();
	}
	
	
	public void FactsandBackground()
	{
		
	       WebElement FactsandBackground = driver.findElement(By.name("ctl00$ctl00$ContentLayoutPlaceHolder$DashBoardPageContentPlaceHolder$RoundedBoxGrid$txtFactsBackgrounds"));
			FactsandBackground.getAttribute("value");
			
			
	}
			
	
	public void submitbtn()
	{
		WebElement submit = driver.findElement(By.xpath(".//button[@id='ButtonSubmit_top']"));
		submit.sendKeys(Keys.ENTER);
	}

	public void SaveAsDraftbtn()
	{
		WebElement saveasdraft = driver.findElement(By.id("ContentLayoutPlaceHolder_DashBoardPageContentPlaceHolder_RoundedBoxGrid_ButtonSaveAsDraft_top"));
		saveasdraft.click();
	}
	
	public void Deletecase()
	{
		WebElement Delete = driver.findElement(By.id("ContentLayoutPlaceHolder_DashBoardPageContentPlaceHolder_RoundedBoxGrid_btnDeleteCase_top"));
		Delete.click();
		
	}

	 
	
	
}
