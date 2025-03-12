package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterText;

public class ManageFooterTest extends Base {
	LoginPage login;
	HomePage home;
	ManageFooterText product;

	@Test
	public void verifyuserisableTomanageproduct() throws IOException {

		login = new LoginPage(driver);
		home = login.loginusingexceldata();
		product = home.managefooterclick().manageedit().footeraddress("obsqura space zone, kochi")
				.footemail("obsqura@123").footnumber("9876543210").footupdateclick();
		boolean footalert = product.footalert();
		Assert.assertTrue(footalert,Constants.Manfoot_verifyuserisableTomanageproduct);

	}
}
