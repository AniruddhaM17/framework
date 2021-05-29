package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver DriverInitilization() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\A2240628\\SeleniumTest\\edelweiss\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);

		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\A2240628\\SeleniumTest\\edelweiss\\src\\main\\java\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (BrowserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					("user.dir") + "\\src\\test\\java\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (BrowserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver",
					("user.dir") + "\\src\\test\\java\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;
	}

	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot tis = (TakesScreenshot) driver;
		File source = tis.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}
} 
