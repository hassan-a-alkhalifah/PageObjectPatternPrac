package objectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class RediffLoginPage {
	
	WebDriver driver;
	public RediffLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By userNameInput = By.id("login1");
	By passwordInput = By.id("password");
	By goButton = By.name("proceed");
	By homeLink = By.cssSelector(".rediff-com a");
	
	public WebElement UserNameInput() {
		return driver.findElement(userNameInput);
	}
	
	public WebElement PasswordInput() {
		return driver.findElement(passwordInput);
	}
	
	public WebElement GoButton() {
		return driver.findElement(goButton);
	}
	
	public WebElement HomeLink() {
		return driver.findElement(homeLink);
	}
	
}
