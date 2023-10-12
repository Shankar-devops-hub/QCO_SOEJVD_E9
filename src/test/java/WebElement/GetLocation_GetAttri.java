package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLocation_GetAttri {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();		//driver related statement
		
		WebDriver driver = new EdgeDriver();  		//opens empty browser
		
		driver.manage().window().maximize();
														//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
															//explicit wait
		driver.get("https://www.facebook.com/");
		WebElement emailTF = driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println(emailTF.getAttribute("placeholder"));
		
		Point coordinates = emailTF.getLocation();
		//System.out.println(coordinates);
		int x = coordinates.getX();
		int y = coordinates.getY();
		
		System.out.println(x);
		System.out.println(y);

	}

}
