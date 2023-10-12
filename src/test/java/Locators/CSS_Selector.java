package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Selector {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();		//driver related statement
		
		WebDriver driver = new EdgeDriver();  		//opens empty browser
		
		driver.manage().window().maximize();		//maximizes the browser
		
		driver.get("https://www.facebook.com/");
		
		//address of email. text field
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("ashh");

	}

}
