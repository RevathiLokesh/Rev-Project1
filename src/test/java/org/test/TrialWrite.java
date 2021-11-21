package org.test;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TrialWrite extends LibGlobal{
public static void main(String[] args) throws IOException {
	browserConfig();
	openUrl("http://adactinhotelapp.com/");
	maximizeWindow();
	WebElement txtEmail = driver.findElement(By.id("username"));
	type(txtEmail, excelRead(3,3));
	String attribute = txtEmail.getAttribute("value");
	excelWrite(2,2,attribute);
	WebElement txtPass = driver.findElement(By.id("password"));
	type(txtPass,excelRead(2,1));
	String attribute2 = txtPass.getAttribute("value");
	excelWrite(3,2,attribute2);

}
}
