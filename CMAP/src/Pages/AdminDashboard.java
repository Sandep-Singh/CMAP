package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Baseclass.Login;

public class AdminDashboard extends Login {
	
	public void CreateNewCase()
	{
		WebElement createcase = driver.findElement(By.xpath(".//a[@title='Create a new case']"));
		createcase.click();
	}
	
	public void Casestab()
	{
		WebElement cases = driver.findElement(By.xpath(".//a[@title='Cases']"));
		cases.click();
	}
	 
	public void Administration()
	{
		WebElement admin = driver.findElement(By.xpath(".//a[@title='Questionnaires, User Roles, Alerts']"));
		admin.click();
	}
	
	public void search()
	{
		WebElement search = driver.findElement(By.xpath(".//a[@title='Search']"));
		search.click();
	}
	

}
