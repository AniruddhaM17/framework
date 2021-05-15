package finalProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObject.IdentificationPage;
import pageObject.LandingPage;
import resources.Base;

public class Registration extends Base {

	@Test
	public void NewUser() throws IOException {
		driver = DriverInitization();
		driver.get("https://www.lapeyre.fr");
		driver.manage().window().maximize();
		LandingPage lp = new LandingPage(driver);
		if (lp.Popup().isDisplayed()) {
			lp.Close().click();
		}
		lp.Connexion().click();
		IdentificationPage ip = new IdentificationPage(driver);
		Assert.assertEquals(ip.LoginText().getText(), "J'ai déjà un compte");
		Assert.assertEquals(ip.Newlogintext().getText(), "Nouveau client");
		ip.NewUser().click();
	}

	@AfterTest
	public void CloseBrowser() {
		driver.close();
	}
}
