package com.saucedemo.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.saucedemo.Pages.PG_Cart;
import com.saucedemo.Pages.PG_Home;
import com.saucedemo.Pages.PG_Login;
import com.saucedemo.Pages.PG_Overview;
import com.saucedemo.Pages.PG_YourInformation;

public class TestSuite {

	@SuppressWarnings("deprecation")
	@Test
	public void TC_001() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		PG_Login login = new PG_Login(driver);
		PG_Home home = new PG_Home(driver);
		PG_Cart cart = new PG_Cart(driver);
		PG_YourInformation info = new PG_YourInformation(driver);
		PG_Overview Finish = new PG_Overview(driver);

		try {
			login.typeUserName("performance_glitch_user");
			login.typePassword("secret_sauce");
			Thread.sleep(5000);
			login.clickOnLoginButton();
			Thread.sleep(5000);
			home.verifyInventoryItemPrice();
			home.addTwoItemsToTheCart();
			Thread.sleep(10000);
			cart.clickOnCarticon();
			Thread.sleep(10000);
			cart.verifySelectedItems("Sauce Labs Backpack", "Sauce Labs Bike Light");
			cart.clickOnCheckOutButton();
			Thread.sleep(1000);
			info.FillFirstRandomName();
			info.fillSecondRandomName();
			info.fillRandomPostalCode();
			Thread.sleep(1000);
			info.clickOnContinueButton();
			Finish.clickOnFinishButton();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.getMessage();
		}

		driver.quit();

	}

}
