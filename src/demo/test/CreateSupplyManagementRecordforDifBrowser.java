package demo.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.Log;
import utils.utills;

public class CreateSupplyManagementRecordforDifBrowser {
	@BeforeTest
	public void beforeTest(){
		String browser = System.getProperty("pom.browser");
		String url = System.getProperty("pom.url");
	//	utills.openBrowser("http://172.166.100.103:85/","ie");
		utills.openBrowser(url, browser);
	}
	//WebDriver driver = new FirefoxDriver();
	@Test
	public  void CreateRecord() throws Exception {
		Log.info("-----------------------------Start----------------------------------");
		
		utills.inputValue(false,"valid_username", "username_editbox_locator");
		Log.info("username is input");
		utills.elementClick("login_button_locator");

		Log.info("-----------------------------End------------------------------------");
	}
	
	
	}
