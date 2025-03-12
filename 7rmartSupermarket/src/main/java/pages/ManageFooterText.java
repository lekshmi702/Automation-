package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterText {

	public WebDriver driver;

	public ManageFooterText(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")
	WebElement manageeditclick;
	@FindBy(xpath = "//textarea[@name='address']")
	WebElement footeraddress;
	@FindBy(xpath = "//input[@id='email']")
	WebElement footemail;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement footnumber;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-info']")
	WebElement footupdateclick;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement footalert;

	public ManageFooterText manageedit() {
		manageeditclick.click();
		return new ManageFooterText(driver);
	}

	public ManageFooterText footeraddress(String footeraddresss) {
		footeraddress.clear();
		footeraddress.sendKeys(footeraddresss);
		return new ManageFooterText(driver);
	}

	public ManageFooterText footemail(String email)

	{

		footemail.clear();
		footemail.sendKeys(email);
		return new ManageFooterText(driver);
	}

	public ManageFooterText footnumber(String number) {
		footnumber.clear();
		footnumber.sendKeys(number);
		return new ManageFooterText(driver);
	}

	public ManageFooterText footupdateclick() {
		footupdateclick.click();
		return new ManageFooterText(driver);
	}

	public boolean footalert() {
		return footalert.isDisplayed();
	}

}