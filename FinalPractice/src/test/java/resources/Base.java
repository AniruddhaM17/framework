package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver driver;

	public WebDriver DriverInitization() throws IOException {
		Properties pr = new Properties();
		FileInputStream fis = new FileInputStream("user.dir" + "\\src\\test\\java\\resources\\data.properties");
		pr.load(fis);

		String browserName = pr.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"user.dir" + "\\src\\test\\java\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "user.dir" + "\\src\\test\\java\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "user.dir" + "\\src\\test\\java\\resources\\ie.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;
	}

}
