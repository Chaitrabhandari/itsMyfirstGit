package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	public WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	

	    By email=    By.id("user_email");
	    By password=By.id("user_password");
	    By login = By.xpath("//input[@type='submit']");
	    
	    public WebElement emailid()
	    {
	    	return driver.findElement(email);
	    }
	    public WebElement password()
	    {
	    	return driver.findElement(password);
	    }
	    public WebElement login()
	    {
	    	return driver.findElement(login);
	    }
}
