package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageNews {

	public WebDriver driver;
	WaitUtility wait= new WaitUtility();

	public ManageNews(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newbutton;
	@FindBy(xpath = "//textarea[@id='news']")
	WebElement newsenter;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement newssave;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertnews;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")
	WebElement newbutton1;
	@FindBy(xpath = "//textarea[@id='news']")
	WebElement newsenter1;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement newssave1;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertnews1;

	public ManageNews newbutton() {
		newbutton.click();
		return new ManageNews(driver);
	}

	public ManageNews newsenter(String news) {
		newsenter.sendKeys(news);
		return new ManageNews(driver);
		
	}

	public ManageNews save() {
		newssave.click();
		return new ManageNews(driver);
		
	}

	public boolean alrt() {
		return alertnews.isDisplayed();
	}
	// managenew edit

	public ManageNews newbutton1() {
		newbutton1.click();
		return new ManageNews(driver);
	}

	public ManageNews newsenter1(String news) {
		newsenter1.sendKeys(news);
		return      new ManageNews(driver);
	}

	public ManageNews save1() {
		newssave1.click();
		return new ManageNews(driver);
	}
     
	
	public boolean alrt1() {
		
		 wait.waitForAlertToBePresent(driver);
		return alertnews1.isDisplayed();
	}

}
