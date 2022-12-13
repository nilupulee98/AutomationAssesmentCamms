package com.saucedemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PG_Login {

	WebDriver driver;

	By userName = By.xpath("//input[@id=\"user-name\"]");
	By password = By.xpath("//input[@id=\"password\"]");
	By loginButton = By.xpath("//input[@id=\"login-button\"]");

	public PG_Login(WebDriver driver) {

		this.driver = driver;
	}

	public void typeUserName(String UserName) {
		driver.findElement(userName).sendKeys(UserName);
	}

	public void typePassword(String Password) {

		driver.findElement(password).sendKeys(Password);

	}

	public void clickOnLoginButton() {

		driver.findElement(loginButton).click();

	}
}
