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
 */

package Zmartasweden.Zmartasweden;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pageobject.Locators;




import org.testng.annotations.BeforeTest;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class Zmarta_se {
	
	
WebDriver driver;



 @BeforeTest
  public  void beforeTest() {
	 
	 System.setProperty("webdriver.chromedriver" ,"E://chromedriver.exe");
	 driver = new ChromeDriver();
	 String baseurl = "https://staging.zmarta.se/";
	 driver.get(baseurl);
	 driver.manage().window().maximize();
	 System.out.println("Browser Started");
	 
  
 }

  
 @Test(priority=0,description ="This Test Case is to Verify the Landing page of the Website")

public  void VerifyPageTitle()

{
	  Locators title = new Locators(driver);
	  title.Pagetitle();
	 
	 
	}
 
 
  @Test(priority=1,description = " This Test Case  is to Verify the Applicant Loan Information",dependsOnMethods= "VerifyPageTitle")
 
  public  void VerifyLoan() throws Exception {
  
   	   
		  Locators loan = new Locators(driver);
		  loan.ApplyLoan();
	  }
  

 
  
  
  @Test(priority=2,description =" This Test Case   is to Verify the Applicant Personal Information ",dependsOnMethods= "VerifyLoan")
  
  public   void VerifyPersonalInfo() throws Exception
  {
	  
	  Locators info = new Locators(driver);
	  info.PersonalInfo();
  }
  
  
  @Test(priority=3,description = "  This Test Case is to Verify  the Applicant  Marital status ",dependsOnMethods= "VerifyPersonalInfo")
  
  public void 	VerifyMaritalstatus() throws Exception
  {
	  
	  Locators info1 = new Locators(driver);
	  info1.Maritalstatus();
  }
 
  
  

 @Test(priority=4,description ="This Test Case is to Verify the Applicant Employment Information",dependsOnMethods= "VerifyMaritalstatus")
 
 public void VerifyEmploymentInfo() throws InterruptedException
 {
	 Locators employment = new Locators(driver);
	 employment.EmploymentInfo();
	 
 }
 
 
 @Test(priority=5,description ="This Test Case is to  Verify  the Applicant Final Loan Information",dependsOnMethods= "VerifyEmploymentInfo")
 
 public void VerifyFinalLoan() throws InterruptedException
 {
	 
	 Locators finalloan = new Locators(driver);
	 finalloan.FinalLoan();
	 
 }
 
 
 
 
  
  @AfterTest
  public void afterTest() {
	  
	System.out.println("Browser End");  
	driver.close();
  }

}