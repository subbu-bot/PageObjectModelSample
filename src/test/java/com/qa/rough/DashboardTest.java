package com.qa.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ZohoDashboard;

public class DashboardTest {

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
		
		ZohoDashboard dash = new ZohoDashboard(driver);
		dash.gotoCRM();
		
		
	}

}
;