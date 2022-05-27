package Base2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {
	public static WebDriver driver;

	// 1 to find webElement
	public static WebElement toFilltxtboxbywait(String locName, String loc, String value) {

		WebDriverWait ar = new WebDriverWait(driver, Duration.ofSeconds(20));

		if (locName.equals("id")) {
			ar.until(ExpectedConditions.visibilityOfElementLocated(By.id(loc))).sendKeys(value);
		}

		else if (locName.equals("name")) {

			ar.until(ExpectedConditions.visibilityOfElementLocated(By.name(loc))).sendKeys(value);
		}

		else if (locName.equals("xpath")) {

			ar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc))).sendKeys(value);

		}

		else {
			System.out.println("Invalid Locator");
		}
		return null;
	}

	// clear the textbox

	public static void clearTextBox(String locName, String loc) {

		WebDriverWait ar = new WebDriverWait(driver, Duration.ofSeconds(100));

		ar.until(ExpectedConditions.visibilityOfElementLocated(By.id(loc))).clear();

	}

	// 2 to find webElement wait
	public static WebElement toFilltxtboxbywaittime(int duration, String locName, String loc, String value) {

		WebDriverWait ar = new WebDriverWait(driver, Duration.ofSeconds(duration));

		if (locName.equals("id")) {
			ar.until(ExpectedConditions.visibilityOfElementLocated(By.id(loc))).sendKeys(value);
		}

		else if (locName.equals("name")) {

			ar.until(ExpectedConditions.visibilityOfElementLocated(By.name(loc))).sendKeys(value);
		}

		else if (locName.equals("xpath")) {

			ar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc))).sendKeys(value);

		}

		else {
			System.out.println("Invalid Locator");
		}
		return null;
	}

	// 3 to click using explicity wait
	public static WebElement toclickwait(String locName, String loc) {

		WebDriverWait ar = new WebDriverWait(driver, Duration.ofSeconds(100));

		if (locName.equals("id")) {
			ar.until(ExpectedConditions.visibilityOfElementLocated(By.id(loc))).click();
		}

		else if (locName.equals("name")) {

			ar.until(ExpectedConditions.visibilityOfElementLocated(By.name(loc))).click();
		}

		else if (locName.equals("xpath")) {

			ar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc))).click();

		}

		else {
			System.out.println("Invalid Locator");
		}
		return null;
	}

	// 4 to click using explicity wait
	public static WebElement toclickwaitint(String locName, String loc, int val) {

		WebDriverWait ar = new WebDriverWait(driver, Duration.ofSeconds(val));

		if (locName.equals("id")) {
			ar.until(ExpectedConditions.visibilityOfElementLocated(By.id(loc))).click();
		}

		else if (locName.equals("name")) {

			ar.until(ExpectedConditions.visibilityOfElementLocated(By.name(loc))).click();
		}

		else if (locName.equals("xpath")) {

			ar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc))).click();

		}

		else {
			System.out.println("Invalid Locator");
		}
		return null;
	}

	// 5 TO Open Chrome
	public static void openChrome() {

		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		driver = new ChromeDriver(option);
	}

	public static void openFirefox() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	// 6 TO Maximize Window
	public static void maximizewindow() {

		driver.manage().window().maximize();
	}

	// to Launch url
	public static void launchUr(String ref) {

		driver.get(ref);
	}

	// 7 TO click
	public static void click(WebElement a) {
		a.click();
	}

	// 8 sendkeys
	public static void toFilltex(WebElement user, String name) {

		user.sendKeys(name);

	}

	// 9 TO get Titile
	public static void togettext() {

		String title = driver.getTitle();
		System.out.println(title);

	}

	// 10 Implicity wait
	public static void waiting(int ref) {
		driver.manage().timeouts().implicitlyWait(ref, TimeUnit.SECONDS);

	}

	// 11 TO hold
	public static void toHold() throws InterruptedException {

		Thread.sleep(10000);
	}

	// 12 To read a From Excel sheet

	public static String readfromexcel(String sheetname, int row, int cell) throws Throwable {

		File f = new File("C:\\Users\\syed.a\\HighEngage\\data\\sample login data.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet(sheetname);
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row r = sh.getRow(row);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(cell);

				// Row r = sh.getRow(row);
				// Cell c = r.getCell(cell);

				int cellType = c.getCellType();

				String value = null;
				if (cellType == 1) {

					value = c.getStringCellValue();
				} else if (DateUtil.isCellDateFormatted(c)) {
					Date date = c.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
					value = s.format(date);
				} else {
					double dob = c.getNumericCellValue();
					long l = (long) dob;
					value = String.valueOf(l);
				}

				return value;
			}
		}
		return sheetname;

	}

	// 13 to take a screen shot
	public static void takeSnap(String picName) throws Exception {

		TakesScreenshot tk = (TakesScreenshot) driver;

		File st = tk.getScreenshotAs(OutputType.FILE);

		File de = new File(System.getProperty("user.dir") + "\\target\\ScreenShots\\" + picName + ".png");

		FileUtils.copyFile(st, de);

	}

	public static void toScrolldown(int value) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0," + value + ")");

	}

	// 14 Switch to Alert

	public static void alertswitch(String handle) {

		WebDriverWait al = new WebDriverWait(driver, Duration.ofSeconds(100));

		if (handle.equalsIgnoreCase("accept")) {

			al.until(ExpectedConditions.alertIsPresent()).accept();

		}

		else {

			al.until(ExpectedConditions.alertIsPresent()).dismiss();

		}
	}
	// 15 TO select by visible text

	public static void selectvisibiletext(WebElement loc, String value) {

		Select select = new Select(loc);

		select.selectByVisibleText(value);
	}

	public static void selectvisibyindex(WebElement loc, int value) {

		Select select = new Select(loc);

		select.selectByIndex(value);
	}

	public static void selectvisibilevalue(WebElement loc, String value) {

		Select select = new Select(loc);

		select.selectByValue(value);
	}

	public static void gettext(WebElement ref, String value) {

		String gettext = ref.getText();
		System.out.println(gettext);

	}

	public static WebElement getvalue(WebElement ref) {

		String attribute = ref.getAttribute("value");
		return ref;

	}

	// Robot class Enter
	public void enter(String value) throws Exception {
		Robot ro = new Robot();

		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);

	}
	
	
	//To select the dropdown without select options
	
	public void selectdropdown(String dropdown,String selectionvalaue  ) {
		
		driver.findElement(By.xpath(dropdown)).click();
		driver.findElement(By.xpath(selectionvalaue)).sendKeys("China");
		
	}
	
	// Actions
	public void mouseclick(WebElement drivers) {
			
	Actions move = new  Actions(driver);
	
	move.moveToElement(drivers).click().perform();
	
	
	}	
	
	
	
	// to pass the send keys
		public void sendkey(WebElement sendkeys , String value) {	
			WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(100));
			wt.until(ExpectedConditions.visibilityOf(sendkeys)).sendKeys(value);;
			
	}
	
		// to pass the button keys
				
		public void clickbutton(WebElement button) {
			WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(100));
			wt.until(ExpectedConditions.visibilityOf(button)).click();

		}

}
	
	
	
	
	/*@BeforeClass
	public void startup() {
		openChrome();
		driver.get(
				"https://demohighengage.auth.us-east-1.amazoncognito.com/login?client_id=558k44p713kem7rnik0l0ds6hm&response_type=token&scope=aws.cognito.signin.user.admin+email+openid+phone+profile&redirect_uri=https://highengage.com/register/welcome.html");
		driver.manage().window().maximize();
	}*/


