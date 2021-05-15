package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import objectRepository.LandingPage;
import resources.Base;

public class HomePage extends Base {

	@Test
	public void VerifyHomePage() throws IOException {

		driver = DriverInitization();
		driver.get("prop.getProperty('browser')");
		driver.manage().window().maximize();
		

		LandingPage lp = new LandingPage();
		Assert.assertTrue(lp.Connexion().isDisplayed());
		Assert.assertTrue(lp.Magasin().isDisplayed());
	}

}
