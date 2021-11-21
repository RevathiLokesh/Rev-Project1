package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPF extends LibGlobal{
public LoginPF()
{
	PageFactory.initElements(driver, this);
}
@CacheLookup
@FindAll({
	@FindBy(id="email"),
	@FindBy(id="username")
})
public WebElement txtEmail;

@CacheLookup
@FindAll({
@FindBy(id="pass"),
@FindBy(id="password")
})
private WebElement txtPass;

@CacheLookup
@FindBys({
@FindBy(name="login")
})
private WebElement btnLogin;

public WebElement getTxtEmail() {
	return txtEmail;
}

public WebElement getTxtPass() {
	return txtPass;
}

public WebElement getBtnLogin() {
	return btnLogin;
	
		
}

public void setTxtEmail(WebElement txtEmail) {
	this.txtEmail = txtEmail;
}

public void setTxtPass(WebElement txtPass) {
	this.txtPass = txtPass;
}

public void setBtnLogin(WebElement btnLogin) {
	this.btnLogin = btnLogin;
}

}