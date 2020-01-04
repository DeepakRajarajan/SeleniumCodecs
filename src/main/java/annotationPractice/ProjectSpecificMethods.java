package annotationPractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {

	public ChromeDriver driver;	
	@BeforeMethod
	@Parameters ({"url","username","password"})
	
	public void login(String urla, String usernameb, String passwordc) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get(urla);
		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		// Enter the UserName
		driver.findElementById("username").sendKeys(usernameb);
		// Enter the Password
		driver.findElementById("password").sendKeys(passwordc);
		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();

		// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@AfterMethod
	public void logout()
	{
		driver.findElementByXPath("//a[@class='linktext'][3]").click();
	}

	@DataProvider
	public String[][] getData() throws IOException {
		/*
		 * String[][] data =new String[2][3]; data[0][0]="TestLeaf";
		 * data[0][1]="Deepak"; data[0][2]="Rajarajan"; data[1][0]="TestLeaf";
		 * data[1][1]="Rohit"; data[1][2]="Vaseegaran"; return data;
		 */
		ExcelFetch data = new ExcelFetch();
		return data.readExcel(excelFileName);
	}
	
}

