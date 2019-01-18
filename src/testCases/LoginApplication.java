package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffLoginPage;

public class LoginApplication {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rlp = new RediffLoginPage(driver);
		rlp.UserNameInput().sendKeys("username");
		rlp.PasswordInput().sendKeys("password");
		rlp.GoButton().click();
	}
	
}
