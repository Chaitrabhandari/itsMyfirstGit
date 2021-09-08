package projectname.base;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.Logs;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.landingPage;

import resources.open;
import org.apache.logging.log4j.*;
public class testcase3 extends open {
	private static Logger Log = LogManager.getLogger(testcase3.class.getName());

	
	public WebDriver driver;
	@BeforeTest
	public void open() throws Exception
	{
		driver = openbrowser();
		 driver.get(prop.getProperty("url"));
		 Log.info("the browser started");
		 System.out.println("Hii i added thses new lines");
		 System.out.println("These code works finally");
		 
		 System.out.println("These code belongs to develop");
		 System.out.println("These code run under develop");
		 
		 
			
	}
	
	@Test
	public void testcase() throws Exception
	{
		
	//	driver.get("http://www.qaclickacademy.com/");
		
		landingPage page= new landingPage(driver);	
	   
		//assert.assertEquals(page.text().getText(), "FEATURED COURSESq23");
		Assert.assertEquals(page.text().getText(), "FEATURED COURSES");
		Assert.assertTrue(driver.findElement(By.cssSelector(".nav.navbar-nav.navbar-right")).isDisplayed());
		Log.info("navigation bar is displayed");
	}
	@AfterTest
	public void close()	
	{
	     driver.close();
	     Log.info("browser is closed" );
	
	}

}
