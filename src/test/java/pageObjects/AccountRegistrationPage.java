package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	// https://demo.opencart.com/en-gb?route=common/home
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstname;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastname;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement btnAgree;

	@FindBy(xpath="//input[@value='Continue']") 
	WebElement btnContinue;

	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	@FindBy(xpath="//input[@id='input-telephone']") 
	WebElement txtTelephone;
	
	@FindBy(xpath="//input[@id='input-confirm']") 
	WebElement txtConfirmPassword;


	public void setFirstname(String fname) {
		txtFirstname.sendKeys(fname);
	}

	public void setLastname(String lname) {
		txtLastname.sendKeys(lname);
	}

	public void setemail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	public void setTelephone(String tel) {
		txtTelephone.sendKeys(tel);

	}

	

	public void setConfirmPassword(String pwd) {
		txtConfirmPassword.sendKeys(pwd);

	}
	public void clickAgree() {
		btnAgree.click();
	}

	public void clickContinue() {
		btnContinue.click();
	}

	public String getMsgConfirmation() {
		try {
			return msgConfirmation.getText();
		} catch (Exception e) {
			return e.getMessage();

		}
	}
}
