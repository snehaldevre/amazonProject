package testclass;

import org.openqa.selenium.JavascriptExecutor;
import org.test1.WebTestBase;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class TC01 extends WebTestBase{
	MyAccountPage myAccountPage;
	HomePage homePage;
	LoginPage loginPage;
	  
    
	@BeforeMethod
	public void BeforeMethod()
	{
		//Loading the driver file and eatablishing the connection ,loading the url
	initialization();
	myAccountPage=new MyAccountPage();
	 homePage = new HomePage();
     loginPage = new LoginPage();     
 }

 @Test
 public void verifyLoginWithValidCredential(){
     SoftAssert softAssert = new SoftAssert();
     homePage.userSearchClick();
     loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
     
     softAssert.assertAll();
 }
 
 @Test
 public void verifySearchBar() {
	 SoftAssert softAssert = new SoftAssert();
	 myAccountPage.search();
	 softAssert.assertAll();
 }
 
// @Test
// public void selectDropDown(String term, String value) {
//	 dropDown.
//	 
//	 .click();
//	 Utility.selectValue(dropDown,term,value);
// }

 @Test
 public void scrollUp() {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy,(0,4000)");
	
 }

 @Test
 public void scrollDown() {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy,(0,5000)");
}
}


//@Test
// public void verifyScrollDown(){    
//	SoftAssert softAssert = new SoftAssert();    
//	myAccountPage.scrollDownMethod();
//    softAssert.assertAll();
// }
