package com.wizrspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Listview_Space extends Wizrspace {

	public Listview_Space(WebDriver driver) {
		super(driver);
	}
	
	//Sort heading
	
	By filename = By.xpath("(//div[@class='ListViewHeader_file_info__ulfAD'])[1]");
	By Lastmodified = By.xpath("(//div[@class='ListViewHeader_file_info__ulfAD'])[2]");
	By Size = By.xpath("(//div[@class='ListViewHeader_file_info__ulfAD'])[3]");
	By Type = By.xpath("(//div[@class='ListViewHeader_file_info__ulfAD'])[4]");
	By Owner = By.xpath("(//div[@class='ListViewHeader_file_info__ulfAD'])[5]");
	
	
	By Clearfilter = By.xpath("//div[@class='ListViewHeader_clearall_filter__b2v_H']");
	
	public void FilenameSort() throws InterruptedException {
		driver.findElement(Listview).click();
		Thread.sleep(2000);
		driver.findElement(filename).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@style='cursor: pointer;'])[2]")).click();
		Thread.sleep(2000);
		super.scrolldownpage();
		super.scrolluppage();
		
	}
	public void LastmodifiedSort() throws InterruptedException {
		driver.findElement(Lastmodified).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@style='cursor: pointer;'])[2]")).click();
		Thread.sleep(2000);
		super.scrolldownpage();
		Thread.sleep(5000);
		super.scrolluppage();
	}
	public void Sizesort() throws InterruptedException {
		driver.findElement(Size).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@style='cursor: pointer;'])[3]")).click();
		super.scrolldownpage();
		Thread.sleep(5000);
		super.scrolluppage();
		Thread.sleep(5000);
		driver.findElement(By.className("ListViewHeader_arrow_icon__o9G_T")).click();
		Thread.sleep(5000);
	}
	public void clearfilter() throws InterruptedException {
		driver.findElement(Clearfilter).click();
		Thread.sleep(5000);
	}
	public void Typesort() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(Type).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@style='cursor: pointer;'])[4]")).click();
		super.scrolldownpage();
		super.scrolluppage();
	}
	public void Fileownersort() throws InterruptedException {
		driver.findElement(Owner).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@style='cursor: pointer;'])[3]")).click();
		
	}
	public void openlistviewfile() throws InterruptedException {
		driver.findElement(By.className("FileListView_ppt_icon__5LVoZ")).click();
		Thread.sleep(5000);
		driver.findElement(Backopenview).click();
	}
	
	public void checklistviewfile() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='FileListView_checkbox__T3EDL'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='FileListView_checkbox__T3EDL'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='FileListView_checkbox__T3EDL'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='FileListView_checkbox__T3EDL'])[4]")).click();
		Thread.sleep(2000);
	}
	
	public void listviewmultiplefilecheck_addtoStarred() throws InterruptedException {
		this.checklistviewfile();
		driver.findElement(By.xpath("//div[@class='PreviewOptionChecked_innerDiv__VOpwE'][3]")).click();    //add to starred
	}
	public void listviewmultiplefilecheck_delete() throws InterruptedException {
		Thread.sleep(5000);
		this.checklistviewfile();
		driver.findElement(By.xpath("//div[@class='PreviewOptionChecked_innerDiv__VOpwE'][2]")).click();     //delete
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='UNDO']")).click();
	}
	public void listviewmultiplefilecheck_share() throws InterruptedException {
		Thread.sleep(5000);
		this.checklistviewfile();
		driver.findElement(By.xpath("//div[@class='PreviewOptionChecked_innerDiv__VOpwE'][1]")).click();
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
		driver.findElement(By.xpath("(//div[@class='ShareOption_input_div__lDzsH'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//abbr[@aria-label='March 15, 2024']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='ShareOption_input_div__lDzsH'])[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//abbr[@aria-label='April 28, 2024']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='ShareOption_inputbox__YGV_E']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='ShareOption_inputbox__YGV_E']")).sendKeys("123");
		driver.findElement(By.className("ShareOption_copy_icon__yAngO")).click();
		driver.findElement(By.xpath("//div[text()=' Done ']")).click();
		Thread.sleep(10000);
		
	}
	

}
