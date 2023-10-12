package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isSelected {

	public static void main(String[] args) throws Throwable{
		
		WebDriverManager.edgedriver().setup();		//driver related statement
		
		WebDriver driver = new EdgeDriver();  		//opens empty browser
		
		driver.manage().window().maximize();
														//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
															//explicit wait
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='create new account']")).click();
		Thread.sleep(3000);
		WebElement femailRadioBtn = driver.findElement(By.xpath("//input[@value='1']"));
		femailRadioBtn.click();
		if(femailRadioBtn.isSelected())
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
