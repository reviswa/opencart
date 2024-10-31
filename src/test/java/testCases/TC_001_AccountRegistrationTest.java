package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	@Test
	public void verify_account_registration() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		Thread.sleep(3000);
		hp.clickMyAccount();
		hp.clickRegister();
		logger.info("Test case started");
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setFirstname(randomeString().toUpperCase());
		regpage.setLastname(randomeString().toUpperCase());
		regpage.setemail(randomeString()+"@gmail.com");// randomly generated the email
		regpage.setTelephone(randomeNumber());
		
		String password=randomAlphaNumeric();
		
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.clickAgree();
		regpage.clickContinue();
		
		String confmsg=regpage.getMsgConfirmation();
		try{
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		logger.info("test case passed");
		}
		catch(Exception e) {
			logger.error(e +"test case failed" );
		}
		
	}
	
	
	
	
}








