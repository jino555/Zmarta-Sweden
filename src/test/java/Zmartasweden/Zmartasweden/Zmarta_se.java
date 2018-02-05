/* ****************************************************************************
 * Project Name  : Zmarta Sweden
 * Author        : Jino Philip
 * Creation Date : 19-Jan-2018
 * Reviewed By   :
 * Review Date   :
 *
 *
 * Copyright Notice
 *
 * 
 *
 *
 * ****************************************************************************
 *                          Change History
 *
 * Sl No.   Modified Date     Modified By       Change Description
 * ---------------------------------------------------------------------------
 *   1.
 *   2.
 *   3.
 * ---------------------------------------------------------------------------
 *
 *****************************************************************************
 *
 */package Zmartasweden.Zmartasweden;

import org.testng.annotations.Test;

import jxl.read.biff.BiffException;



import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class Zmarta_se {
	
	
public static  WebDriver driver;



 @BeforeTest
  public static void beforeTest() {
	 
	 System.setProperty("webdriver.chromedriver" ,"E://chromedriver.exe");
	 driver = new ChromeDriver();
	 String baseurl = "https://test.zmarta.se/lana-pengar";
	 driver.get(baseurl);
	 driver.manage().window().maximize();
	 System.out.print("Browser Started");
	 
  
 }

  
 @Test(priority=0,description ="This Test is to Verify the Landing page of the Website r")
 
public static void VerifyPageTitle()
{
	  Locators title = new Locators(driver);
	  title.Pagetitle();
	 
	 
	}
 
 
  @Test(priority=1,description = "  This Test  is to Verfiy the Applicant Loan ")
  public static void VerifyLoan() throws Exception {
  
   	   
		  Locators loan = new Locators(driver);
		  loan.ApplyLoan();
	  }

 
  
  
  @Test(priority=2,description =" This Test  is to Verify The Personal Info of the Applicant ")
  public static  void VerifyPersonalInfo() throws Exception
  {
	  
	  Locators info = new Locators(driver);
	  info.PersonalInfo();
  }
  
  
  @Test(priority=3,description = "  This Test verifies the Marital status of the  Applicant  ")
  public static void 	VerifyMaritalstatus() throws InterruptedException, BiffException, IOException
  {
	  
	  Locators info1 = new Locators(driver);
	  info1.Maritalstatus();
  }
 
  
  

 @Test(priority=4,description ="This Test is to Verify the Applicant Employment Info")
 public void VerifyEmploymentInfo() throws InterruptedException
 {
	 Locators employment = new Locators(driver);
	 employment.EmploymentInfo();
	 
 }
 
 
 @Test(priority=5,description ="This Test  verfies the Applicant Final Loan Information")
 
 public void VerifyFinalLoan() throws InterruptedException
 {
	 
	 Locators finalloan = new Locators(driver);
	 finalloan.FinalLoan();
	 
 }
 
 
 
 
  
  @AfterTest
  public void afterTest() {
	  
	  
  }

}