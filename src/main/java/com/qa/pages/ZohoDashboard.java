package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZohoDashboard {
	WebDriver driver;

	public ZohoDashboard(WebDriver driver) {
		this.driver = driver;
	}

	public void gotoCRM() {

		driver.findElement(By.xpath("//a[@href='/crm/?ireft=nhome&src=all-products-phome']//span[@class='zh-content']//em[@class='dis-inlineblk blueLink arrow-icon'][contains(text(),'Try Now')]")).click();
	}

//	public void gotoMail() {
//
//	}
//
//	public static void main(String[] args) {
//
//	}

}
