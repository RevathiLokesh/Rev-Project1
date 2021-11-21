package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class RegisterLoginAdactin extends LibGlobal{
	public RegisterLoginAdactin()
	{
		PageFactory.initElements(driver,this);

	}
	
	@CacheLookup
	@FindBy(xpath="//a[@href=\"Register.php\"]")
	private WebElement clickRegisterNow;
	

	@CacheLookup
	@FindAll({
		@FindBy(id="username"),
		@FindBy(name="username")
	})
	private WebElement regUsername;
	
	@CacheLookup
	@FindAll({
		@FindBy(name="password"),
		@FindBy(xpath="(//input[@type='password'])[1]"),
		@FindBy(id="password")
		
	})
	
	private WebElement regPass;
	
	@CacheLookup
	@FindAll({
		@FindBy(name="re_password"),
		@FindBy(xpath="(//input[@type='password'])[2]"),
		@FindBy(id="re_password")
	})
	private WebElement regConfirmPass;
	
	@CacheLookup
	@FindAll({
		@FindBy(name="full_name"),
		@FindBy(id="full_name")
		
	})
				
	private WebElement regFullName;
	
	@CacheLookup
	@FindAll({
		@FindBy(name="email_add"),
		@FindBy(id="email_add")
	})
	private WebElement regEmail;
	
	
	
	@CacheLookup
	@FindAll({
		@FindBy(name="tnc_box"),
		@FindBy(id="tnc_box"),
		@FindBy(xpath="//input[@type='chekbox']")
	})
	
	private WebElement regCheckbox;
	
	@CacheLookup
	@FindAll({
		@FindBy(name="Submit"),
		@FindBy(id="Submit")
	})
	private WebElement Register;
	
	@CacheLookup
	@FindAll({
		@FindBy(name="username"),
		@FindBy(id="username")
	})
	
	private WebElement LoginUsername;
	

	@CacheLookup
	@FindAll({
		@FindBy(name="password"),
		@FindBy(id="password")
	})
	private WebElement LoginPassword;
	
	@CacheLookup
	@FindAll({
		@FindBy(name="login"),
		@FindBy(id="login")
	})
	private WebElement LoginSubmit;
	
	@CacheLookup
	@FindBy(xpath="//a[@href=\"index.php\"]")
	private WebElement Loginlink;
	
	@CacheLookup
	@FindBy(name="location")
	private WebElement SelectLocation;

	public WebElement getClickRegisterNow() {
		return clickRegisterNow;
	}
	public WebElement getRegUsername() {
		return regUsername;
	}

	public WebElement getRegPass() {
		return regPass;
	}

	public WebElement getRegConfirmPass() {
		return regConfirmPass;
	}

	public WebElement getRegFullName() {
		return regFullName;
	}

	public WebElement getRegEmail() {
		return regEmail;
	}

		public WebElement getRegCheckbox() {
		return regCheckbox;
	}

	public WebElement getRegister() {
		return Register;
	}

	public WebElement getLoginUsername() {
		return LoginUsername;
	}
	public WebElement getLoginPassword() {
		return LoginPassword;
	}
	public WebElement getLoginSubmit() {
		return LoginSubmit;
	}
	public WebElement getLoginlink() {
		return Loginlink;
	}
	}

