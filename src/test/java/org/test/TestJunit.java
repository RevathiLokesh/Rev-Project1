package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJunit {
	static WebDriver driver;
@BeforeClass
public static void beforeClass()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\MvnProject\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
}

@AfterClass
public static void afterClass()
{
	driver.close();
}
@Before
public void beforeMethod()
{
	Date d=new Date();
	System.out.println(d);
}
@After
public void afterMethod()
{
	Date d=new Date();
	System.out.println(d);
}
@Test
public void tc1()
{
	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys("welcome");
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("testing");
	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
}

}

