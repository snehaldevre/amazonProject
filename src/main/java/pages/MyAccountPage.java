package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.test1.WebTestBase;

public class MyAccountPage extends WebTestBase {
	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"u_8_2_xW\"]/input[2]")
	WebElement searchTextBox;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"js_j\"]/form/button")
	WebElement searchbtn;
	

	public void search() {
		searchTextBox.click();
		searchTextBox.sendKeys("nanda");
		searchTextBox.sendKeys(Keys.ENTER);
		searchbtn.click();
	}
	
//	public void scrollUpMethod() {
//		Utility.scrollUpByElemet(driver,youtubeOption);
//		youtubeOption.click();
	//}
//		public void selectDropDown(String term, String value) {
//			 dropDown.click();
//			Utility.selectValue(dropDown,term,value);
		
		
	}




