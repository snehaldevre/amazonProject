package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test1.WebTestBase;

public class HomePage extends WebTestBase {

	@FindBy(id="email")WebElement usersearch;
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void userSearchClick() {
		usersearch.click();
	}
}
