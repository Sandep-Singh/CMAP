package Baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static WebDriver driver;
	public static String URL ="https://qlrr.hosting.deloitte.com/CMAP/";
	public static String Endusername= "usqaex\\clolsen";
	public static String Adminusername = "usqaex\\rcarleo";
	public static String password = "Portal123!";
	
	 
	 
	 
	 
	 public void callchormebrower()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\sandeep_deloitte\\automation\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
		 
		 driver.get(URL);
		 
		 driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS);
		 
		 
		 driver.findElement(By.xpath(".//div[@class='idpDescription float']")).click();
	 }

	 
	 public  void enduserlogincredentials()
	 {
		 WebElement username = driver.findElement(By.id("userNameInput"));
		 username.sendKeys(Endusername);
		 
		 WebElement pass = driver.findElement(By.id("passwordInput"));
		 pass.sendKeys(password);
		 
		 WebElement SignIn = driver.findElement(By.xpath(".//span[@id='submitButton']"));
		 SignIn.click();
		 
		 System.out.println("System login successfully with end user credentials...");
	 }

	 public  void Adminlogincredentials()
	 {
		 WebElement username = driver.findElement(By.id("userNameInput"));
		 username.sendKeys(Adminusername);
		 
		 WebElement pass = driver.findElement(By.id("passwordInput"));
		 pass.sendKeys(password);
		 
		 WebElement SignIn = driver.findElement(By.xpath(".//span[@id='submitButton']"));
		 SignIn.click();
		 
		 System.out.println("System login successfully with end user credentials...");
	 }

	 
	 public void close()
	 {
		 driver.close();
	 }
}
