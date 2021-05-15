package finalProject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.IdentificationPage;
import pageObject.LandingPage;
import resources.Base;

public class LoginPage extends Base {

	@Test(dataProvider = "getData")
	public void ExistingUser(String username, String password) throws IOException {
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
		ip.Username().sendKeys(username);
		ip.Password().sendKeys(password);
		ip.Connexion().click();
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "aniruddha@mayekar.com";
		data[0][1] = "12345";

		data[1][0] = "tanvi@mayekar.com";
		data[1][1] = "12345678";
		return data;
	}

	/*@AfterTest
	public void CloseBrowser() {
		driver.close();
	}*/
}
