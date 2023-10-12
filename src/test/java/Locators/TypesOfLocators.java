package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TypesOfLocators {

	public static void main(String[] args) throws Throwable{

		WebDriverManager.edgedriver().setup();		//driver related statement
		
		WebDriver driver = new EdgeDriver();  		//opens edge browser
		
		driver.manage().window().maximize();		//maximizes the browser
		
		driver.get("https://www.facebook.com/");	//it opens application
		
		driver.findElement(By.id("email")).sendKeys("ShankarUma"); //addr of email textfield
		
		driver.findElement(By.name("pass")).sendKeys("asadsddd");	//addr of pwd textfield
		
		//driver.findElement(By.name("login")).click();	//addr of Login button
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("create a page")).click();
		
		driver.findElement(By.partialLinkText("Page")).click();
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		

	}	

}
