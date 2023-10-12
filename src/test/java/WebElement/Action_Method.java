package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Method {

	public static void main(String[] args) throws Throwable{
		
		WebDriverManager.edgedriver().setup();		//driver related statement
		
		WebDriver driver = new EdgeDriver();  		//opens empty browser
		
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//explicit wait
		driver.get("https://www.facebook.com/");
		WebElement emailTF = driver.findElement(By.xpath("//input[@id='email']"));
		
		emailTF.sendKeys("asassas");
		Thread.sleep(3000);
		emailTF.clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit]")).submit();
		

	}

}
