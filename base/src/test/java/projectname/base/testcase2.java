package projectname.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Loginpage;
import resources.open;

public class testcase2 extends open{
	public WebDriver driver;
	
	@BeforeTest
	public void open() throws Exception {
		driver = openbrowser();
		driver.get("https://rahulshettyacademy.com/sign_in/");
	}
	
	@Test(dataProvider = "getdata")
	public void testcase3(String username, String password) throws Exception
	
	{
		
		Loginpage page = new Loginpage(driver);
		page.emailid().sendKeys(username);
		page.password().sendKeys(password);
		page.login().click();		
	}
		@DataProvider()
		public Object[][] getdata()
		{			
	    Object[][] obj = new Object[3][2];//col size is values to pass and row size is how many times need to pass
	    obj[0][0]="chaitra";
	    obj[0][1]="12345";
	    
	    obj[1][0]="chaitra";
	    obj[1][1]="12345";
	    
	    obj[2][0]="chaitra";
	    obj[2][1]="12345";
	    
	    	    
	    return obj;
		}
		@AfterTest
		public void close()	
		{
		     driver.close();
		
		}
		
	}
	
	
	


