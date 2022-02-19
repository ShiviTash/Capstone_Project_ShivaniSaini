package com.caps.page.layer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.caps.base.Base;



public class CaptureVitalsPage extends Base{
	public CaptureVitalsPage() throws IOException {
		super();
	}

	public void capture1() throws InterruptedException {
		WebElement capture_vitals = driver.findElement(By.xpath(prop.getProperty("capture_vitals_path")));
		capture_vitals.click();
		Thread.sleep(500);

		WebElement patient_select = driver.findElement(By.cssSelector(prop.getProperty("searchpatient")));
		patient_select.click();
		patient_select.sendKeys("1002KL");
		patient_select.sendKeys(Keys.ENTER);
		Thread.sleep(500);

		WebElement patient_ID = driver.findElement(By.xpath(prop.getProperty("patient_ID_path")));
		String ID = patient_ID.getText();
		System.out.println(ID);
		Assert.assertEquals(prop.getProperty("Patient_ID"), ID);

	}
}
