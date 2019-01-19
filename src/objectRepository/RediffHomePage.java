package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

	WebDriver driver;
	public RediffHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By searchLink = By.cssSelector(".srchcopy u");
	By searchInput = By.cssSelector("#srchword");
	By searchButton = By.cssSelector(".srch_outer.relative .newsrchbtn");
	
	public WebElement SearchLink() {
		return driver.findElement(searchLink);
	}
	
	public WebElement SearchInput() {
		return driver.findElement(searchInput);
	}
	
	public WebElement SearchButton() {
		return driver.findElement(searchButton);
	}
	
}
