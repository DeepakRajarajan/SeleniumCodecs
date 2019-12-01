package day3.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadWithSelect {

	public static void main(String[] args) {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Maximize the browser
		driver.manage().window().maximize();

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
		driver.findElementById("createLeadForm_companyName").sendKeys("Stark Industries");

		// Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Tony");

		// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Stark");

		// Select 'Source' as 'Other' (Handling DropDown)
		WebElement sourcevalue = driver.findElementById("createLeadForm_dataSourceId");
		Select a = new Select(sourcevalue);
		a.selectByIndex(6);

		// Select 'Preferred Currency' as 'INR'
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select b = new Select(currency);
		b.selectByValue("INR");
		
		// Click on Create Lead (Submit) button
		driver.findElementByClassName("smallSubmit").click();
		
		// Verify the Lead is created by checking the Company or First Name
		

	}

}
