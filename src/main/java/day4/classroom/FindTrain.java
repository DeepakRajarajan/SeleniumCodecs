package day4.classroom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTrain {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://erail.in");
		driver.manage().window().maximize();
		WebElement trainstart = driver.findElementById("txtStationFrom");
		trainstart.clear();
		trainstart.sendKeys("MAS",Keys.TAB);
		WebElement trainend = driver.findElementById("txtStationTo");
		trainend.clear();
		trainend.sendKeys("SBC",Keys.TAB);
		Thread.sleep(3000);
		WebElement traintable = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> rows = traintable.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> trainlist = rows.get(i).findElements(By.tagName("td"));
			System.out.println(trainlist.get(1).getText());
		}
		driver.close();
	}

}
