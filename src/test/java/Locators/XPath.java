package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();		//driver related statement
		
		WebDriver driver = new EdgeDriver();  		//opens empty browser
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//address of email text field using x-path attribute
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashh");
		
		//address of email text field using x-path contains attribute
		driver.findElement(By.xpath("//input[contains(id,'pass']")).sendKeys("assddd");
		//address of forgotten password using x-path text
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();

	}

}
