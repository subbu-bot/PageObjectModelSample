package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RefreshWiFiScheduler {

	private final WebDriver driver;

	public RefreshWiFiScheduler() {
		// Initialise the WebDriver in the constructor
		this.driver = new FirefoxDriver();
	}

	public void refreshWIFI() {
		driver.switchTo().alert().accept();
		driver.get("https://www.msftconnecttest.com/redirect");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		System.out.println("Refreshing WIFI...");
	}

	public static void main(String[] args) {
		RefreshWiFiScheduler scheduler = new RefreshWiFiScheduler();

		// Create a scheduled executor service with a single thread
		ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

		// Schedule the refreshWIFI method to run every 60 minutes
		executorService.scheduleAtFixedRate(scheduler::refreshWIFI, 0, 60, TimeUnit.MINUTES);
	}
}
