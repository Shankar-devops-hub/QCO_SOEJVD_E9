package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {

	@Test
	public void fb()
	{	
		WebDriverManager.edgedriver().setup();		//driver related statement
		
		WebDriver driver = new EdgeDriver();  		//opens empty browser
		
		driver.manage().window().maximize();
														//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
															//explicit wait
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		//Assert.assertEquals(title, "asdfg");
		SoftAssert s= new SoftAssert();
		s.assertEquals(title, "asfg");
		System.out.println(driver.getCurrentUrl());
		
		
	}
	@Test
	public void quiting()
	{
		driver.quit();
	}
	
}
