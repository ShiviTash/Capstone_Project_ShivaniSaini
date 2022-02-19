package com.caps.page.layer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.caps.base.Base;

public class LoginPage extends Base {
	@FindBy(xpath="//input[@id='username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//li[@id='Inpatient Ward']")
	WebElement InpatientWard;
	
	@FindBy(xpath="//input[@class='btn confirm']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//li[@class='nav-item logout']")
	WebElement logout;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement invaliduserName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement invalidpassword;
	
	
	

	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);

	}
	public HomePage loginMethod(String un,String pass) throws IOException, InterruptedException {
		userName.sendKeys(un);
		password.sendKeys(pass);
		InpatientWard.click();
		loginbtn.click();
		Thread.sleep(3000);
		//logout.click();
		

		return new HomePage();

	}
	public void Invalid_loginMethod(String un,String pass) throws IOException, InterruptedException {
		
		//password.sendKeys(pass);
		
		userName.sendKeys(un);
		password.sendKeys(pass);
		InpatientWard.click();
		loginbtn.click();
		WebElement element = driver.findElement(By.xpath("//div[@id='error-message']"));
		String text = element.getText();
		System.out.println(text);
		Assert.assertEquals(text, "Invalid username/password. Please try again.");
		Thread.sleep(5000);
	

	}
	

}
