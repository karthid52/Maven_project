package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_confirmation {

	
	public WebDriver driver;
	
	@FindBy(id="search_hotel")
	private WebElement search_hotel;
	
	
	
	public Booking_confirmation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}



	public WebElement getSearch_hotel() {
		return search_hotel;
	}
	
	
}
