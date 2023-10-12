package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alterpopup {

	public static void main(String[] args) throws Throwable{
		
		WebDriverManager.edgedriver().setup();		//driver related statement
		
		WebDriver driver = new EdgeDriver();  		//opens empty browser
		
		driver.manage().window().maximize();
														//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		WebElement plus = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.doubleClick(plus).perform();
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
		//a1.dismiss();)

	}

}
