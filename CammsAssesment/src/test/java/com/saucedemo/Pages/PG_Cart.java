package com.saucedemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PG_Cart {

	WebDriver driver;

	By cartIcon = By.xpath("//a[@class=\"shopping_cart_link\"]");
	By verifySelectedItem1 = By.xpath("//div[text()=\"Sauce Labs Backpack\"]");
	By verifySelectedItem2 = By.xpath("//div[text()=\"Sauce Labs Bike Light\"]");
	By checkOutButtonBy = By.xpath("//button[@id=\"checkout\"]");

	public PG_Cart(WebDriver driver) {

		this.driver = driver;
	}

	public void clickOnCarticon() {

		driver.findElement(cartIcon).click();
	}

	public void verifySelectedItems(String selectedStringItemName, String selectedStringItemName2) {

		String SelectedItem1 = driver.findElement(verifySelectedItem1).getText();
		if (SelectedItem1.equals(selectedStringItemName)) {
			System.out.println("First Item name is same as the selected one");
		}

		String SelectedItem2 = driver.findElement(verifySelectedItem2).getText();
		if (SelectedItem2.equals(selectedStringItemName2)) {
			System.out.println("Second Item name is same as the selected one");
		}

	}

	public void clickOnCheckOutButton() {
		driver.findElement(checkOutButtonBy).click();
	}
}
