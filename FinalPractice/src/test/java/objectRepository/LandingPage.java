package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	public LandingPage() {
		this.driver = driver;
	}

	By connexion = By.xpath("//a[contains(@href,'LogonForm')]");
	By magasin = By.id("storeUserInter");

	public WebElement Connexion() {
		return driver.findElement(connexion);
	}

	public WebElement Magasin() {
		return driver.findElement(magasin);
	}
}
