package testscripts;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.SubCategory;
import utilities.PageUtility;

public class SubcategoryTest extends Base
{
	
	PageUtility page= new PageUtility();
	LoginPage login;
	HomePage home;
	SubCategory subcategory;
	
	
	
	@Test
	public void verifyAddNewSubCategoryWithValidDetails() throws IOException
	{
	      login=new LoginPage(driver);
		home=login.loginusingexceldata();
		String enetersubname="ladiesfinger"+page.generateCurrentDateAndTime();
		
		
		subcategory=home.clicksubcategory().onclick().selectcategory().
		entersubname(enetersubname).fileupload().savebutton();
		boolean alertdisplayed=subcategory.isalertDisplayed();
		Assert.assertTrue(alertdisplayed,Constants.Subcat_verifyAddNewSubCategoryWithValidDetails);
		
		
		
	
		
	}
	
	
	@Test 
	public void verifyuserisableToupdateCategory() throws IOException
	{
		
		 login=new LoginPage(driver);
		home=login.loginusingexceldata();
		String subcatnewname=("chicken burger");
		subcategory=home.clicksubcategory().updateclick().newcatname().
	subcatname(subcatnewname).choosefile().clicksave();
	boolean isupdatealertdisplayed=subcategory.isalertDisplayed();
	Assert.assertTrue(isupdatealertdisplayed,Constants.Subcat_verifyuserisableToupdateCategory);
	}
	
}
	/*
	@Test
	
	public void searchTheCreatedSubcategoryInSearchbar() throws IOException
	  {

		LoginPage login=new LoginPage(driver);
		login.loginusingexceldata();
		
		HomePage home=new HomePage(driver);
		home.clicksubcategory();
		
		SubCategory subcategory=new SubCategory(driver);
		 subcategory.searchbutton();
		  subcategory.searchselectsubdropdown();

			String entersubname="chicken burger";
			subcategory.searchsubcategoryname(entersubname);
		subcategory.searchsearch();

			boolean alertdisplayed=subcategory.isalertDisplayed();
			Assert.assertTrue(alertdisplayed,"unsuccessfull");
		  
		  
	  }	  

	@Test
	public void deletesubCategory() throws IOException
	{

		LoginPage login=new LoginPage(driver);
		login.loginusingexceldata();
		
		HomePage home=new HomePage(driver);
		home.clicksubcategory();
		SubCategory subcategory=new SubCategory(driver);
		subcategory.deleteclick();
	
		//boolean deleteassertt=subcategory.deleteassert();
		//Assert.assertTrue(deleteassertt, "subcategory not deleted");
		
		

	
	
	
	
	}*/
	
	

	

	


