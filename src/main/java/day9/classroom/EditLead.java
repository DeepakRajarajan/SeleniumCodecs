package day9.classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead {

	@Test
		public void editlead() throws InterruptedException {
			// TODO Auto-generated method stub
			//edit
			// Set the property for ChromeDriver
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
						
						driver.findElementByXPath("(//label[contains(text(),'First')])[3]/following::input[1]").sendKeys("Sam");
						
						
						driver.findElementByXPath("//button[text()='Find Leads']").click();
						Thread.sleep(2000);
						driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
//						String title = driver.getTitle();
//						System.out.println(title);
						if(driver.getTitle().equals("View Lead | opentaps CRM"))
						{
							System.out.println("Expected Title is displayed");
						}
						else {
							System.out.println("Expected Title is not displayed");
						}
						driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
						
						Thread.sleep(2000);
						

						// Enter Company Name
						driver.findElementById("updateLeadForm_companyName").clear();					
						driver.findElementById("updateLeadForm_companyName").sendKeys("Google");
						
							driver.findElementByName("submitButton").click();
							String cnamae=driver.findElementById("viewLead_companyName_sp").getText();
							if(cnamae.contains("Google"))
							{
								System.out.println("Expected CompanyName is Changed");
							}
							else {
								System.out.println("Expected CompanyName is not Changed");
							}
							
							driver.close();
							


		}


	}
