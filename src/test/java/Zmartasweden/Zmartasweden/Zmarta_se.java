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
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Zmarta_se {
	
	
private WebDriver driver;



 @BeforeTest
  public void beforeTest() {
	 
	 System.setProperty("webdriver.chromedriver" ,"E://chromedriver.exe");
	 driver = new ChromeDriver();
	 String baseurl = "https://test.zmarta.se/lana-pengar";
	 driver.get(baseurl);
	 driver.manage().window().maximize();
	 
  }

  
  @Test
  public void VerifyLoan() throws InterruptedException {
	  
	  Locators loan = new Locators(driver);
	  loan.ApplyLoan();
  }
  
  
  @Test
  public void VerifyPersonalInfo() throws InterruptedException
  {
	  
	  Locators info = new Locators(driver);
	  info.PersonalInfo();
  }
  
  
  @Test 
  public void VerfiyBuildingTasks() throws InterruptedException
  
  {
  
	  Locators building = new Locators (driver);
	  building.BuildingTasks();
	  
	  
	  
  }
  
  
  
  @AfterTest
  public void afterTest() {
  }

}