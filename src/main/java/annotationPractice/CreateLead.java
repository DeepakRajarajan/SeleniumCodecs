package annotationPractice;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods {
	@BeforeClass
	public void setData() {
		excelFileName = "CreateLead";
	}
	@Test (dataProvider="getData")

	public void createlead(String cname, String fname, String lname) {

	// Click on Leads
			driver.findElementByLinkText("Leads").click();

		// Click on Create Lead button
			driver.findElementByLinkText("Create Lead").click();

		// Enter Company Name
			driver.findElementById("createLeadForm_companyName").sendKeys(cname);

		// Enter First Name
			driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		// Enter Last Name
			driver.findElementById("createLeadForm_lastName").sendKeys(lname);
			
	}

}
