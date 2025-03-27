package pages;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constants;
import utilities.FileuploadUtility;
import utilities.PageUtility;



public class SubCategory {

	public WebDriver driver;
	FileuploadUtility file =new FileuploadUtility();
	PageUtility page= new PageUtility();


	public SubCategory(WebDriver driver)
	{
		this.driver=driver;
		 PageFactory.initElements(driver,this);
	}
	@FindBy (xpath="//a[@class='small-box-footer']")WebElement subcategory;
	@FindBy( xpath="//h1[text()='List Sub Categories']")WebElement text;
    @FindBy(xpath="//a[@onclick='click_button(1)']")WebElement onclick;
    @FindBy(xpath="//select[@id='cat_id']")WebElement newcategory;
    @FindBy(xpath="//input[@id='subcategory']")WebElement subcategoryname;
    @FindBy(xpath="//input[@id='main_img']")WebElement fileupload;
    @FindBy(xpath="//button[text()='Save']")WebElement savebutton;
    @FindBy(xpath="//i[@class='icon fas fa-check']")WebElement alert;
    @FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement search;
    @FindBy(xpath="//select[@id='cat_id']")WebElement dropdown;
    @FindBy(xpath="//input[@name='ut']")WebElement editenetersubcategoryname;
    
    @FindBy(xpath="//button[@name='Search']")WebElement clicksearch;
    @FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss']")WebElement updatebutton;
    
    @FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tr/td[1]") List<WebElement> tablesearch;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement updatealert;
    @FindBy(xpath="//a[@class='btn btn-sm btn btn-danger btncss']")WebElement deletebuttonclick;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement deleteassert;
public SubCategory onclick()
{
	 onclick.click();
	 return new SubCategory(driver);
}

public SubCategory selectcategory()
{
	
page.selectDropdownWithVisibleText(newcategory, "veggies");
return new SubCategory(driver);


}

public SubCategory pageloadtext(String textt)
{
	text.sendKeys(textt);
	 return new SubCategory(driver);
}

public SubCategory entersubname(String entersubcat)
{
	subcategoryname.sendKeys(entersubcat);
	 return new SubCategory(driver);
}
public SubCategory fileupload()
{
	String filepath=Constants.subcategoryfile;
	file.fileuploadusingsendkeys(fileupload, filepath);
	 return new SubCategory(driver);
}

public SubCategory savebutton()
{
	savebutton.click();
	 return new SubCategory(driver);
}

public boolean isalertDisplayed()

{
	return alert.isDisplayed();
}
 public SubCategory searchbutton()
	{
	 
		search.click();
		 return new SubCategory(driver);
	}
	public SubCategory dropdown()
	{
		page.selectDropdownWithVisibleText(dropdown, "veggies");
		 return new SubCategory(driver);
	}
	
	public SubCategory searchsubcategoryname(String subcatname )
	{
		editenetersubcategoryname.sendKeys(subcatname);
		 return new SubCategory(driver);
	
	}
	
	public boolean searchsubmit()
	{
		return clicksearch.isDisplayed();
		
	}
	
	public SubCategory updateclick()
	{
		updatebutton.click();
		 return new SubCategory(driver);
	}
	@FindBy(xpath="//select[@name='cat_id']")WebElement categorynewname;
	public SubCategory newcatname()
	{
		page.selectDropdownWithVisibleText(categorynewname, "burger");
		 return new SubCategory(driver);
	}
	@FindBy(xpath="//input[@id='subcategory']")WebElement subcatname;
	public SubCategory subcatname(String name)
	{
		subcatname.clear();
		subcatname.sendKeys(name);
		 return new SubCategory(driver);
	}
	@FindBy(xpath="//input[@id='main_img']")WebElement choosefile;
	public SubCategory choosefile()
	{
		//choosefile.sendKeys("C:\\Users\\Rakesh\\eclipse-workspace\\7rmartSupermarket\\src\\test\\resources\\images\\download (1).jpeg");
		file.fileuploadusingsendkeys(choosefile,Constants.subcategoryfile);
		 return new SubCategory(driver);
	}
	
	@FindBy(xpath="//button[@name='update']")WebElement clicksave;
public  SubCategory clicksave()
{
	clicksave.click();
	 return new SubCategory(driver);
}

@FindBy(xpath="//select[@id='un']")WebElement searchselectdropdown;
public SubCategory searchselectsubdropdown()
{
	page.selectDropdownWithVisibleText(searchselectdropdown, "burger");
	 return new SubCategory(driver);
}

/*@FindBy(xpath="//input[@placeholder='Sub Category']")WebElement searchsubnameeneter;
public void searchenetersubcatname(String searchsubname)
{
	searchsubnameeneter.sendKeys(searchsubname);
}*/


public boolean updatealert()
{
	return updatealert.isDisplayed();
	
}
@FindBy(xpath="//button[@name='Search']")WebElement searchsearch1;
public SubCategory searchsearch()
{  
	
	searchsearch1.click();
	 return new SubCategory(driver);
}

public boolean elementsearching()
{
	String input="burger";
	int flag=0;
	for(WebElement search:tablesearch)
	{
		if(search.getText().equals(input))
		{
			System.out.println(search.getText());
			flag=1;
			break;
		}
		
	}
	
	if(flag==1)
	{
		System.out.println("Element found");
	}
	else
	{
		System.out.println("Element not found");
	}
	return false;
}


public SubCategory deleteclick()
{

	page.javascriptclick(deletebuttonclick, driver);
	 page.alert(driver);
	 
	 return new SubCategory(driver);
}
	
public boolean deleteassert()
{    
     return deleteassert.isDisplayed();
}

}