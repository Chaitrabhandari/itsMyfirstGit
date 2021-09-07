package projectname.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExxtentReportNG {
	static ExtentReports extent;
	public static ExtentReports report()

	{

		String path = System.getProperty("user.dir") + "\\reports\\index.html";//this is the path to the project

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	//This is the class used to set the different properties to the Test report
		reporter.config().setReportName("We Automation Result");
//to set the report name
		reporter.config().setDocumentTitle("Test Results");
//To set the tab name
		extent = new ExtentReports();
//ExtentReports is the class used to set the system info like tester name etc
		extent.attachReporter(reporter);

		extent.setSystemInfo("Tester", "chaitra");
		return extent;

	}

}
