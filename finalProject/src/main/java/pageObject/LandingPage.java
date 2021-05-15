package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By logo = By.className("logo-bg");
	By searchBar = By.id("SimpleSearchForm_SearchTerm");
	By searchButton = By.id("button-addon2");
	By magasin = By.id("storeUserInter");
	By connexion = By.cssSelector("[href*='Logon']");
	By panier = By.cssSelector("[href*='order']");
	By popup = By.xpath("//div[@class='ot-sdk-container']");
	By closeButton = By.xpath("//div[@class='banner-close-btn-container']/button");

	public WebElement Logo() {
		return driver.findElement(logo);
	}

	public WebElement SearchBar() {
		return driver.findElement(searchBar);
	}

	public WebElement SearchButton() {
		return driver.findElement(searchButton);
	}

	public WebElement Magasin() {
		return driver.findElement(magasin);
	}

	public WebElement Connexion() {
		return driver.findElement(connexion);
	}

	public WebElement Panier() {
		return driver.findElement(panier);
	}
	public WebElement Popup() {
		return driver.findElement(popup);
	}

	public WebElement Close() {
		return driver.findElement(closeButton);
	}

}
