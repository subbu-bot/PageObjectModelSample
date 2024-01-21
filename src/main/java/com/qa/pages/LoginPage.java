package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void doLogin(String username, String password) throws InterruptedException {

		driver.findElement(By.cssSelector("#login_id")).sendKeys(username);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='nextbtn']")));

		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();

	}

}
