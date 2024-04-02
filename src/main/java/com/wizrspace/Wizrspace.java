package com.wizrspace;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wizrspace {
	WebDriver driver;

	//upload file
	By Universalmenu = By.xpath("(//img)[1]");
	By newupload = By.xpath("//button[@class='sc-hmdomO jVHynP']");
	By fileupload = By.xpath("//div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/button[1]");
	By Changefile = By.xpath("//label[@class='Uploadfile_add_file__goN_b']");
	By Uploadfile_dropdown = By.xpath("//div[@class='Uploadfile_dropdown_icon__ar5Rd']");
	By Custom_expire = By.xpath("(//div[@class='Uploadfile_date_div__HH2__ '])[4]");
	By Selected_date = By.xpath("//abbr[@aria-label='April 30, 2024']");
	By Apply_date = By.xpath("//div[@class='CustomCalendar_apply__oNIW0']");
	By Cancel_upload = By.xpath("//div[@class='Uploadfile_cancel_button__FbUuT']");
	By done_first = By.xpath("//div[@class='Uploadfile_button__D_7up Uploadfile_done__cXbJc']");
	By Done_fileUpload = By.xpath("//div[@class='Uploadfile_done_button__z_dK6']");
	By Taginputtext = By.xpath("//input[@class='TagUploadFile_taginput_area__FRzg1']");

	//top menu
	By Cloud_home = By.xpath("(//div[@class='Index_nav_box1__3HnHZ'])[1]");
	By Starredmain = By.xpath("(//div[@class='Index_nav_box1__3HnHZ'])[2]");
	By Recentmain = By.xpath("(//div[@class='Index_nav_box1__3HnHZ'])[3]");

	//options

	By Openoption =  By.xpath("//span[@class='PreviewOption_text__UG06L']");
	By shareoption = By.xpath("(//span[@class='PreviewOption_text__UG06L'])[2]");
	By Starredoption = By.xpath("(//span[@class='PreviewOption_text__UG06L'])[3]");
	By Tagoption = By.xpath("(//span[@class='PreviewOption_text__UG06L'])[4]");
	By EnableCommentoption = By.xpath("(//span[@class='PreviewOption_text__UG06L'])[5]");
	By Viewcomment = By.xpath("(//span[@class='PreviewOption_text__UG06L'])[6]");
	By Duplicateoption = By.xpath("(//span[@class='PreviewOption_text__UG06L'])[7]");
	By Movetooption = By.xpath("(//span[@class='PreviewOption_text__UG06L'])[8]");
	By Renameoption = By.xpath("(//span[@class='PreviewOption_text__UG06L'])[9]");
	By Propertiesoption = By.xpath("(//span[@class='PreviewOption_text__UG06L'])[10]");
	By Deleteoption = By.xpath("(//span[@class='PreviewOption_text__UG06L'])[11]");
	By downloadoption = By.xpath("(//span[@class='PreviewOption_text__UG06L'])[12]");

	//open:
	By Backopenview = By.xpath("//div[@class='FilePreview_back__z79Xd']");


	//Rename Options:
	By Renamefileinputarea = By.xpath("//input[@class='Rename_input_area__vpPMt']");
	By Renamesubmit = By.xpath("//div[text()='Rename']");
	By RenameCancel = By.xpath("//div[text()='Cancel']");
	
	//universal menu
	By Trash = By.xpath("(//div[@class='sc-aXZVg sc-jlZhew kUKtgC fKQqvk'])[6]");
	By share_with_me = By.xpath("(//div[@class='sc-dAlyuH gEqme'])[3]");
	By Recent = By.xpath("(//div[@class='sc-dAlyuH gEqme'])[4]");
	By Starred = By.xpath("(//div[@class='sc-dAlyuH gEqme'])[5]");
	
	//Different View
	By Listview = By.xpath("(//div[@class='AfterImg_upload_list_circle__3oOYL'])[1]");
	By Gridview = By.xpath("(//div[@class='AfterImg_upload_list_circle__3oOYL'])[2]");
	By Doubleview = By.xpath("(//div[@class='AfterImg_upload_list_circle__3oOYL'])[3]");

	public Wizrspace(WebDriver driver) {
		this.driver = driver;
	}
	public void scrolldownpage() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for (int i = 0; i < 10; i++) {
			js.executeScript("window.scrollBy(0, 200);");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void scrolluppage() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for (int i = 10; i > 0; i--) {
			js.executeScript("window.scrollBy(0, -200);");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static String CHARSET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";

	public static String generateRandomId() {
		Random rand = new Random();
		char randomChar = CHARSET.charAt(rand.nextInt(CHARSET.length()));
		int randomInt = rand.nextInt(20);

		String result = String.format("%c%08d", randomChar, randomInt, randomChar, randomInt);
		return result;
	}


	public void newfileupload() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(Universalmenu).click();
		Thread.sleep(2000);
		driver.findElement(newupload).click();
		Thread.sleep(2000);
		driver.findElement(fileupload).click();
		By fileinput = By.xpath("//input[@id='file']");
		driver.findElement(fileinput).sendKeys("C:\\Users\\Annesh\\Desktop\\assasinscreed.jpg");
		By changefileinput = By.xpath("//input[@id='myfile']");
		Thread.sleep(2000);
		driver.findElement(changefileinput).sendKeys("C:\\\\Users\\\\Annesh\\\\Desktop\\\\assasinscreed.jpg");
		driver.findElement(changefileinput).sendKeys("C:\\Users\\Annesh\\Desktop\\End Run _ Full Movie _ Inspired from 2019 Balakot Airstrike _ Republic Day 2020.mp4");
		driver.findElement(Uploadfile_dropdown).click();
		Thread.sleep(2000);
		driver.findElement(Custom_expire).click();
		Thread.sleep(2000);
		driver.findElement(Selected_date).click();
		Thread.sleep(2000);
		driver.findElement(Apply_date).click();
		Thread.sleep(2000);
		driver.findElement(done_first).click();
		driver.findElement(Cancel_upload).click();
		driver.findElement(By.cssSelector(".AfterImg_upload_cross_icon__7QuOR")).click();
		Thread.sleep(5000);
	}

	public void uploadfile2() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(Universalmenu).click();
		Thread.sleep(2000);
		driver.findElement(newupload).click();
		Thread.sleep(2000);
		driver.findElement(fileupload).click();
		By fileinput = By.xpath("//input[@id='file']");
		Thread.sleep(2000);
		driver.findElement(fileinput).sendKeys("C:\\Users\\Annesh\\Desktop\\crysis.jpg");
		By changefileinput = By.xpath("//input[@id='myfile']");
		Thread.sleep(2000);
		driver.findElement(changefileinput).sendKeys("C:\\Users\\Annesh\\Desktop\\mortal-kombat.jpg");
		driver.findElement(changefileinput).sendKeys("C:\\Users\\Annesh\\Desktop\\file_example_WAV_1MG.wav");
		driver.findElement(Uploadfile_dropdown).click();
		Thread.sleep(2000);
		driver.findElement(Custom_expire).click();
		Thread.sleep(2000);
		driver.findElement(Selected_date).click();
		Thread.sleep(2000);
		driver.findElement(Apply_date).click();
		Thread.sleep(2000);
		driver.findElement(done_first).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='Uploadfile_tag_button__mMBg4']")).click();
		driver.findElement(Taginputtext).click();
		Thread.sleep(2000);
		driver.findElement(Taginputtext).sendKeys("tag1");
		Thread.sleep(2000);
		driver.findElement(Taginputtext).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(Taginputtext).sendKeys("tag2");
		Thread.sleep(2000);
		driver.findElement(Taginputtext).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Image']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Landscape")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Free")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Done']")).click();
		Thread.sleep(2000);
		driver.findElement(Done_fileUpload).click();
		Thread.sleep(2000);
	}
	public void differntviewfileupload() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(Universalmenu).click();
		Thread.sleep(2000);
		driver.findElement(newupload).click();
		Thread.sleep(2000);
		driver.findElement(fileupload).click();
		By fileinput = By.xpath("//input[@id='file']");
		Thread.sleep(2000);
		driver.findElement(fileinput).sendKeys("C:\\\\Users\\\\Annesh\\\\Desktop\\\\mortal-kombat.jpg");
		By changefileinput = By.xpath("//input[@id='myfile']");
		Thread.sleep(2000);
		driver.findElement(changefileinput).sendKeys("C:\\Users\\Annesh\\Desktop\\Kolkata-Knight-Riders.jpg");
		driver.findElement(changefileinput).sendKeys("C:\\\\Users\\\\Annesh\\\\Desktop\\\\RIYAN PARAG.mp4");
		Thread.sleep(2000);
		driver.findElement(Done_fileUpload).click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Files have been uploaded successfully.']")));
		driver.findElement(By.xpath("//div[@class='Progressbar_close__Hvoiu']")).click();
	}

}
