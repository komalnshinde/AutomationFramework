package PageClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.commonFunctions;
import base.baseClass;

public class LoginPage extends baseClass{

	commonFunctions commonFunctions = new commonFunctions();
	
	By btnLogin = By.xpath("//p[text()='LOGIN / SIGNUP'][2]");
	
	By btnContinue = By.xpath("//input[@value='Continue']");
	By inpMobileNumber = By.xpath("//input[@name='phone']");
	
	By link = By.xpath("//a[text()='Flights']");
	
	
	public void clickLoginButton() {
		commonFunctions.clickByXpath(btnLogin);
	}
	
	public void launchURL() throws IOException {
    super.initializeWebdriver();   
    super.enterURI();
	}
	
			

}
