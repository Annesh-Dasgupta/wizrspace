package com.wizrspaceAPP;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wizrspace.Listview_Space;
import com.wizrspace.Masterwizr;
import com.wizrspace.RecentPage;
import com.wizrspace.Sharedlogin;
import com.wizrspace.Wizrspace;
import com.wizrspace.Wizrspace_Home;

public class TestWizrspace {
	WebDriver driver;
	WebDriver driver1;
	Wizrspace ws;
	Wizrspace_Home wshome;


	@BeforeTest 
	public void openlogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.wizrapps.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));




	}
	@Test(priority = 1)
	public void login () throws InterruptedException {
		Masterwizr mw = new Masterwizr(driver);
		mw.loginmw();

	}
	@Test(priority = 2)
	public void wizr_space() throws InterruptedException{
		ws = new Wizrspace(driver);
		//		ws.newfileupload();
		ws.uploadfile2();

	}

	@Test(priority = 3)
	public void wizrspace_home() throws InterruptedException {
		wshome = new Wizrspace_Home(driver);
		wshome.cloudhome();
		wshome.Openfile();
		wshome.videoopenfile();
//		wshome.documentfileopen();					
//		wshome.addtoStarred(); //grid view lower modal
//		wshome.delete(); //grid view lower modal
		
    }
	@Test(priority = 4)
	public void starredfile() throws InterruptedException {
		wshome.starredfile();
	}
	@Test(priority = 5)
	public void Sharedfile() throws InterruptedException {
		wshome.sharedfile();
	}
	@Test(priority = 6)
	public void share_via_link() throws InterruptedException {
		wshome.sharedfile_via_generatelink();
	}
	@Test(priority = 7)
	public void Renamefile() throws InterruptedException {
		wshome.renamefile();
	}
	@Test(priority = 8)
	public void Tag() throws InterruptedException {
		wshome.tag_file();
	}
	@Test(priority = 9)
	public void enable_disable_comment() throws InterruptedException {
		wshome.enable_disableComment();
	}
	@Test(priority = 10)
	public void duplicate_file() throws InterruptedException {
		wshome.duplicate_file();
	}
	@Test(priority = 11)
	public void view_comment() throws InterruptedException {
		wshome.view_comment();
	}
	@Test(priority = 12)
	public void file_properties() throws InterruptedException {
		wshome.properties();
	}
	
	@Test(priority = 13)
	public void delete_and_undo() throws InterruptedException {
		wshome.delete1();
	}
		
	@Test(priority = 14)
	public void movefile() throws InterruptedException {
		wshome.movefile();
	}
	
	
//	@Test(priority = 15)
//	public void permanent_delete() throws InterruptedException {
////		wshome.delete2();
//	}
//	@Test(priority = 16)
//	public void downloadfile() throws InterruptedException {
////		wshome.downloadmain();
//	}
//	
	
	@Test(priority = 20)
	public void changelogin() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.wizrapps.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Masterwizr mw1 = new Masterwizr(driver);
		mw1.loginmw2();
		Sharedlogin sl = new Sharedlogin(driver);
		sl.shared_with_me();
		
	}
	@Test(priority = 21)
	public void backtomainlogin() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.wizrapps.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Masterwizr mw = new Masterwizr(driver);
		mw.loginmw();
	}
	
	@Test(priority = 22)
	public void recentpage() throws InterruptedException {
		RecentPage rp = new RecentPage(driver);
		rp.scrollrecent();
	}
		
	@Test(priority =22)
	public void duplicatefile_allOptioncheck() throws InterruptedException {
		//		wshome.Openfile();
		//		wshome.renamefile();
		//		wshome.tag_file();
		//		wshome.enable_disableComment();
	}
 @Test(priority = 23)
 public void Listviewpage() throws InterruptedException {
	 Listview_Space Lvs = new Listview_Space(driver);
	 Lvs.FilenameSort();
	 Lvs.LastmodifiedSort();
	 Lvs.Sizesort();
	 Lvs.clearfilter();
	 Lvs.Typesort();
	 Lvs.Fileownersort();
	 Lvs.clearfilter();
	 Lvs.differntviewfileupload();
	 Lvs.openlistviewfile();
	 Lvs.listviewmultiplefilecheck_addtoStarred();
	 Lvs.listviewmultiplefilecheck_delete();
	 Lvs.listviewmultiplefilecheck_share();
	 Lvs.checkedfileTag();
 }


}
