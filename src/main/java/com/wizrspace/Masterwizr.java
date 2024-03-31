package com.wizrspace;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class Masterwizr {
	WebDriver driver;
	
	public Masterwizr(WebDriver driver) {
		this.driver = driver;
	}
	By errorbutton = By.xpath("//button[@aria-label='Dismiss']");
	By login_email = By.xpath("//input[@name='email']");
	By login_pass = By.xpath("//input[@name='password']");
	By submitlogin = By.xpath("//button[@class='sc-kOPcWz bKaczs']");
	
	public void loginmw() {
		driver.findElement(login_email).sendKeys("rimpa@ascendeongroup.com");
		driver.findElement(login_pass).sendKeys("Vsat1s23nl@");
		driver.findElement(submitlogin).click();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://wizrspace.wizrapps.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void loginmw2() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(login_email).sendKeys("taniya@ascendeongroup.com");
		driver.findElement(login_pass).sendKeys("Vsat1s23nl@");
		driver.findElement(submitlogin).click();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://wizrspace.wizrapps.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	

}
