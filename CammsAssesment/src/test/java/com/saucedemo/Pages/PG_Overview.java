package com.saucedemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PG_Overview {

	WebDriver driver;

	By finish = By.xpath("//button[text()=\"Finish\"]");

	public PG_Overview(WebDriver driver) {

		this.driver = driver;
	}

	public void clickOnFinishButton() {
		driver.findElement(finish).click();
	}
}
