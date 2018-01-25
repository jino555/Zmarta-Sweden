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
	
	By coapplicantlivingyes = By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/div[2]/div/div[2]/div/div/div[2]/label");
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
	
	
	// Employment
	
	By employment = By.name("employmentType");
	By monthlyincome =By.name("monthlyIncome");
	By company =By.name("companyName");
	By yearsince =By.name("years");
	By monthsince =By.xpath("(//select[@name='years'])[2]");
	By pepyes =By.xpath("//*[@id=\"application\"]/div[4]/div/div/div/div[2]/div/div[4]/div/div/div[1]/label");
	By yearto =By.xpath("(//select[@name='years'])[3]");
	By monthto =By.xpath("(//select[@name='years'])[4]");
	By popupclose =By.xpath("//div[4]/div[2]/a/i");
	By pepno= By.xpath("//*[@id=\"application\"]/div[4]/div/div/div/div[2]/div/div[4]/div/div/div[2]/label");
	By coemployment = By.name("CoemploymentType");
	By Cocompany =By.name("CocompanyName");
	By comonthlyincome =By.name("ComonthlyIncome");
	
	//FinalLoan
	
	By loanpurpose =By.name("loanPurpose");
	
	 
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
		
		driver.findElement(ssn).sendKeys("680410-7297");
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
		
		
		
	}
	
	
	
	// Building Tasks
	
	public void Maritalstatus() throws InterruptedException
	
	 
	 {  
		Thread.sleep(5000);
		driver.findElement(coapplicantlivingyes).click();
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
		
		}
		
		driver.findElement(next2).click();
		
  	 }
	
	
// Employment
	
	 public void EmploymentInfo() throws InterruptedException
	 
	 
	 {
		for (int i=1;i<=3;i++)
			
		{
			
		if (i==1)
			
		{
		new Select(driver.findElement(employment)).selectByVisibleText("Fast anställd");
		Thread.sleep(5000);
		driver.findElement(monthlyincome).sendKeys("3000");
		Thread.sleep(5000);
		driver.findElement(company).sendKeys("HHM Pvt Ltd");
		new Select(driver.findElement(yearsince)).selectByVisibleText("1995");
		new Select(driver.findElement(monthsince)).selectByVisibleText("Februari");
		Thread.sleep(5000);
		
		}
			
		if(i==2)
			
		{
			new Select(driver.findElement(employment)).selectByVisibleText("Projektanställd");
		    new Select(driver.findElement(yearto)).selectByVisibleText("2022");
			new Select(driver.findElement(monthto)).selectByVisibleText("Juli");
			driver.findElement(pepyes).click();
			
		} 
		
		if(i==3)
		{
			new Select(driver.findElement(employment)).selectByVisibleText("Annat");
			Thread.sleep(5000);
			driver.findElement(pepno).click();
			driver.findElement(popupclose).click();
			Thread.sleep(5000);
			new Select(driver.findElement(employment)).selectByVisibleText("Studerande");
			new Select(driver.findElement(yearsince)).selectByVisibleText("2014");
			new Select(driver.findElement(monthsince)).selectByVisibleText("Maj");
			new Select(driver.findElement(coemployment)).selectByVisibleText("Fast anställd");
			driver.findElement(comonthlyincome).sendKeys("2222");
			driver.findElement(Cocompany).sendKeys("Freedom Pvt Ltd");
			new Select(driver.findElement(yearto)).selectByVisibleText("1995");
			new Select(driver.findElement(monthto)).selectByVisibleText("Oktober");
			Thread.sleep(5000);
			driver.findElement(pepyes).click();
		    driver.findElement(next2).click();
		   	
				}
	 }
	
	 }
	 
	 //Final Loan
	 
	 public void FinalLoan()
	 {
		 
		 new Select(driver.findElement(loanpurpose)).selectByVisibleText("Körkort");
		 
		 
	 }
	 
	 
	 
	 
	 
	 
}
