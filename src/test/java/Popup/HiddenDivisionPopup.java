package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JavaPrograms\\QCO_SOEJVD_E9\\src\\main\\resources\\chromedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://redbus.in/");
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		driver.findElement(By.xpath("//div[text()='Sep']/ancestor::div[@class='sc-jzJRlG dPBSOp']//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw']")).click();
		

	}

}
