package day7.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithWindows {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		//Open Multiple Windows
		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		//Create List to get size of window Handles
		List<String> lstWindowHandles = new ArrayList<String>(windowHandles);
		int size = lstWindowHandles.size();
		
		//print size
		System.out.println(size);
		
		//Move the control to last window and print title
		String ss = lstWindowHandles.get(2);
		driver.switchTo().window(ss);
		String dd = driver.getTitle();
		System.out.println(dd);
		
		//Close all windows opened in current session
		driver.quit();
	}
}