	/* Jino philip
	 * 
	 * This Class is used for Storing all the Locators
	 */


package Zmartasweden.Zmartasweden;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {
	
	WebDriver driver;
	
	//Loan
	
	By apply = By.xpath("(//a[contains(text(),'Ansök nu')])[2]");
	By loan = By.xpath("//a[contains(text(),'Samla dina lån')]");
	

	public Locators (WebDriver driver)
 
	
	{
		this.driver = driver;
		
	
	}
	
	
	//Loan
	
	public void ApplyLoan() 
	
	{
		
		driver.findElement(apply).click();
		driver.findElement(loan).click();
		
		
		
	}
	
	
}
