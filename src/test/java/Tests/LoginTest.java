package Tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageClasses.LoginPage;

public class LoginTest extends LoginPage{
	LoginPage loginPage = new LoginPage();
	
	@BeforeTest
	public void launchBrowser() throws IOException {
	loginPage.launchURL();
	}
	
	@Test
	public void login() {
		loginPage.clickLoginButton();
	}

	@AfterMethod
	public void closeBrowser() {
		loginPage.closeBrowser();
	}
}
