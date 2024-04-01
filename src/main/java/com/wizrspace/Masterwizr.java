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
	
	public void loginmw() throws InterruptedException {
		driver.findElement(login_email).sendKeys("rimpa@ascendeongroup.com");
		Thread.sleep(5000);
		driver.findElement(login_pass).sendKeys("Vsat1s23nl@");
		Thread.sleep(5000);
		driver.findElement(submitlogin).click();
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://wizrspace.wizrapps.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void loginmw2() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(login_email).sendKeys("taniya@ascendeongroup.com");
		Thread.sleep(5000);
		driver.findElement(login_pass).sendKeys("Vsat1s23nl@");
		Thread.sleep(5000);
		driver.findElement(submitlogin).click();
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://wizrspace.wizrapps.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	

}
