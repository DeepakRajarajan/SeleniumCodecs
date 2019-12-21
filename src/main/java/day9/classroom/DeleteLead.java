package day9.classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead {
	@Test
	public void deletelead() throws InterruptedException {
		//delete
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

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
			
			
			driver.findElementByLinkText("Leads").click();
			
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementByXPath("(//span[text()='Phone'])").click();
			driver.findElementByName("phoneCountryCode").clear();
			
			driver.findElementByName("phoneCountryCode").sendKeys("+91");
			
			//driver.findElementByName("phoneAreaCode").sendKeys("044");
			
			//driver.findElementByName("phoneNumber").sendKeys("9940470125");
			
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(2000);
			String leadid=driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
			driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
			driver.findElementByXPath("(//a[@class='subMenuButtonDangerous'])").click();
			Thread.sleep(2000);
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementByName("id").sendKeys(leadid);
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(2000);
			
			String a =driver.findElementByXPath("//div[text()='No records to display']").getText();
			if(a.equals("No records to display"))
			{
				System.out.println("No records to display is displayed");
			}
			else
			{
				System.out.println("No records to display is not displayed");
			}
			
			driver.close();
				
			
			
//			
			
			
	}


}
