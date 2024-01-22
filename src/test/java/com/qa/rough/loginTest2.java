package com.qa.rough;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class loginTest2 {

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.zoho.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		
		HomePage home = new HomePage(driver);
		home.gotoSignin();
		
		LoginPage login = new LoginPage(driver);
		login.doLogin("subbu.test0@gmail.com", "test200test");
		
	}

}
;