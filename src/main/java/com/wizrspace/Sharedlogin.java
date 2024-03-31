package com.wizrspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sharedlogin extends Wizrspace_Home {

	public Sharedlogin(WebDriver driver) {
		super(driver);
	}
	public void shared_with_me() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(Universalmenu).click();
		Thread.sleep(5000);
		driver.findElement(share_with_me).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='Main_Imagecontainer_image_box__9Co_T']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='SharePassword_passButton__9Dmyj'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='SharePassword_passButton__9Dmyj'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("FilePreview_rightarrow__9qNgB")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='SharePassword_passButton__9Dmyj'])[2]")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
