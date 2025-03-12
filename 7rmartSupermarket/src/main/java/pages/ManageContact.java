package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContact {

	public WebDriver driver;

	public ManageContact(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")
	WebElement managecontacteditbuttonclick;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phonenumberfield;
	@FindBy(xpath = "//input[@id='email']")
	WebElement eneteremail;
	@FindBy(xpath = "//textarea[@name='address']")
	WebElement addressfield;
	@FindBy(xpath = "//textarea[@name='del_time']")
	WebElement deliverytime;
	@FindBy(xpath = "//input[@name='del_limit']")
	WebElement deliverylimit;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-info']")
	WebElement updateclick;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement updatealert;

	public ManageContact manageeditclick() {
		managecontacteditbuttonclick.click();
		return new ManageContact (driver);
	}

	public  ManageContact  phonenumberfield(String number) {

		phonenumberfield.sendKeys(number);
		return new ManageContact (driver);

	}

	public  ManageContact  eneteremail(String email) {
		eneteremail.clear();
		eneteremail.sendKeys(email);
		return new ManageContact (driver);
	}

	public  ManageContact  addressfield(String addresses) {
		addressfield.clear();
		addressfield.sendKeys(addresses);
		return new ManageContact (driver);
	}

	public  ManageContact  deliverytime(String time) {
		deliverytime.clear();
		deliverytime.sendKeys(time);
		return new ManageContact (driver);
	}

	public  ManageContact  deliverlimit(String limit) {
		deliverylimit.clear();
		deliverylimit.sendKeys(limit);
		return new ManageContact (driver);
	}

	public  ManageContact  updateclick() {
		updateclick.click();
		return new ManageContact (driver);
	}

	public boolean updatealert() {
		return updatealert.isEnabled();
	}
}
