package com.wizrspace;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wizrspace_Home extends Wizrspace {
	By body = By.xpath("//html");
	public Wizrspace_Home(WebDriver driver) {
		super(driver);
	}
	public void video_file_rightclick() {
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.className("Main_Imagecontainer_videoPanel__iE95X"));
		action.contextClick(link).perform();
	}

	public void cloudhome() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(30));
		Actions action = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Files have been uploaded successfully.']")));
		driver.findElement(By.xpath("//div[@class='Progressbar_close__Hvoiu']")).click();
		WebElement link = driver.findElement(By.xpath("(//div[@class='Main_Imagecontainer_image_box__9Co_T'])[1]"));
		action.contextClick(link).perform();
	}
	public void Openfile() throws InterruptedException {
		driver.findElement(Openoption).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='FilePreview_icons_circle__MS3J1'])[1]")).click();
		this.video_file_rightclick();
		Thread.sleep(5000);
		driver.findElement(Openoption).click();
		driver.findElement(By.xpath("(//div[@class='FilePreview_icons_circle__MS3J1'])[2]")).click(); //open download
		Thread.sleep(5000);
		driver.findElement(Backopenview).click();
		Thread.sleep(5000);
		
	}
	public void videoopenfile() throws InterruptedException {
		By videobox = By.xpath("//video[@class='FilePreview_video_preview__tf8sa']");
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement link = driver.findElement(By.className("Main_Imagecontainer_videoPanel__iE95X"));
		action.contextClick(link).perform();
		driver.findElement(Openoption).click();
		Thread.sleep(5000);
		driver.findElement(videobox).click();
		Thread.sleep(10000);
		js.executeScript("arguments[0].pause();", driver.findElement(By.className("FilePreview_video_preview__tf8sa")));
		Thread.sleep(5000);
		js.executeScript("arguments[0].muted = true;", driver.findElement(By.className("FilePreview_video_preview__tf8sa")));
		Thread.sleep(5000);
		driver.findElement(Backopenview).click();
	}
	public void documentfileopen() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("(//div[@class='Main_Imagecontainer_app_inner__KRnYr'])[1]"));
		action.contextClick(link).perform();
		driver.findElement(Openoption).click();
		Thread.sleep(5000);
		driver.findElement(Backopenview).click();
	}
	
	public void sharedfile() throws InterruptedException {
		this.video_file_rightclick();
		Thread.sleep(5000);
		driver.findElement(shareoption).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='ShareOption_input_div__lDzsH'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("recepients")).sendKeys("taniya");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='ShareOption_user_list_cont__KnZWb']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='ShareOption_input_div__lDzsH'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("recepients")).sendKeys("Annesh");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='ShareOption_user_list_cont__KnZWb']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//option[@value='editor']")).click();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//div[@class='ShareOption_input_div__lDzsH'])[3]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//abbr[@aria-label='February 27, 2024']")).click();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='ShareOption_input_div__lDzsH'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//abbr[@aria-label='April 30, 2024']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='CustomCalendar_apply__oNIW0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ShareOption_inputbox__YGV_E']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='ShareOption_inputbox__YGV_E']")).sendKeys("123");
		driver.findElement(By.className("ShareOption_copy_icon__yAngO")).click();
		driver.findElement(By.xpath("//div[text()=' Done ']")).click();
		Thread.sleep(10000);
		
		
	}
	public void sharedfile_via_generatelink() throws InterruptedException {
		this.video_file_rightclick();
		driver.findElement(shareoption).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Generate Link']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("GenerateLinkModel_copy_icon__cWWsQ")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("GenerateLinkModel_cancle_btn__RLZAh")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=' Cancel ']")).click();
		
		}
	
	public void starredfile() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.className("Main_Imagecontainer_videoPanel__iE95X"));
		action.contextClick(link).perform();
		Thread.sleep(5000);
		driver.findElement(Starredoption).click();
		Thread.sleep(5000);
		driver.findElement(Universalmenu).click();
		driver.findElement(Starred).click();
		WebElement link1 = driver.findElement(By.className("Main_Imagecontainer_videoPanel__iE95X"));
		action.contextClick(link1).perform();
		Thread.sleep(5000);
		driver.findElement(Starredoption).click();
		Thread.sleep(5000);
		driver.findElement(Cloud_home).click();
	}
	public void renamefile() throws InterruptedException {
		this.video_file_rightclick();
		driver.findElement(Renameoption).click();
		Thread.sleep(2000);
		driver.findElement(Renamefileinputarea).clear();
		Thread.sleep(2000);
		driver.findElement(Renamefileinputarea).sendKeys(" ");
		Thread.sleep(2000);
		driver.findElement(Renamefileinputarea).sendKeys(generateRandomId());
		Thread.sleep(2000);
		driver.findElement(Renamesubmit).click();
		Thread.sleep(2000);

	}
	public void tag_file() throws InterruptedException {
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("(//div[@class='Main_Imagecontainer_mainDiv__FcHPO'])[1]"));
		action.contextClick(link).perform();
		Thread.sleep(2000);
		driver.findElement(Tagoption).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='Tags_addtext__bvW4_']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("Tags_addtext__bvW4_")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#tag")).sendKeys(generateRandomId());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#tag")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("Vector")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Square")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Premium")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='+ New Color']")).click();
		driver.findElement(By.cssSelector("input#hex_code")).sendKeys("1CF6F6");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".Tags_save_icon__C6mQd")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[name()='svg'])[28]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='Tags_add_button__Djvi4']")).click();
		Thread.sleep(2000);
		this.video_file_rightclick();
		driver.findElement(Tagoption).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='Tags_cancel_button__yK0Ex']")).click();
	}
	public void enable_disableComment() throws InterruptedException {
		this.video_file_rightclick();
		driver.findElement(EnableCommentoption).click();
		Thread.sleep(2000);
		driver.findElement(Openoption).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='FilePreview_icons_circle__MS3J1'])[1]")).click();
	}
	
	public void view_comment() throws InterruptedException {
		this.video_file_rightclick();
		driver.findElement(Viewcomment).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".ViewComment_cross_icon__5eG9k")).click();
	}
	
	public void duplicate_file() throws InterruptedException {
		Thread.sleep(2000);
		video_file_rightclick();
		driver.findElement(Duplicateoption).click();
		Thread.sleep(5000);  
		
		
	}
	
	public void movefile() throws InterruptedException {
		video_file_rightclick();
		driver.findElement(Movetooption).click();
		driver.findElement(By.xpath("//div[@class='MoveToOption_left_div__jTuXz']//span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("folderinput")).sendKeys("knight");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()=' Create ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='knight']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()=' Done ']")).click();
//		Actions action = new Actions(driver);
//		WebElement link = driver.findElement(By.xpath("(//div[@class='Main_Imagecontainer_image_box__9Co_T'])[3]"));
//		action.contextClick(link).perform();
//		driver.findElement(Movetooption).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[text()='New Folder']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[text()=' Done ']")).click();
		
	}
	
	public void properties() throws InterruptedException {
		video_file_rightclick();
		Thread.sleep(3000);
		driver.findElement(Propertiesoption).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='PropertiesModel_icon_circle__faEBQ'])[1]")).click();  //starred
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='PropertiesModel_icon_circle__faEBQ'])[2]")).click();  //delete
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1800));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("DeletePopup_middleDiv__jJkki")));
		Thread.sleep(5000);
		video_file_rightclick();
		Thread.sleep(7000);
		try {
			driver.findElement(Propertiesoption).click();
		}
		catch (Exception e) {
			System.out.println("Exception caught"+e.getMessage());
		}
		driver.findElement(By.xpath("(//div[@class='PropertiesModel_icon_circle__faEBQ'])[3]")).click(); // comments
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".ViewComment_cross_icon__5eG9k")).click();
		Thread.sleep(3000);
		video_file_rightclick();
		Thread.sleep(3000);
		driver.findElement(Propertiesoption).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='PropertiesModel_icon_circle__faEBQ'])[4]")).click(); //download
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".PropertiesModel_cross_icon__4OvJ8")).click();
	}

	public void delete1() throws InterruptedException {
		Thread.sleep(5000);
		video_file_rightclick();
		Thread.sleep(5000);
		driver.findElement(Deleteoption).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='UNDO']")).click();
		
	}
	
	public void delete2() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("(//div[@class='Main_Imagecontainer_image_box__9Co_T'])[1]"));
		action.contextClick(link).perform();
		Thread.sleep(5000);
		driver.findElement(Deleteoption).click();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("DeletePopup_middleDiv__jJkki")));
		driver.findElement(Universalmenu).click();
		Thread.sleep(5000);
		driver.findElement(Trash).click();
		driver.findElement(By.className("AfterImg_upload_empty_btn__Pf8wD")).click();
		
	}
	public void downloadmain() throws InterruptedException {
		driver.findElement(Cloud_home).click();
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("(//div[@class='Main_Imagecontainer_image_box__9Co_T'])[1]"));
		WebElement link1 = driver.findElement(By.xpath("(//div[@class='Main_Imagecontainer_mainDiv__FcHPO'])[1]"));
