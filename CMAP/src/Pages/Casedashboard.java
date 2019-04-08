package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Baseclass.Login;

public class Casedashboard extends Login {
	
	
	
// Cases Tab //
	public void Cases()
	{
		WebElement cases = driver.findElement(By.xpath(".//a[@title='Cases']"));
		cases.click();
		
		driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
	}
	
	// Show Action able checkbox//

	public void Actionable()
	{
		WebElement action = driver.findElement(By.id("ContentLayoutPlaceHolder_DashBoardPageContentPlaceHolder_chkActionableOnly"));
		action.click();
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	}
	
	public void InprocessStatus()
	{
		WebElement inprocess = driver.findElement(By.xpath(".//table[@id='ContentLayoutPlaceHolder_DashBoardPageContentPlaceHolder_ucProcessGrid_gvGroup']/tbody/tr[3]"));
		inprocess.click();
		////*[@id="ContentLayoutPlaceHolder_DashBoardPageContentPlaceHolder_ucProcessGrid_gvGroup"]/tbody/tr[3]
	}
}
