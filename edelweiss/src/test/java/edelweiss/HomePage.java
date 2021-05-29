package edelweiss;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_object.HomePage_po;
import resources.Base;

public class HomePage extends Base {

	@BeforeTest
	public void Initilization() throws IOException {
		driver = DriverInitilization();
	}

	public static Logger log = LogManager.getLogger(HomePage.class.getName());

	@Test
	public void LoginTC() throws IOException {

		driver.get(prop.getProperty("url"));
		log.info("Opening browser");
		driver.manage().window().maximize();
		log.trace("Maximize browser");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		HomePage_po hp = new HomePage_po(driver);
		hp.SignIn().click();
		log.info("Click on Sign In");
		hp.UserName().sendKeys("testing20201012@yahoo.com");
		log.trace("Enter username");
		hp.Next().click();
		hp.PassWord().sendKeys("testing@123");
		log.trace("Enter password");
		hp.Next().click();
		hp.Mail().click();

	}

	@AfterTest
	public void TearDown() {
		driver.close();
	}

}
