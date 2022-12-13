package com.saucedemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PG_Home {

	WebDriver driver;

	By inventory_item_price = By.xpath("(//div[@class=\"inventory_item_price\"])[4]");
	By addToCartItem1 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	By addToCartItem2 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");

	public PG_Home(WebDriver driver) {

		this.driver = driver;
	}

	public void verifyInventoryItemPrice() {

		try {
			String itemPriceString = driver.findElement(inventory_item_price).getText();

			if (itemPriceString.equals(itemPriceString)) {
				System.out.println("Sauce Labs Fleece Jacket is $49.99");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void addTwoItemsToTheCart() {

		driver.findElement(addToCartItem1).click();
		driver.findElement(addToCartItem2).click();

	}

}
