	/* Jino philip
	 * 
	 * This Class is used for Storing all the Locators
	 */


package Zmartasweden.Zmartasweden;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
//import com.sun.org.apache.bcel.internal.generic.Select;

public class Locators {
	
	WebDriver driver;
	//private StringBuffer verificationErrors = new StringBuffer();
	//public int Count = 0;
	
	//Loan
	
	
	By apply = By.xpath("(//a[contains(text(),'Ansök nu')])[2]");
	By loan = By.xpath("//a[contains(text(),'Samla dina lån')]");
	By amount =By.name("loanAmount");
	By years = By.name("paymentYears");
	By next = By.xpath("//form[@id='application']/div[6]/div/div[2]/button");
	

	//Personal Information
	
	By ssn = By.name("pNo");
	By email = By.name("email");
	By mob = By.name("telNr");
	By add = By.xpath("//div[4]/div/a");
	By cossn = By.name("CopNo");
	By coemail =By.name("Coemail");
	By comob =By.name("CotelNr");
	By approve = By.xpath("//div[@id='approveTermsStep1']/div/label/span");
	By next1 = By.xpath("//form[@id='application']/div[6]/div/div[2]/button[2]");
	By close = By.xpath("//div[@id='msg']/div/a");
	
	// Building Tasks
	
	By coapplicantliving = By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/div[2]/div/div[2]/div/div/div[1]/label");
	By maritalstatus = By.xpath("//div[3]/div/div/div/select");
	By children = By.name("nrOfChildren");
	By residence =By.name("residenceType");
	By rent =By.name("rent");
	By mortgageyes =By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/div[2]/div/div[3]/div[5]/div/div/div[1]/label");
	By mortgagerent =By.name("mortgageMonthly");
	By mortgageno = By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/div[2]/div/div[3]/div[5]/div/div/div[2]/label");
	By coapplicantlivingno = By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/div[2]/div/div[2]/div/div/div[2]/label");
	By comarital =By.name("ComaritalStatus");
	By cochildren =By.name("ConrOfChildren");
	By coresidence =By.name("CoresidenceType");
	By corent =By.name("Corent");
	By next2 = By.xpath("//button[@type='button']");
	
	
	 
	public Locators (WebDriver driver)
 
	
	{
		this.driver = driver;
		
	
	}
	
	
	//Loan
	
	public void ApplyLoan() throws InterruptedException 
	
	{
		Thread.sleep(3000);
		driver.findElement(apply).click();
		driver.findElement(loan).click();
		Thread.sleep(3000);
		driver.findElement(amount).sendKeys("15000");
		Thread.sleep(3000);
		new Select (driver.findElement(years)).selectByVisibleText("14 år");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(next).click();
	
	}
	
//Personal Information
	
	public void PersonalInfo() throws InterruptedException
	
	{
		
		driver.findElement(ssn).sendKeys("390619-6369");
		driver.findElement(email).sendKeys("test@gmail.com");
		driver.findElement(mob).sendKeys("9745754904");
		Thread.sleep(3000);
		driver.findElement(add).click();
		driver.findElement(cossn).sendKeys("961009-9914");
		driver.findElement(coemail).sendKeys("qa1@gmail.com");
		driver.findElement(comob).sendKeys("9747835332");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(approve).click();
		driver.findElement(next1).click();
		Thread.sleep(3000);
		driver.findElement(close).click();
		Thread.sleep(5000);
		
		
		driver.findElement(coapplicantliving).click();
		new Select(driver.findElement(maritalstatus)).selectByVisibleText("Gift/Partnerskap");
		new Select(driver.findElement(children)).selectByVisibleText("0");
		new Select(driver.findElement(residence)).selectByVisibleText("Bostadsrätt");
		driver.findElement(rent).sendKeys("2500");
		
		
		
		for (int i=1;i<=3;i++) {
			
		if (i==1)
				
		{
				
		driver.findElement(mortgageyes).click();
	    driver.findElement(mortgagerent).sendKeys("2000");
	   
		
			
		}
		 if (i==2)
		
		{
				 Thread.sleep(3000);
				 driver.findElement(mortgageno).click();
		}
		
		if (i==3) {
			
			driver.findElement(coapplicantlivingno).click();
			new Select(driver.findElement(comarital)).selectByVisibleText("Sambo");
			new Select(driver.findElement(cochildren)).selectByVisibleText("2");
			new Select(driver.findElement(coresidence)).selectByVisibleText("Inneboende");
			driver.findElement(corent).sendKeys("4500");
			
			
		}
		
		
		driver.findElement(next2).click();
		}
	}
	
	
	
	// Building Tasks
	
	public void BuildingTasks() throws InterruptedException
	
	 
	 {
		 
    Thread.sleep(5000);
	driver.findElement(coapplicantliving).click();
	new Select(driver.findElement(maritalstatus)).selectByVisibleText("Gift/Partnerskap");
	new Select(driver.findElement(children)).selectByVisibleText("0");
	new Select(driver.findElement(residence)).selectByVisibleText("Bostadsrätt");
	driver.findElement(rent).sendKeys("2500");
    driver.findElement(mortgageyes).click();
    driver.findElement(mortgagerent).sendKeys("2000");
		 
		 
		
	 }
	
	
	
}
