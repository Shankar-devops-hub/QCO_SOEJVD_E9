package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviders {
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] a = new Object[3][2];
		a[0][0] = "Shankar";
		a[0][1] = "Monisha";
		
		a[1][0] = "java";
		a[1][1] = "selenium";
		
		a[2][0] = "Qspider";
		a[2][1] = "Student";
		
		return a;
	}
	@Test(dataProvider="getData")
	public void fb(String data, String data1)
	{
		WebDriverManager.edgedriver().setup();		
		WebDriver driver = new EdgeDriver();  		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(data);
		driver.findElement(By.id("pass")).sendKeys(data1);
	}
}
