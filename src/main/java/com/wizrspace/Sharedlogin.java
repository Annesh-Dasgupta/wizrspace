package com.wizrspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sharedlogin extends Wizrspace_Home {

	public Sharedlogin(WebDriver driver) {
		super(driver);
	}
	public static boolean isElementPresent(WebDriver driver, By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
	public void shared_with_me() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(Universalmenu).click();
		Thread.sleep(5000);
		driver.findElement(share_with_me).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='Main_Imagecontainer_mainDiv__FcHPO'])[1]")).click();
		Thread.sleep(5000);
		if (isElementPresent(driver, By.id("password"))) {
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("123");
            driver.findElement(By.xpath("(//div[@class='SharePassword_passButton__9Dmyj'])[2]")).click();
        } else {
        	driver.findElement(By.className("FilePreview_rightarrow__9qNgB")).click();
        }
		Thread.sleep(5000);
		driver.findElement(By.className("FilePreview_rightarrow__9qNgB")).click();
		Thread.sleep(5000);
		if (isElementPresent(driver, By.id("password"))) {
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("123");
            driver.findElement(By.xpath("(//div[@class='SharePassword_passButton__9Dmyj'])[2]")).click();
        } else {
        	driver.findElement(By.className("FilePreview_rightarrow__9qNgB")).click();
        }
		Thread.sleep(5000);
		driver.quit();
	}

}
