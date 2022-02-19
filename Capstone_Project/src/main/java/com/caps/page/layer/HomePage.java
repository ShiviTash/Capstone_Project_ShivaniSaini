package com.caps.page.layer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.caps.base.Base;

public class HomePage extends Base {

	@FindBy(xpath="//a[@type='button'][3]")
	WebElement res;


	public HomePage() throws IOException {
		super();

	}
	public void   homeMethod() throws IOException, InterruptedException {

		res.click();
		Thread.sleep(5000);
		//return new  ResistrationPage();
	}
}
