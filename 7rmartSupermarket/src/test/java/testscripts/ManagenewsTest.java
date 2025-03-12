package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNews;

public class ManagenewsTest extends Base
{
	LoginPage login;
	HomePage home;
	ManageNews news;
	
	
	
	@Test
	public void verifyuserisableToAddNewNews() throws IOException
	{
	
	
	login=new LoginPage(driver);
	home=login.loginusingexceldata();
    news=home.managenewsclick().newbutton().newsenter("This is my news").save();
	boolean  alertnews=news.alrt();
	
	Assert.assertTrue(alertnews,Constants.Mannews_verifyuserisableToAddNewNews);
	

}
	
	@Test
	public void  verifyuserisableTonewseditNews() throws IOException
	{
		 login=new LoginPage(driver);
		home=login.loginusingexceldata();
		news=home.managenewsclick().newbutton1().newsenter1("This is my news1").save1();
		boolean  alertnews1=news.alrt1();
		
		Assert.assertTrue(alertnews1,Constants.Mannews_verifyuserisableToEditNews);
		
		
	}
	
	
	
	
}