//		action.contextClick(link).perform(); 					//for image modal
		action.contextClick(link1).perform();                   //for video
		Thread.sleep(5000);
		driver.findElement(downloadoption).click();
		
		
	}
	
	//grid view multiple file check
	
	public void multiplefilecheck() throws InterruptedException {
		WebElement  checkbox = driver.findElement(By.xpath("(//div[@class='Main_Imagecontainer_checkbox__Pu8Ds'])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(checkbox).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1000);
		WebElement  checkbox2 = driver.findElement(By.xpath("(//div[@class='Main_Imagecontainer_checkbox__Pu8Ds'])[2]"));
		action.moveToElement(checkbox2).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(1000);
		WebElement  checkbox3 = driver.findElement(By.xpath("(//div[@class='Main_Imagecontainer_checkbox__Pu8Ds'])[3]"));
		action.moveToElement(checkbox3).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(2000);
	}
	
	public void addtoStarred() throws InterruptedException {
		Thread.sleep(2000);
		this.multiplefilecheck();
		driver.findElement(By.xpath("//div[@class='PreviewOptionChecked_innerDiv__VOpwE'][3]")).click();  //lower modal starred
		Thread.sleep(5000);
	}
	
	public void delete() throws InterruptedException {
		this.multiplefilecheck();
		driver.findElement(By.xpath("//div[@class='PreviewOptionChecked_innerDiv__VOpwE'][2]")).click();     //Lower modal delete
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='UNDO']")).click();
		
	}

}
