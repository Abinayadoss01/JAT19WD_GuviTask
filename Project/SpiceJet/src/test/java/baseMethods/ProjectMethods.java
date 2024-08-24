package baseMethods;
import Utilities.UtilityClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ProjectMethods extends UtilityClass{

	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("C:\\Users\\abina\\eclipse-workspace\\SpiceJet\\reports\\result.html");		
		reporter.setAppendExisting(false);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	@BeforeClass
	public void testDetails() {
		test = extent.createTest(testName, testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);
	}
	
	@BeforeMethod
	public void start() throws Exception {
		launchBrowser(readProperty("browser"));
		getApplication(readProperty("url"));
	}
	
//	@AfterMethod
//	public void close() {
//		driver.quit();
//	}
//	
	
	@DataProvider
	public String[][] getData() throws Exception {
		
		String[][] data = readExcel(sheetName);
		return data;
	}
	
	@AfterSuite
	public void endReport() {
		extent.flush();
	}
	
	
	
	
}

