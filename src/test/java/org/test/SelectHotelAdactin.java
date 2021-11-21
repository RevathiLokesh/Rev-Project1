package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelAdactin extends LibGlobal {
public SelectHotelAdactin()
{
	PageFactory.initElements(driver,this);
}

public WebElement getSelectLocation() {
	return selectLocation;
}

public WebElement getSelectHotel() {
	return selectHotel;
}

public WebElement getRoomType() {
	return roomType;
}

public WebElement getNofRooms() {
	return nofRooms;
}

public WebElement getCheckinDate() {
	return checkinDate;
}

public WebElement getCheckoutDate() {
	return checkoutDate;
}

public WebElement getAdultsRooms() {
	return adultsRooms;
}

public WebElement getChildRooms() {
	return childRooms;
}

public WebElement getSearchSubmit() {
	return searchSubmit;
}

public WebElement getResetSearch() {
	return resetSearch;
}



public WebElement getSelectConfirmation() {
	return selectConfirmation;
}

public WebElement getContinue() {
	return Continue;
}

public WebElement getFirstName() {
	return firstName;
}

public WebElement getLastName() {
	return lastName;
}

public WebElement getBillingAddr() {
	return billingAddr;
}

public WebElement getCCNo() {
	return CCNo;
}

public WebElement getCCtype() {
	return CCtype;
}

public WebElement getCCExpiryMonth() {
	return CCExpiryMonth;
}

public WebElement getCCExpiryYear() {
	return CCExpiryYear;
}

public WebElement getCVVNo() {
	return CVVNo;
}

public WebElement getBookNow() {
	return bookNow;
}

public WebElement getOrderId() {
	return orderId;
}
@CacheLookup
@FindAll
({
	@FindBy(name="location"),
	@FindBy(id="location")
})
private WebElement selectLocation;

@CacheLookup
@FindAll({
	@FindBy(name="hotels"),
	@FindBy(id="hotels")
})

private WebElement selectHotel;

@CacheLookup
@FindAll({
	@FindBy(name="room_type"),
	@FindBy(id="room_type")
})
private WebElement roomType;

@CacheLookup
@FindBy(id="room_nos")
private WebElement nofRooms;

@CacheLookup
@FindBy(id="datepick_in")
private WebElement checkinDate;

@CacheLookup
@FindBy(id="datepick_out")
private WebElement checkoutDate;

@CacheLookup
@FindBy(id="adult_room")
private WebElement adultsRooms;

@CacheLookup
@FindBy(id="child_room")
private WebElement childRooms;

@CacheLookup
@FindBy(id="Submit")
private WebElement searchSubmit;

@CacheLookup
@FindBy(id="Reset")
private WebElement resetSearch;

@CacheLookup
@FindAll({
	@FindBy(id="radiobutton_0"),
	@FindBy(name="radiobutton_0")
})

private WebElement selectConfirmation;

@CacheLookup
@FindAll({
	@FindBy(name="continue"),
	@FindBy(id="continue")
})
private WebElement Continue;

@CacheLookup
@FindAll({
	@FindBy(name="first_name"),
	@FindBy(id="first_name")
})
private WebElement firstName;

@CacheLookup
@FindBy(id="last_name")
private WebElement lastName;

@CacheLookup
@FindBy(id="address")
private WebElement billingAddr;

@CacheLookup
@FindBy(id="cc_num")
private WebElement CCNo;

@CacheLookup
@FindBy(id="cc_type")
private WebElement CCtype;

@CacheLookup
@FindBy(id="cc_exp_month")
private WebElement CCExpiryMonth;

@CacheLookup
@FindBy(id="cc_exp_year")
private WebElement CCExpiryYear;

@CacheLookup
@FindBy(id="cc_cvv")
private WebElement CVVNo;

@CacheLookup
@FindBy(id="book_now")
private WebElement bookNow;

@CacheLookup
@FindBy(id="order_no")
private WebElement orderId;
}

