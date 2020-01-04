package annotationPractice;

import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethods {

	@Test
		public void editlead() throws InterruptedException  {
								// Click on crm/sfa button
						driver.findElementByLinkText("CRM/SFA").click();
						
						
						driver.findElementByLinkText("Leads").click();
						
						driver.findElementByLinkText("Find Leads").click();
						
						driver.findElementByXPath("(//label[contains(text(),'First')])[3]/following::input[1]").sendKeys("Deepak");
						
						
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
