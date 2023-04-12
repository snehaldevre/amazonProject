package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test1.WebTestBase;

public class LoginPage extends WebTestBase {

	@FindBy(name="email")WebElement mobileTextBox;
	
	@FindBy(id="pass")WebElement passwordTextBox;
	
	@FindBy(name="login")WebElement loginbtn;

	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void login(String email, String password) {
		mobileTextBox.sendKeys(email);
		passwordTextBox.sendKeys(password);
		loginbtn.click();
	}

}
