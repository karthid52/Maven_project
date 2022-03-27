package com.runnerclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.Baseclass.Base_Class;
import com.sdp.Page_Object_Manager;

public class Runner_Class extends Base_Class {
	public static WebDriver driver = Base_Class.getBrowser("chrome");

	static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException, InterruptedException {

		getUrl("https://adactinhotelapp.com/");
		
		String user_name = read_particular_data("C:\\Users\\Baskar\\eclipse-workspace\\Maven\\Excel_File\\Adactin.xlsx", 0, 1);

		sentvalue(pom.getInstanceLp().getUsername(), user_name);

		String password = read_particular_data("C:\\Users\\Baskar\\eclipse-workspace\\Maven\\Excel_File\\Adactin.xlsx", 1, 1);
		sentvalue(pom.getInstanceLp().getPassword(),password );

		clickonElement(pom.getInstanceLp().getLogin());

		dropdown(pom.getInstanceHs().getLocation(), "byvalue", "Sydney");

		dropdown(pom.getInstanceHs().getHotels(), "byvalue", "Hotel Creek");

		dropdown(pom.getInstanceHs().getRoomtype(), "byvalue", "Standard");

		dropdown(pom.getInstanceHs().getRoom_nos(), "byvalue", "1");

		clear(pom.getInstanceHs().getDatepick_in());

		clear(pom.getInstanceHs().getDatepick_out());

		String pic_indate = read_particular_data("C:\\Users\\Baskar\\eclipse-workspace\\Maven\\Excel_File\\Adactin.xlsx", 2, 1);
		sentvalue(pom.getInstanceHs().getDatepick_in(),pic_indate );

		String pic_outdate = read_particular_data("C:\\Users\\Baskar\\eclipse-workspace\\Maven\\Excel_File\\Adactin.xlsx", 3, 1);
		sentvalue(pom.getInstanceHs().getDatepick_out(), pic_outdate);

		Thread.sleep(5000);
		dropdown(pom.getInstanceHs().getAdult_room(), "byvalue", "1");

		dropdown(pom.getInstanceHs().getChild_room(), "byvalue", "1");

		clickonElement(pom.getInstanceHs().getSubmit());

		clickonElement(pom.getInstanceSh().getRadiobutton());

		clickonElement(pom.getInstanceSh().getContinues());
		

		String F_name = read_particular_data("C:\\Users\\Baskar\\eclipse-workspace\\Maven\\Excel_File\\Adactin.xlsx", 4, 1);
		sentvalue(pom.getInstanceBh().getFirst_name(), F_name);

		String S_name = read_particular_data("C:\\Users\\Baskar\\eclipse-workspace\\Maven\\Excel_File\\Adactin.xlsx", 5, 1);
		sentvalue(pom.getInstanceBh().getLast_name(), S_name);
		
		String address = read_particular_data("C:\\Users\\Baskar\\eclipse-workspace\\Maven\\Excel_File\\Adactin.xlsx", 6, 1);
		sentvalue(pom.getInstanceBh().getAddress(), address);

		String cc_num= read_particular_data("C:\\Users\\Baskar\\eclipse-workspace\\Maven\\Excel_File\\Adactin.xlsx", 7, 1);
		sentvalue(pom.getInstanceBh().getCc_num(), cc_num);

		dropdown(pom.getInstanceBh().getCc_type(), "byvalue", "MAST");

		dropdown(pom.getInstanceBh().getCc_exp_month(), "byvalue", "10");

		dropdown(pom.getInstanceBh().getCc_exp_year(), "byvalue", "2022");

		String cvv_num = read_particular_data("C:\\Users\\Baskar\\eclipse-workspace\\Maven\\Excel_File\\Adactin.xlsx", 8, 1);
		sentvalue(pom.getInstanceBh().getCc_cvv(), cvv_num);
		clickonElement(pom.getInstanceBh().getBook_now());

		Thread.sleep(5000);

		ScrollonElement(pom.getInstanceBc().getSearch_hotel());

		Takescreenshot("pic1");
		Thread.sleep(5000);
		
		close();
	}
}
