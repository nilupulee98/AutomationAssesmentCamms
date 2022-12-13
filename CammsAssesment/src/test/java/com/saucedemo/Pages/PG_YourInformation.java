package com.saucedemo.Pages;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PG_YourInformation {

	WebDriver driver;

	By firstName = By.xpath("//input[@id=\"first-name\"]");
	By secondName = By.xpath("//input[@id=\"last-name\"]");
	By postalCode = By.xpath("//input[@id=\"postal-code\"]");
	By _continue = By.xpath("//input[@id=\"continue\"]");

	public PG_YourInformation(WebDriver driver) {

		this.driver = driver;
	}

	public void FillFirstRandomName() {

		try {
			String uuid = UUID.randomUUID().toString();
			// Now this uuid enter to your text box
			driver.findElement(firstName).sendKeys(uuid);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void fillSecondRandomName() {

		try {
			String uuid = UUID.randomUUID().toString();
			driver.findElement(secondName).sendKeys(uuid);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void fillRandomPostalCode() {

		try {
			String uuid = UUID.randomUUID().toString();
			driver.findElement(postalCode).sendKeys(uuid);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickOnContinueButton() {
		driver.findElement(_continue).click();
		;
	}

}
