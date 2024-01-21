package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void gotoSignUp() {
		driver.findElement(By.cssSelector("a.signUp:nth-child(2)")).click();
	}

	public void gotoSignin() {
		
		driver.findElement(By.cssSelector(".login")).click();

	}

	public void gotoSupport() {
		driver.findElement(By.cssSelector("li.fin-ctn:nth-child(5) > a:nth-child(1)")).click();
	}

	public void gotoZohoEu() {

	}
	
	public void validateFooterLinks() {

	}

}
