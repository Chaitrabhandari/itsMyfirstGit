package resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class open {
	WebDriver driver ;
	public Properties prop;

	
	
	public WebDriver openbrowser() throws Exception
	{
		
		 prop = new Properties();
		 
		 //System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
		FileInputStream fil= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fil);
		String browserName = System.getProperty("browser");
	//	String browserName = prop.getProperty("browser");
		//String urlname=prop.getProperty("url");
		System.out.println(browserName);
	//	if(browserName.equals("chrome"))
		if(browserName.contains("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe ");
			 ChromeOptions option = new ChromeOptions();
			 if(browserName.contains("headless"))// these sentences sre used to run the test without lunching the browser
			 option.addArguments("headless");
			driver = new ChromeDriver(option);
			 
		}
		
		return driver; 
	    	
		
		
	}
    public String getScreenshotPath(String testCaseName,WebDriver driver) throws IOException
{
	TakesScreenshot ts =(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String  destinationfile=System.getProperty("user.dir")+"//reports//"+testCaseName+".png";
	FileHandler.copy(source,new File(destinationfile));

	return destinationfile;
	
}
}
