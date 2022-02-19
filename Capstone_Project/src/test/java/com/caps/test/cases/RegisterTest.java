package com.caps.test.cases;

import org.testng.annotations.Test;

import com.caps.base.Base;
import com.caps.page.layer.RegisterationPage;

import java.io.IOException;

import org.testng.annotations.Test;

public class RegisterTest extends Base {
	public RegisterTest() throws IOException {
	}
	
	@Test
	public void registerpatientdetails() throws IOException, InterruptedException {
		initialization();
		RegisterationPage reg = new RegisterationPage();
		reg.registerMethod(prop.getProperty("username"),prop.getProperty("password"));
		System.out.println(" Patient Registration Successfull ");
	}
}
