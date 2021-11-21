package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinSearchHotel extends LibGlobal {
public static void main(String[] args) throws IOException, InterruptedException {
	browserConfig();
	openUrl("https://adactinhotelapp.com/");
	maximizeWindow();
	RegisterLoginAdactin la=new RegisterLoginAdactin();
	type(la.getLoginUsername(), excelRead(1,1));
	type(la.getLoginPassword(), excelRead(1,2));
	click(la.getLoginSubmit());
	
	SelectHotelAdactin sh=new SelectHotelAdactin();
	dropDownText(sh.getSelectLocation(), "Sydney");
	dropDownText(sh.getSelectHotel(), "Hotel Sunshine");
	dropDownIndex(sh.getRoomType(), 2);
	dropDownValue(sh.getNofRooms(), "1");
	type(sh.getCheckinDate(), "31-10-2021");
	type(sh.getCheckoutDate(), "5-11-2021");
	dropDownValue(sh.getAdultsRooms(), "4");
	dropDownIndex(sh.getChildRooms(), 0);
	click(sh.getSearchSubmit());
	click(sh.getSelectConfirmation());
	click(sh.getContinue());
	type(sh.getFirstName(), excelRead(1,3));
	type(sh.getLastName(), excelRead(1,4));
	type(sh.getBillingAddr(), excelRead(1,5));
	type(sh.getCCNo(), "1234567890123456");
	dropDownText(sh.getCCtype(), "VISA");	
	dropDownText(sh.getCCExpiryMonth(), "January");
	dropDownText(sh.getCCExpiryYear(), "2022");
	type(sh.getCVVNo(), "123");
	click(sh.getBookNow());
	Thread.sleep(10000);
	WebElement orderId = driver.findElement(By.id("order_no"));
	String attribute = orderId.getAttribute("value");
	System.out.println("Generated Order Id: " +attribute);
	excelWrite(2,0,attribute);
}
}
