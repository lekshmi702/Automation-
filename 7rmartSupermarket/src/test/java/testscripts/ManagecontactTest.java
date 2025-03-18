package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContact;
import utilities.FakerUtilities;

public class ManagecontactTest extends Base{
	LoginPage login;
	HomePage home;
	ManageContact manage;
	FakerUtilities faker=new FakerUtilities();
	
	@Test
	public void verifyuserisableTomanageContactDetails() throws IOException
	{
		
		//fakerutility methods
		String fakephonenumber=faker.phonenumber();
		String fakeemail=faker.generateemail();
		String fakeaddress=faker.addresss();
		long randomNumber=faker.generaterandomnumber();
		
		login=new LoginPage(driver);
		home=login.loginusingexceldata();
		manage=home.clickmanagecontact().manageeditclick().phonenumberfield("1234567890").eneteremail("sapple123@gmail.com").
				addressfield("Obsqurazone kochi,infoparkroad,4tyy").deliverytime("20").deliverlimit("1000").updateclick();
		boolean updatealert=manage.updatealert();
		Assert.assertTrue(updatealert,Constants.Mancontact_verifyuserisableTomanageContactDetails);
		
	}

	
	
	
}
