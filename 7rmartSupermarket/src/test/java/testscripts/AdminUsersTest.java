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

public class AdminUsersTest extends Base {

	PageUtility page = new PageUtility();

	LoginPage login;
	HomePage home;
	AdminUsers admin;

	@Test(groups = "smoke")
	public void verifyuserisableToCreateNewAdminUser() throws IOException {

		login = new LoginPage(driver);
		home = login.loginusingexceldata();
		String username = "Vichu" + page.generateCurrentDateAndTime();
		admin = home.adminusersclick().createnewadmin().usernamefield(username).passwordfield("lekshmi").usertype().adminsave();
       boolean adminalert1 = admin.adminalert();
		Assert.assertTrue(adminalert1, Constants.Aduser_verifyuserisableToCreateNewAdminUser);

	}

}
