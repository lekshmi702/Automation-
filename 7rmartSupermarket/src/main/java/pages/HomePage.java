package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

public WebDriver driver;
	
	public  HomePage (WebDriver driver)
	{
		 
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	   
	@FindBy (xpath="//p[text()='Sub Category']")WebElement subcategory;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")WebElement clickcategory1;
	@FindBy(xpath="//p[text()='Manage Contact']")WebElement managecontact;
	@FindBy(xpath="//a[@class='small-box-footer']")WebElement adminusers;
	@FindBy(xpath="//p[text()='Manage Footer Text']")WebElement managefooterclick;
	@FindBy(xpath="//p[text()='Manage News']")WebElement managenewsclick;
	
	public SubCategory clicksubcategory()
	{
	  subcategory.click();
	  return new SubCategory(driver);
		
	}
	public Category clickcategory()
	{
		clickcategory1.click();
		return new Category(driver);
	}
	public ManageContact clickmanagecontact()
	{
		managecontact.click();
		return new ManageContact(driver);
	}
	public AdminUsers adminusersclick()
{
	adminusers.click();
	return  new AdminUsers(driver);
}
public ManageFooterText managefooterclick()
{
	managefooterclick.click();
	return new ManageFooterText(driver);
}
public ManageNews managenewsclick()
{
        managenewsclick.click();
        return new ManageNews(driver);
}
	
}
