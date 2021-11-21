package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TrialRead extends LibGlobal {
public static void main(String[] args) throws IOException {
	browserConfig();
	openUrl("http://adactinhotelapp.com/");
	maximizeWindow();
	WebElement txtUsername = driver.findElement(By.id("username"));
	type(txtUsername,excelRead(1,5));
	WebElement txtPass = driver.findElement(By.id("password"));
	type(txtPass,excelRead(1,1));
}
}

