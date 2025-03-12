package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constants;
import pages.AdminUsers;
import pages.HomePage;
import pages.LoginPage;
import utilities.PageUtility;

public class AdminUsersTest extends Base{
	
	PageUtility page=     new PageUtility();
	
	LoginPage login;
	HomePage home;
	AdminUsers admin;
	
	@Test
	public void verifyuserisableToCreateNewAdminUser() throws IOException
	{
		
		

	    login=new LoginPage(driver);
		home=login.loginusingexceldata();
		String username="Vichu"+page.generateCurrentDateAndTime();
		admin=home.adminusersclick().createnewadmin().usernamefield(username)
				.passwordfield("lekshmi").usertype().adminsave();
		
		boolean adminalert1=admin.adminalert();
		Assert.assertTrue(adminalert1,Constants.Aduser_verifyuserisableToCreateNewAdminUser);
		
	}

	/*
	@Test
	
	public void adminuserssearch() throws IOException
	{
		
		
		LoginPage login=new LoginPage(driver);
		login.loginusingexceldata();
		
		HomePage home=new HomePage(driver);
		home.adminusersclick();
		
		AdminUsers admin=new AdminUsers(driver);
		admin.adminsearch();
		admin.adminsearchusername("CHINCHU");
		admin.adminsearchtype("admin");
		admin.adminsearch();
		
		
		
		
		
		
		
	}
	
	@Test 
	public void updateadmin() throws IOException
	{
		

		LoginPage login=new LoginPage(driver);
		login.loginusingexceldata();
		
		HomePage home=new HomePage(driver);
		home.adminusersclick();
		
		AdminUsers admin=new AdminUsers(driver);
		admin.adminupdate();
		admin.adminupdatename("Aswathy");
		admin.passwordfieldinUpdate("12345");
		admin.usertypeInupdate();
		admin.clicksubmitButtonUpdate();
		
		
		
	}*/
	
}
