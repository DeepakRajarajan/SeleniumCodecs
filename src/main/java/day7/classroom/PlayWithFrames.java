package day7.classroom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithFrames {
	public static void main(String[] args) {
		
		String tt = "Deepak!";

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Deepak");
		alert.accept();
		String text = driver.findElementById("demo").getText();
		
		if(text.equals("Hello "+tt+" How are you today?")){
			
		}
}
}
