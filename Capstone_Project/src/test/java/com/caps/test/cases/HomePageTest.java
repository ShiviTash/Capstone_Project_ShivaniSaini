package com.caps.test.cases;

import org.testng.annotations.Test;

import com.caps.base.Base;
import com.caps.page.layer.HomePage;
import com.caps.page.layer.LoginPage;
import com.caps.page.layer.RegisterationPage;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomePageTest extends Base {
	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void validateRegistrationOfPatient() throws IOException, InterruptedException{
		
		LoginPage loginPage=new LoginPage();
		loginPage.loginMethod(prop.getProperty("username"), prop.getProperty("password"));
		HomePage homePage=new HomePage();		
		RegisterationPage rp= new RegisterationPage();
		rp.registerMethod(prop.getProperty("username"), prop.getProperty("password"));
	}
}
