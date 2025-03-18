package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constants;
import pages.LoginPage;

public class LoginTest  extends Base {
	
	
	
	@Test
	public void vrifyuserisAbletologinWithValidCredentials() throws IOException
	{
		
	
		  
		  LoginPage lp=new LoginPage(driver);
		  lp.loginusingexceldata();
		  
		  
		  boolean ishomepageloded=lp.ishomepageloded();
		  Assert.assertTrue(ishomepageloded,Constants.lp_verifyuserisAbletologinWithValidCredentials);
		 }
	
	@Test(dataProvider="DataProvider")
	 public void  verifyUserIsabletologinWithValidUsernameInvalidpassword(String username,String password)
	  {
	  
		 LoginPage lp1=new LoginPage(driver);
		 lp1.enterusernameonusernameField(username);
		  lp1.enterpasswordnameField(password);
		  lp1.clickloginField();
		  boolean isalertdisplayed=lp1.isalertdisplayed();
		  Assert.assertTrue(isalertdisplayed,Constants.Lp_verifyUserIsabletologinWithValidUsernameInvalidpassword);
		  
	  }
	@Test
	 public void verifyUserisAbletoLoginWithinvalidusernameAndvalidpassword()
	  {
		  String username="apple";
		  String password="admin";
		  LoginPage lp2=new LoginPage(driver);
		  lp2.enterusernameonusernameField(username);
		  lp2.enterpasswordnameField(password);
		  lp2.clickloginField();
		  boolean isalertdisplayed=lp2.isalertdisplayed();
		  Assert.assertTrue(isalertdisplayed,Constants.Lp_verifyUserisAbletoLoginWithinvalidusernameAndvalidpassword);
	  }
	@Test
	 public void verifyUserIsableToLoginWithInvalidCredentials()
	  {
		  String username="apple";
		  String password="12345";
		  LoginPage lp3=new LoginPage(driver);
		  lp3.enterusernameonusernameField(username);
		  lp3.enterpasswordnameField(password);
		  lp3.clickloginField();
		  boolean isalertdisplayed=lp3.isalertdisplayed();
		  Assert.assertTrue(isalertdisplayed,Constants.Lp_verifyUserIsableToLoginWithInvalidCredentials);
		  
		  
	  }
	  @DataProvider(name="DataProvider")
	  public Object[][]  dataprovider()
	  {
		return new  Object[][] {{"admin","1234"},{"admin","123345"},{"admin","45667"}};
		  
	}
}
	
	


