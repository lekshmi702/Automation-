package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constants;
import pages.Category;
import pages.HomePage;
import pages.LoginPage;
import utilities.PageUtility;

public class CategoryTest extends Base{
	PageUtility page = new PageUtility();
	LoginPage login;
	HomePage home;
	Category cat;


@Test(groups={"smoke"})
public void verifyuserisableTocreateCategory() throws IOException
{
	 login=new LoginPage(driver);
	home=login.loginusingexceldata();
	String eneternewcategoryy="job"+page.generateCurrentDateAndTime();

	cat=home.clickcategory().clicknewbutton().
			enternewcategry(eneternewcategoryy).discount().choosefile()
			.clicksavebutton();
	//cat.enternewcategry("job");

	
	

	boolean categoryalert=cat.categoryalert();
	Assert.assertTrue(categoryalert,Constants.Catpage_verifyuserisableTocreateCategory);
	
}

@Test(groups={"smoke"})
public void verifyuserisableToupdatecategory() throws IOException
{
	
	login=new LoginPage(driver);
	home=login.loginusingexceldata();
	cat=home.clickcategory().categoryupdateclick().catrgoryupdatename().categorydiscount1().categoryupdate1();
	boolean alertdisplayed=cat.updatealert();
	Assert.assertTrue(alertdisplayed,Constants.Catpage_verifyuserisableToupdatecategory);
	
	
	
	
	
}
/*
@Test
public void verifycategorysearch() throws IOException
{
	
	LoginPage login=new LoginPage(driver);
	login.loginusingexceldata();
	
	HomePage home=new HomePage(driver);
	home.clickcategory();
	Category cat=new Category(driver);
	cat.categorysearch();
	cat.categorysearchname("IT JOBS");
	
	cat.categorysearchnamesearchclick();
	//boolean alertdisplayed=cat.categoryalert();
	//Assert.assertTrue(alertdisplayed,"unsuccessfull");
  
	
	
}*/



}



