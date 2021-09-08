package projectname.base;



import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Loginpage;
import PageObject.landingPage;
import resources.open;


//import org.testng.annotations.DataProvider;

public class testcases extends open {
	private static Logger Log = LogManager.getLogger(testcases.class.getName());
public WebDriver driver;
@BeforeTest
	public void open() throws Exception
	{
	driver = openbrowser();
	driver.get("http://www.qaclickacademy.com/");
	
	}
	


	@Test()
	
	public void test() throws Exception
	{   
	 
		landingPage page= new landingPage(driver);		
		Loginpage login=page.loginhomepage();
		
		login.emailid().sendKeys("username");
		login.password().sendKeys("password");
		login.login().click();
		Log.info(" the username and password is entered");
		}
	@AfterTest
	public void close()	
	{
	     driver.close();
	
	}
	}