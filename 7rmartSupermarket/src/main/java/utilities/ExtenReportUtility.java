package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtenReportUtility {	
	public static final ExtentReports extentReports = new ExtentReports(); 
	public synchronized static ExtentReports createExtentReports()
	{    
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
		reporter.config().setReportName("groceryapplication");  	
        extentReports.attachReporter(reporter);  
		extentReports.setSystemInfo("Organization", "Obsqura");  
		extentReports.setSystemInfo("Name", "Lekshmi ");
		return extentReports;
	}

}