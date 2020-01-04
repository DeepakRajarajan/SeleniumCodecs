package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class LoginSteps {
	public ChromeDriver driver;
	@Given("Launch the browser")
	public void launchTheBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
	}

	@Given("Load the url")
	public void loadTheUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@Given("Maximize the browser")
	public void maximizeTheBrowser() {
		driver.manage().window().maximize();
	}

	@Given("Enter the username as demosalesmanager")
	public void enterTheUsernameAsDemosalesmanager() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@Given("Enter the password as crmsfa")
	public void enterThePasswordAsCrmsfa() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Given("Click on the login button")
	public void clickOnTheLoginButton() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Given("Click on CRM\\/SFA button")
	public void clickOnCRMSFAButton() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Given("Click on Leads")
	public void clickOnLeads() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Given("Click on Create Leads Button")
	public void clickOnCreateLeadsButton() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Given("Enter Company Name")
	public void enterCompanyName() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Given("Enter First Name")
	public void enterFirstName() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Given("Enter Last Name")
	public void enterLastName() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@When("Click on Submit button")
	public void clickOnSubmitButton() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("Verify if Lead is created")
	public void verifyIfLeadIsCreated() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

}