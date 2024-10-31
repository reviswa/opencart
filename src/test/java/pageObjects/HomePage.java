package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	//https://demo.opencart.com/en-gb?route=common/home
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//span[text()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement lnkLogin;
	
	
	
	public void clickMyAccount() {
		lnkMyaccount.click();
	}
	public void clickRegister() {
		lnkRegister.click();
	}
	public void clickLogin() {
			lnkLogin.click();
		
		
		
	}
}
