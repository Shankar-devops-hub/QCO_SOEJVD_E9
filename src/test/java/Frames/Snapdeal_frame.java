package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal_frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();		//driver related statement
		
		WebDriver driver = new EdgeDriver();  		//opens empty browser
		
		driver.manage().window().maximize();
														//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.snapdeal.com");
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("asdfgj");
		driver.findElement(By.xpath("//div[@id='close']")).click();
	}

}
