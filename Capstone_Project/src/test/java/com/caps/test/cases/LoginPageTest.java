package com.caps.test.cases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.caps.base.Base;
import com.caps.page.layer.HomePage;
import com.caps.page.layer.LoginPage;


public class LoginPageTest extends Base {
	public LoginPage loginPage; 
	public HomePage homePage; 


	public LoginPageTest() throws IOException {
		super(); 
		}

	@BeforeMethod 
	public void launchBrowser() throws InterruptedException,IOException { 
		initialization();
		loginPage=new LoginPage();

	}

	@Test(priority=1)
	public void validateLoginPage() throws IOException,
	InterruptedException {
		homePage=loginPage.loginMethod(prop.getProperty("username"),prop.getProperty("password"));
		System.out.println("ValidateLoginPage is done");


	}
	@Test(priority=2)
	public void invalidvalidateLoginPage() throws IOException,
	InterruptedException {
		loginPage.Invalid_loginMethod(prop.getProperty("invalidusername"), prop.getProperty("invalidpassword"));



	}
	
//	@AfterMethod
//	public void close_browser() {
//		driver.close();
//	}

	



}
