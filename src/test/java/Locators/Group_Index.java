package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Group_Index {

	public static void main(String[] args) {

WebDriverManager.edgedriver().setup();		//driver related statement
		
		WebDriver driver = new EdgeDriver();  		//opens empty browser
		
		driver.manage().window().maximize();
		
		driver.get("https://skillrary.com/");
		
		driver.findElement(By.xpath(("//i[@class='fa fa-facebook']"))

	}

}
