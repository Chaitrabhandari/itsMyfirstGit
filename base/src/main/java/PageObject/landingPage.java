package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {
 public WebDriver driver;
 public landingPage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }

 
 @FindBy(xpath="//a[@href='https://rahulshettyacademy.com/sign_in/']")
 WebElement login;
 
 @FindBy(xpath="//div[@class= 'text-center']//h2")
 WebElement text;


 

 public Loginpage loginhomepage()
 {
	 login.click();
	 Loginpage login = new Loginpage(driver);
	 return login;
	 
 }
 public WebElement text()
 {
	 return text;
 }
 
	
}
