package testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.baseline;
import utilities.elementLocators;
import utilities.logCollection;
import utilities.testData;

public class T2_loginpgaeValidation {
	
	public static WebDriver driver;


@BeforeMethod

public static void openBrowser()

{
	driver = baseline.browserconfig();
	
	logCollection.debug("Firefox browser opened successfully");
}


@Test

public static void loginpageValidation()

{
	driver.get(testData.loginURL);
	
	//driver.findElement(elementLocators.userLogon).click();
	driver.findElement(elementLocators.email).sendKeys(testData.uid);
	driver.findElement(elementLocators.password).sendKeys(testData.pw);
	driver.findElement(elementLocators.loginBtn).click();
	logCollection.debug("Login process is completed Successfully");
	driver.findElement(elementLocators.userBalance).click();
	driver.findElement(elementLocators.userBalanceHist).click();
	driver.findElement(elementLocators.courseDoc).click();
	driver.findElement(elementLocators.userlogoutDrop).click();
    driver.findElement(elementLocators.userlogout).click();
	logCollection.debug("Logout process is completed Successfully");
	
	
}


@AfterMethod

public static void closeBrowser()

{
	driver.close();
}

	

}
