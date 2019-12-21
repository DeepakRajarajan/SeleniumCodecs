package day9.classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead {
	
	@Test

	public void createlead() {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver","./dr ivers/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		// Enter the UserName
			driver.findElementById("username").sendKeys("DemoSalesManager");
		// Enter the Password
			driver.findElementById("password").sendKeys("crmsfa");
		// Click on Login Button
			driver.findElementByClassName("decorativeSubmit").click();

		// Click on crm/sfa button
			driver.findElementByLinkText("CRM/SFA").click();

		// Click on Leads
			driver.findElementByLinkText("Leads").click();

		// Click on Create Lead button
			driver.findElementByLinkText("Create Lead").click();

		// Enter Company Name
			driver.findElementById("createLeadForm_companyName").sendKeys("Sam");

		// Enter First Name
			driver.findElementById("createLeadForm_firstName").sendKeys("Emmanuel");
		// Enter Last Name
			driver.findElementById("createLeadForm_lastName").sendKeys("Selvaraj");
			
			
			driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Poo");
			
			driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Jessi");
			
			driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
			
			
			Select dd = new Select(driver.findElementById("createLeadForm_dataSourceId"));
			dd.selectByVisibleText("Conference");
			
			
			
			driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Doctor");
			
			driver.findElementById("createLeadForm_annualRevenue").sendKeys("100000");
			
			Select da = new Select(driver.findElementById("createLeadForm_industryEnumId"));
			da.selectByVisibleText("Aerospace");
			
			Select db = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
			db.selectByVisibleText("Partnership");
			
			driver.findElementById("createLeadForm_sicCode").sendKeys("001");
			
			driver.findElementById("createLeadForm_description").sendKeys("God is Good");
			
			driver.findElementById("createLeadForm_importantNote").sendKeys("Truth alone wins");
			
			driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91");
			
			driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("044");
			
			driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("10");
			
			driver.findElementById("createLeadForm_departmentName").sendKeys("IT");
			
			Select dc = new Select(driver.findElementById("createLeadForm_currencyUomId"));
			dc.selectByVisibleText("INR - Indian Rupee");
			
driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
			
			driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Yes");
			
			driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Poo");
			
			driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm");
			
			driver.findElementById("createLeadForm_generalToName").sendKeys("Sam");
			
			driver.findElementById("createLeadForm_generalAddress1").sendKeys("Vinnmathi");
			
			driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
			
			
			
			Select de = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
			de.selectByVisibleText("Alaska");
			
			Select df = new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
			df.selectByVisibleText("Afghanistan");
			
			
driver.findElementById("createLeadForm_generalPostalCode").sendKeys("0012");
			
			driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("24");
			
			
			
			
			Select dz = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
			dz.selectByIndex(2);
			
			
driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9940470125");
			
			driver.findElementById("createLeadForm_primaryEmail").sendKeys("Sam@gmail.com");
						
// Select 'Preferred Currency' as 'INR'
			
			//Select dc = new Select(driver.findElementById("createLeadForm_industryEnumId"));
			//dc.selectByValue("IND_SOFTWARE");
			
			//List<WebElement> options= dc.getOptions();
			//int option = options.size();
			//dc.selectByIndex(option-1);

			
		// Click on Create Lead (Submit) button
			driver.findElementByName("submitButton").click();
		// Verify the Lead is created by checking the Company or First Name

	}

}
