package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;

public class LoginPage {


	public WebDriver driver;
	
	public  LoginPage (WebDriver driver)
	{
		 
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy (xpath="//input[@name='username']")WebElement usernameField;
	@FindBy(xpath="//input[@name='password']")WebElement passwordField;
	@FindBy (xpath="//button[@type='submit']")WebElement LoginButton;
	
	@FindBy (xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
	@FindBy(xpath="//span[text()='7rmart supermarket']")WebElement text;
	
	
	public void enterusernameonusernameField( String username)
	{
		usernameField.sendKeys(username);
	}
	 
	public void enterpasswordnameField(String password)
	{
		passwordField.sendKeys(password);
	}

	public HomePage clickloginField()
	{
		LoginButton.click();
		return new HomePage(driver);
		
	}	

public boolean ishomepageloded()
{
	return text.isDisplayed();
}

public boolean isalertdisplayed()
{
	return alert.isDisplayed();
	
}
public HomePage loginusingexceldata() throws IOException
{
	String username=ExcelUtility.readStringData(1, 0, "loginpage");
	String password=ExcelUtility.readStringData(1, 1, "loginpage");
	usernameField.sendKeys(username);
	passwordField.sendKeys(password);
	LoginButton.click();
	return new HomePage(driver);
	
	
}

}
