package com.wizrspace;

import org.openqa.selenium.WebDriver;

public class RecentPage extends Wizrspace_Home{

	public RecentPage(WebDriver driver) {
		super(driver);

	}
	public void scrollrecent() throws InterruptedException {
		driver.findElement(Recentmain).click();
		scrolldownpage();
		Thread.sleep(5000);
		super.scrolluppage();
		driver.findElement(Cloud_home).click();
		Thread.sleep(5000);
		driver.findElement(Universalmenu).click();
		Thread.sleep(5000);
		driver.findElement(Recent).click();
		Thread.sleep(5000);
		super.scrolldownpage();
		super.scrolluppage();
		driver.findElement(Cloud_home).click();
		
	}
}
