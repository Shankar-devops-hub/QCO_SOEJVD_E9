package Basic_progm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching_browser {

	public static void main(String[] args) throws Throwable{
		
		
		WebDriverManager.edgedriver().setup();  //edge driver related statement
		
		WebDriver driver =  new EdgeDriver();  //opens empty edge browser
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();	//maximizing statement

	}

}
