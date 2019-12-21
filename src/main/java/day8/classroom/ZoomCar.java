package day8.classroom;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.zoomcar.com/chennai");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[@href='/chennai/search']").click();
		driver.findElementByXPath("(//div[@class='items'])[3]").click();
		driver.findElementByClassName("proceed").click();
		Date date = new Date(); //Get the current date
		DateFormat sdf = new SimpleDateFormat("dd"); //Get only the date(not month, year, time etc)
		String today = sdf.format(date);//Get today's date
		int tomorrow = Integer.parseInt(today)+1; //Convert to integer and add 1 to it
		//System.out.println(tomorrow); //Print tomorrow's date		
		driver.findElementByXPath("//div[contains(text(),'"+tomorrow+"')]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		driver.findElementByXPath("//button[text()='Done']").click();
		List<WebElement> carlist = driver.findElementsByXPath("//div[@class='car-listing");
		
	
	}
}
