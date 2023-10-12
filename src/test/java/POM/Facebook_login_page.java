package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login_page {

		//declaration
		//address of email text field
		@FindBy(id="email")
		private WebElement emailTF;
		@FindBy(name="pass")
		private WebElement passwordTF;
		@FindBy(xpath="//button[@name='login']")
		private WebElement loginBtn;
		
		//initialization
		public Facebook_login_page(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		public WebElement getEmailTF() {
			return emailTF;
		}

		public WebElement getPasswordTF() {
			return passwordTF;
		}
		
		public WebElement getLoginBtn() {
			return loginBtn;
		}
		public void emailTextfield(String data)
		{
			emailTF.sendKeys(data);
		}
		public void passwordtextfield(String data)
		{
			passwordTF.sendKeys(data);
		}
		public void loginButton()
		{
			loginBtn.click();
		}
		
	
}
