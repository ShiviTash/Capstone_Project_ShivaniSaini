package com.caps.test.cases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.caps.base.Base;
import com.caps.page.layer.CaptureVitalsPage;
import com.caps.page.layer.LoginPage;

public class CaptureVitalsTest extends Base {
	public CaptureVitalsTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void beforeTest() throws IOException, InterruptedException {
		initialization();
		Thread.sleep(5000);
	}

	@Test
	public void validateCaptureVital() throws Exception {
		LoginPage login = new LoginPage();
		login.loginMethod(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(3000);
		CaptureVitalsPage capt = new CaptureVitalsPage();
		capt.capture1();
	}

	@AfterMethod
	public void afterTest() {
		driver.close();
	}
}
