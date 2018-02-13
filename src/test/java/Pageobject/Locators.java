/* Jino philip
	 * 
	 * This Class is used for Storing all the Locators and Methods of  this   Project
	 */


package Pageobject;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


//import com.sun.org.apache.bcel.internal.generic.Select;

//import ReadExcel.Test_data;
import ReadExcel.Excel_Data;



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
	By cossn = By.id("CopNo");
	By coemail =By.name("Coemail");
	By comob =By.name("CotelNr");
	By approve = By.xpath("//div[@id='approveTermsStep1']/div/label/span");
	By next1 = By.xpath("//form[@id='application']/div[6]/div/div[2]/button[2]");
	By close = By.xpath("//div[@id='msg']/div/a");
	
	// Marital Status
	
	By coapplicantlivingyes  =By.xpath("//*[@class='btn-common'] ");
	By maritalstatus = By.xpath("//*[@name='maritalStatus']");
	//By maritalstatus = By.xpath("//div[3]/div/div/div/select");
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
	By Refinanceloanyes = By.xpath("//*[@id=\"application\"]/div[5]/div/div/div/div[2]/div/div[3]/div/div/div[1]/label");
	By Refinancedebt= By.id("refinanceDebtAmount");
	By Refinancemonthly =By.id("refinanceDebtMonthlyCost");
	By Refinanceloanno =By.xpath("//*[@id=\"application\"]/div[5]/div/div/div/div[2]/div/div[3]/div[1]/div/div[2]/label/p");
	By Otherloanyes =By.xpath("//*[@id=\"application\"]/div[5]/div/div/div/div[2]/div/div[4]/div[1]/div/div[1]/label");
	By Otherdebt = By.xpath("//form[@id='application']/div[5]/div/div/div/div[2]/div/div[4]/div[2]/div/div/div/input");
	By Othermonthly = By.xpath("//form[@id='application']/div[5]/div/div/div/div[2]/div/div[4]/div[2]/div/div[2]/div/input"); 
	By Otherloanno= By.xpath("//*[@id=\"application\"]/div[5]/div/div/div/div[2]/div/div[4]/div[1]/div/div[2]/label");
	
	 
	public Locators (WebDriver driver)
 
	
	{
		this.driver = driver;
		
	
	}
	
	
	
	//Verify Page Title
	 
	public void Pagetitle()
	
	{
		//Actual result
		String  actual_title = driver.getTitle();
	  System.out.println("Title is " +actual_title);
	  
	  //Expected result
	  String expected_title= "Låna pengar på nätet till låg ränta på Zmarta.se";
	  Assert.assertEquals(   actual_title,   expected_title  );
	  System.out.println("Page title Verfied and Welcome to Zmarta Landing Page ");
	  
}

	
	//Loan
	
	public void ApplyLoan() throws Exception
	
	{
	
		 //Reading Excel  
	
		Excel_Data read = new Excel_Data("E:\\Jino_testing\\Git_Hub\\Zmarta_se\\resources\\Zmarta.xls");
		Thread.sleep(3000);
		driver.findElement(apply).click();
		driver.findElement(loan).click();
		Thread.sleep(2000);
		String currentURL = driver.getCurrentUrl();
		 Assert.assertTrue(currentURL.contains("samla-lan/ansok"));
		driver.findElement(amount).sendKeys(read.getData(0, 1, 0));
		Thread.sleep(5000);
		driver.findElement(years).sendKeys(read.getData(0, 1, 1));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(next).click();
		System.out.println("Applicant Loan is Verfiied" );
		
	 
	}
	
//Personal Information
	
	public void PersonalInfo() throws Exception
	
{
		
		Excel_Data read = new Excel_Data("E:\\Jino_testing\\Git_Hub\\Zmarta_se\\resources\\Zmarta.xls");
		driver.findElement(ssn).sendKeys(read.getData(0, 1, 2));
		driver.findElement(email).sendKeys(read.getData(0, 1, 3));
		driver.findElement(mob).sendKeys(read.getData(0, 1, 4));
		Thread.sleep(3000);
		driver.findElement(add).click();
		 System.out.println(read.getData(1, 1, 0));
	   driver.findElement(cossn).sendKeys(read.getData(0, 1, 0));
		driver.findElement(coemail).sendKeys("qa1@gmail.com");
		driver.findElement(comob).sendKeys("9747835332");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(approve).click();
		driver.findElement(next1).click();
		Thread.sleep(3000);
		driver.findElement(close).click();
		System.out.println("Applicant Personal Information is Verfied");
		
	
		
	}
	
	
	
	// Marital Status
	
	public void Maritalstatus() throws Exception 
	
	
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
		else if (i==2)
		
		{
				 Thread.sleep(3000);
				 driver.findElement(mortgageno).click();
		}
		
		else {
			
			driver.findElement(coapplicantlivingno).click();
			new Select(driver.findElement(comarital)).selectByVisibleText("Sambo");
			new Select(driver.findElement(cochildren)).selectByVisibleText("2");
			new Select(driver.findElement(coresidence)).selectByVisibleText("Inneboende");
			driver.findElement(corent).sendKeys("4500");
			
				}
		
		}
		
		driver.findElement(next2).click();
		System.out.println("Applicant Marital Information  is Verfied");
		
  	 }
		
	


// Employment
	
	 public void EmploymentInfo() throws InterruptedException
	 
	 
	 {
		for (int i=1;i<=4;i++)
			
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
			
		}
		
		
		if(i==4) {	
			
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
		    System.out.println("Applicant Employment Information is Verified");
		}
		   	
				}
	 }
	
	 
	 
	 //Final Loan
	 
	 public void FinalLoan() throws InterruptedException  {
	
		for (int i=0;i<=1;i++)
	 {
		 
		 new Select(driver.findElement(loanpurpose)).selectByVisibleText("Körkort");
		
		
		
		 
		 
		 if(i==0) {
	      Thread.sleep(3000);
	     driver.findElement(Refinanceloanyes).click();
		 driver.findElement(Refinancedebt).sendKeys("4444");
		 driver.findElement(Refinancemonthly).sendKeys("2500");
		 driver.findElement(Refinanceloanno).click();
		
		 }
		
		
		 else if (i==1) {
		 driver.findElement(Otherloanyes).click();
		 Thread.sleep(5000);
		driver.findElement(Otherdebt).sendKeys("5600");
		driver.findElement(Othermonthly).sendKeys("3455");
		driver.findElement(Otherloanno).click();
		System.out.println("Applicant Final Loan is Verfied");
		 }
		 
		 
		
			
		 
		 
}
		}

	 }
	 
	 
