package pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constants;
import utilities.FileuploadUtility;
import utilities.PageUtility;

public class Category {

	public WebDriver driver;
	FileuploadUtility file = new FileuploadUtility();
	PageUtility page=new PageUtility();
	

	public Category(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add']")
	WebElement clicknewcategoryButton;
	@FindBy(xpath = "//input[@id='category']")
	WebElement enternewcategoryname;
	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement discount;
	@FindBy(xpath = "//input[@name='main_img']")
	WebElement choosefile;
	@FindBy(xpath = "//button[@name='create']")
	WebElement clicksavebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement categoryalert;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")
	WebElement categoryupdateclick;
	@FindBy(xpath = "//input[@placeholder='Enter the Category']")
	WebElement categoryupdatename;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement categoryupdate;
	
	@FindBy(xpath="//ul[@class='ms-list']")WebElement discount1;
	
	
	
	
	
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	WebElement updatealert;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement categorysearch;
	@FindBy(xpath = "//input[@class='form-control']")
	WebElement categorysearchname;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	WebElement categorysearchnamesearchclick;
	@FindBy(xpath = "//td[text()='IT JOBS']")
	List<WebElement> categorysearchassert;

	public Category clicknewbutton() {
		clicknewcategoryButton.click();
		return new Category(driver);
	}

	public Category enternewcategry(String catname) {
		enternewcategoryname.clear();
		enternewcategoryname.sendKeys(catname);
		return new Category(driver);
	}

	public Category discount() {
		discount.click();
		return new Category(driver);
	}

	public Category choosefile() {
		//choosefile.sendKeys(
				//"C:\\Users\\Rakesh\\eclipse-workspace\\7rmartSupermarket\\src\\test\\resources\\images\\gettyimages-969428856-612x612.jpg");
		
		file.fileuploadusingsendkeys(choosefile,Constants.categoryfile);
		return new Category(driver);
	}

	public Category clicksavebutton() {
		clicksavebutton.click();
		return new Category(driver);
	}

	public boolean categoryalert() {
		return categoryalert.isDisplayed();
		
	}

	public Category categoryupdateclick() {
		categoryupdateclick.click();
		return new Category(driver);
	}

	public Category catrgoryupdatename() {
		categoryupdatename.clear();
		categoryupdatename.sendKeys("Private JOBS");
		return new Category(driver);

	}
	
	public Category categorydiscount1()
	{
		discount1.click();
		return new Category (driver);
	}
	
	
	

	public Category categoryupdate1() {
		//categoryupdate.click();
		page.javascriptclick(categoryupdate, driver);
		return new Category(driver);
	}

	public boolean updatealert() {
		return updatealert.isDisplayed();
	}

	public Category categorysearch() {
		categorysearch.click();
		return new Category(driver);
	}

	public  Category categorysearchname(String searchname) {
		categorysearchname.sendKeys(searchname);
		return new Category(driver);
	}

	public Category categorysearchnamesearchclick() {
		categorysearchnamesearchclick.click();
		return new Category(driver);
	}

	public boolean categorysearchassert() {

		String input = "burger";
		int flag = 0;
		for (WebElement search : categorysearchassert) {
			if (search.getText().equals(input)) {
				System.out.println(search.getText());
				flag = 1;
				break;
			}

		}

		if (flag == 1) {
			System.out.println("Element found");
		} else {
			System.out.println("Element not found");
		}
		return false;
	}

}
