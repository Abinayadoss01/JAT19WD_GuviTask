package Utilities;

//import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass{

	public static WebDriver driver;
	public String sheetName;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName;
	public String testDescription;
	public String testCategory;
	public String testAuthor;
	
	public static String readProperty(String key) throws Exception {
		//String projectPath = System.getProperty("user.dir");
		File file = new File("C:\\Users\\abina\\eclipse-workspace\\SpiceJet\\src\\test\\resources\\Data\\LoginCredentials.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		return prop.get(key).toString();
	}

	public static void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--headless");
			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options=new FirefoxOptions();
			options.addArguments("--headless");
			driver = new FirefoxDriver(options);
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("Opening Chrome browser as Default browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		waitImplicit();
	}

	public static void waitExplicit(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitExplicitUntillTitle(String titleToWait) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.titleIs(titleToWait));
	}

	public static void waitImplicit() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}

	public static void getApplication(String url) {
		driver.get(url);
	}

	public static void type(WebElement element, String text) {
		waitExplicit(element);
		element.clear();
		element.sendKeys(text);
	}

	public static void clickOn(WebElement element) {
		waitExplicit(element);
		element.click();
	}
	public static void ActionclickOn(WebElement element) {
		waitExplicit(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		
	}
	public static void jsClickOn(WebElement element) {
		waitExplicit(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}

	public static void ActionSendKeys(WebElement element,String value) {
		waitExplicit(element);
		Actions actions = new Actions(driver);
		//actions.moveToElement(element).click().build().perform();
		actions.moveToElement(element).sendKeys(value).build().perform();
	}
	public static void jsSendKeys(WebElement element,String value) {
		waitExplicit(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].sendKeys(value);", element);
	}

	public static String getPageTitle() {
		waitExplicitUntillTitle(driver.getTitle());
		return driver.getTitle();
	}

	public static String extractText(WebElement element) {
		return element.getText();
	}

public static String[][] readExcel(String sheetname) throws Exception {
		
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\abina\\eclipse-workspace\\SpiceJet\\src\\test\\resources\\Data\\SpiceJetDataFile.xlsx");
		XSSFSheet sheet = book.getSheet(sheetname);
		int rowcount = sheet.getLastRowNum();
		short columncount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowcount][columncount];
		for(int i = 1 ; i <= rowcount; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j = 0; j < columncount; j++) {
				
				XSSFCell cell = row.getCell(j);
				data[i-1][j]=cell.getStringCellValue();
			}
		}
		
		book.close();
		return data;
	}
	

	public static int screenShot(String testName) throws Exception {
		int ranNum = (int) (Math.random() * 9999999 + 1000000);
		Thread.sleep(3000);
		String projectPath = System.getProperty("user.dir");
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
				new File(projectPath + "/Screenshot/" +testName+ ranNum + ".png"));
		return ranNum;
	}
	public static void ScrollUntillElement(WebElement element) {
		waitExplicit(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public static void softAssert(String actResult, String expResult) {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actResult, expResult);
	}
	public static void selectFromDropDown(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
	
	public static void selectcheckbox(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	public void reportStep(String stepDetails, String stepStatus, String testName) throws Exception {
		int ranNum = screenShot(testName);
		String projectPath = System.getProperty("user.dir");
		if (stepStatus.equalsIgnoreCase("pass")) {
			test.pass(stepDetails,
					MediaEntityBuilder.createScreenCaptureFromPath(projectPath + "/Screenshot/" +testName+ ranNum + ".png").build());
		} else if (stepStatus.equalsIgnoreCase("fail")) {
			test.fail(stepDetails,
					MediaEntityBuilder.createScreenCaptureFromPath(projectPath + "/Screenshot/" +testName +ranNum + ".png").build());
			throw new RuntimeException("See extent report for more details");
		}
	}
}