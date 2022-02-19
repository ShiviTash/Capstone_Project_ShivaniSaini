package com.caps.page.layer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.caps.base.Base;

public class RegisterationPage extends Base {
	
	@FindBy(xpath="//input[@id='username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//li[@id='Inpatient Ward']")
	WebElement ward;
	
	@FindBy(xpath="//input[@class='btn confirm']")
	WebElement loginbtn;

	@FindBy (xpath = "//a[@type='button'][3]")
	WebElement registerpatient;
	
	@FindBy(xpath="//input[@name='givenName']")
	WebElement name;
	
	@FindBy(xpath = "//input[@name='familyName']")
	WebElement familyname;
	
	@FindBy(css = "button#next-button")
	WebElement nxtbtn1;
	
	@FindBy(xpath = "//option[@value='F']")
	WebElement selectgender;

	@FindBy(css = "button#next-button")
	WebElement nextbtn2;

	@FindBy(xpath = "//input[@id='birthdateDay-field']")
	WebElement typeday;

	@FindBy(xpath = "//select[@name='birthdateMonth']")
	WebElement selectmonth;

	@FindBy(xpath = "//input[@id='birthdateYear-field']")
	WebElement typeyear;

	@FindBy(css = "button#next-button")
	WebElement nextbtn3;

	@FindBy(xpath = "//input[@id='address1']")
	WebElement address1;

	@FindBy(xpath = "//input[@id='address2']")
	WebElement address2;

	@FindBy(xpath = "//input[@id='cityVillage']")
	WebElement village;

	@FindBy(xpath = "//input[@id='stateProvince']")
	WebElement state;

	@FindBy(xpath = "//input[@id='country']")
	WebElement country;

	@FindBy(xpath = "//input[@id='postalCode']")
	WebElement postcode;

	@FindBy(css = "button#next-button")
	WebElement nextbtn4;

	@FindBy(xpath = "//input[@name='phoneNumber']")
	WebElement mobilenumber;

	@FindBy(css = "button#next-button")
	WebElement nextbtn5;

	@FindBy(css = "select#relationship_type")
	WebElement relationship;

	@FindBy(xpath = "//input[@placeholder='Person Name']")
	WebElement personname;
	
	@FindBy(css = "button#next-button")
	WebElement nextbtn6;

	@FindBy(xpath = "//input[@value='Confirm']")
	WebElement confirm;
	
	
	
	public RegisterationPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	public  void registerMethod(String un,String pass) throws IOException, InterruptedException {
		userName.sendKeys(un);
		password.sendKeys(pass);
		ward.click();
		loginbtn.click();
		Thread.sleep(3000);
		registerpatient.click();
		name.sendKeys("Shivani");
		familyname.sendKeys("Saini");
		nxtbtn1.click();
		selectgender.click();
		nextbtn2.click();
		typeday.sendKeys("23");
		Select s = new Select(selectmonth);
		s.selectByIndex(6);
		typeyear.sendKeys("1995");
		nextbtn3.click();
		address1.sendKeys("Sikar");
		address2.sendKeys("Sikar");
		village.sendKeys("Sikar");
		state.sendKeys("Rajasthan");
		country.sendKeys("India");
		postcode.sendKeys("332001");
		nextbtn4.click();
		mobilenumber.sendKeys("123456789");
		nextbtn5.click();
		Select se = new Select(relationship);
		se.selectByIndex(2);
		personname.sendKeys("Jai");
		nextbtn6.click();
		confirm.click();
		
		
	}
}

