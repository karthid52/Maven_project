package com.Properties.Sdp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.Baseclass.Base_Class;
import com.sdp.Page_Object_Manager;

public class Runner_class_propertyfile extends Base_Class {

	public static WebDriver driver = Base_Class.getBrowser("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {

		String url = File_Reader_Manger.getInstanceFRM().getInstanceCR().getUrl();
		getUrl(url);

		String username = File_Reader_Manger.getInstanceFRM().getInstanceCR().getUsername();
		sentvalue(pom.getInstanceLp().getUsername(), username);

		String password = File_Reader_Manger.getInstanceFRM().getInstanceCR().getPassword();
		sentvalue(pom.getInstanceLp().getPassword(), password);

		clickonElement(pom.getInstanceLp().getLogin());

		dropdown(pom.getInstanceHs().getLocation(), "byvalue", "Sydney");

		dropdown(pom.getInstanceHs().getHotels(), "byvalue", "Hotel Creek");

		dropdown(pom.getInstanceHs().getRoomtype(), "byvalue", "Standard");

		dropdown(pom.getInstanceHs().getRoom_nos(), "byvalue", "1");

		clear(pom.getInstanceHs().getDatepick_in());

		clear(pom.getInstanceHs().getDatepick_out());

		String in_date = File_Reader_Manger.getInstanceFRM().getInstanceCR().getIn_date();
		sentvalue(pom.getInstanceHs().getDatepick_in(), in_date);

		String out_date = File_Reader_Manger.getInstanceFRM().getInstanceCR().getOut_date();
		sentvalue(pom.getInstanceHs().getDatepick_out(), out_date);

		Thread.sleep(5000);
		dropdown(pom.getInstanceHs().getAdult_room(), "byvalue", "1");

		dropdown(pom.getInstanceHs().getChild_room(), "byvalue", "1");

		clickonElement(pom.getInstanceHs().getSubmit());

		clickonElement(pom.getInstanceSh().getRadiobutton());

		clickonElement(pom.getInstanceSh().getContinues());

		String firstname = File_Reader_Manger.getInstanceFRM().getInstanceCR().getFirstname();
		sentvalue(pom.getInstanceBh().getFirst_name(), firstname);

		String lastname = File_Reader_Manger.getInstanceFRM().getInstanceCR().getLastname();
		sentvalue(pom.getInstanceBh().getLast_name(), lastname);

		String address = File_Reader_Manger.getInstanceFRM().getInstanceCR().getAddress();
		sentvalue(pom.getInstanceBh().getAddress(), address);

		String cc_num = File_Reader_Manger.getInstanceFRM().getInstanceCR().getCc_num();
		sentvalue(pom.getInstanceBh().getCc_num(), cc_num);

		dropdown(pom.getInstanceBh().getCc_type(), "byvalue", "MAST");

		dropdown(pom.getInstanceBh().getCc_exp_month(), "byvalue", "10");

		dropdown(pom.getInstanceBh().getCc_exp_year(), "byvalue", "2022");

		String cvv_num = File_Reader_Manger.getInstanceFRM().getInstanceCR().getCvv_num();
		sentvalue(pom.getInstanceBh().getCc_cvv(), cvv_num);
		clickonElement(pom.getInstanceBh().getBook_now());

		Thread.sleep(5000);

		ScrollonElement(pom.getInstanceBc().getSearch_hotel());

		Takescreenshot("pic1");
		Thread.sleep(5000);

		close();
	}
}
