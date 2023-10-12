package Basic_progm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws Throwable{
		
		WebDriverManager.edgedriver().setup();		//driver related statement
		
		WebDriver driver = new EdgeDriver();  		//opens edge browser
		
		driver.manage().window().maximize();		//maximizes the browser
		
		driver.get("https://www.facebook.com/");	//it opens application
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
		

	}

}
