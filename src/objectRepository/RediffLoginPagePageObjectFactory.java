package objectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class RediffLoginPagePageObjectFactory {
	
	WebDriver driver;
	public RediffLoginPagePageObjectFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login1")
	WebElement userNameInput;
	
	@FindBy(id="password")
	WebElement passwordInput;
	
	@FindBy(name="proceed")
	WebElement goButton;
	
	@FindBy(css=".rediff-com a")
	WebElement homeLink;
	
	public WebElement UserNameInput() {
		return userNameInput;
	}
	
	public WebElement PasswordInput() {
		return passwordInput;
	}
	
	public WebElement GoButton() {
		return goButton;
	}
	
	public WebElement HomeLink() {
		return homeLink;
	}
	
}
