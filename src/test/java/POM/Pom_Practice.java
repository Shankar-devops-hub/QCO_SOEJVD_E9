package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pom_Practice {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();		//driver related statement
		
		WebDriver driver = new EdgeDriver();  		//opens empty browser
		
		driver.manage().window().maximize();
														//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
															//explicit wait
		driver.get("https://www.facebook.com/");
		
		Facebook_login_page fb1 = new Facebook_login_page(driver);
		fb1.emailTextfield("sasi");
		fb1.passwordtextfield("kala");
		fb1.loginButton();

	}

}
