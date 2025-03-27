package pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.FileuploadUtility;
import utilities.PageUtility;

public class AdminUsers {

	public WebDriver driver;
	FileuploadUtility file = new FileuploadUtility();
	PageUtility page = new PageUtility();
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement createnewbutton;
	@FindBy(xpath = "//input[@id='username']")
	WebElement usernamefield;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordfield;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement usertype;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement adminsave;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement adminalert;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement adminsearch;
	@FindBy(xpath = "//input[@id='un']")
	WebElement adminsearchusername;
	@FindBy(xpath = "//select[@class='form-control']")
	WebElement searchusertype;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")
	WebElement adminupdate;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement searchbuttonclick;

	@FindBy(xpath = "//input[@class='form-control']")
	WebElement adminupdatename;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordfield1;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement usertype1;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement adminupdateclick;

	public AdminUsers(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AdminUsers createnewadmin() {
		createnewbutton.click();
		return new  AdminUsers(driver);
	}

	public AdminUsers usernamefield(String username) {
		usernamefield.sendKeys(username);
		return new  AdminUsers(driver);
	}

	public AdminUsers passwordfield(String password) {
		passwordfield.sendKeys(password);
		return new  AdminUsers(driver);
	}

	public AdminUsers usertype() {

		page.selectDropdownWithVisibleText(usertype, "Staff");
		return new  AdminUsers(driver);
	}

	public AdminUsers adminsave() {
		adminsave.click();
		return new  AdminUsers(driver);
	}

	public boolean adminalert() {
		return adminalert.isEnabled();
		
	}

	public AdminUsers adminsearch() {
		adminsearch.click();
		return new  AdminUsers(driver);
	}

	public AdminUsers adminsearchusername(String usernameadminsearch)

	{
		adminsearchusername.sendKeys(usernameadminsearch);
		return new  AdminUsers(driver);
	}

	public AdminUsers adminsearchtype(String adminsearchusertype) {
		searchusertype.sendKeys(adminsearchusertype);
		return new  AdminUsers(driver);
	}

	public AdminUsers searchclick() {
		searchbuttonclick.click();
		return new  AdminUsers(driver);
	}

	public AdminUsers adminupdate() {

		adminupdate.click();
		return new  AdminUsers(driver);
	}

	public AdminUsers adminupdatename(String updatename1) {

		adminupdate.clear();
		adminupdatename.sendKeys(updatename1);
		return new  AdminUsers(driver);
	}

	public AdminUsers passwordfieldinUpdate(String password) {
		passwordfield1.sendKeys(password);
		return new  AdminUsers(driver);
	}

	public AdminUsers usertypeInupdate() {

		page.selectDropdownWithVisibleText(usertype1, "admin");
		return new  AdminUsers(driver);
	}

	public AdminUsers clicksubmitButtonUpdate() {
		page.javascriptclick(adminupdateclick, driver);
		return new  AdminUsers(driver);
	}

}