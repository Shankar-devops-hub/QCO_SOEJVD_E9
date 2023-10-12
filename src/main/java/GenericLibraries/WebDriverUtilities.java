package GenericLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {
	
	public void doubleClickProcess(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void RightClick(WebDriver driver, WebElement ele)
	{
		
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void DragandDrop(WebDriver driver, WebElement ele1, WebElement ele2)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
	}
	public void Impwait(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void ExpWaitforClick(WebDriver driver, int time, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.element)
	}
}
