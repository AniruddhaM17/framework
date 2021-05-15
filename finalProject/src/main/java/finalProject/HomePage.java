package finalProject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;

import resources.Base;

public class HomePage extends Base {

	@Test
	public void OprnBrowser() throws IOException {
		driver = DriverInitization();
		driver.get("https://www.lapeyre.fr");
		driver.manage().window().maximize();
		LandingPage lp = new LandingPage(driver);
		if (lp.Popup().isDisplayed()) {
			lp.Close().click();
		}
		lp.Logo().isDisplayed();
		lp.SearchBar().isDisplayed();
		lp.SearchButton().click();
		lp.Magasin().isDisplayed();
		lp.Panier().isDisplayed();
		lp.Connexion().click();
	}

	@AfterTest
	public void CloseBrowser() {
		driver.close();
	}
}
