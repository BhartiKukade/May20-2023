package TestORMPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.AdminPage;
import Pages.HomeWindow;
import Pages.LoginPage;
import base.Browser;

public class VerifyTheAdminPage extends Browser{
	//At starting only once
	private WebDriver driver;
	private LoginPage loginPage;
	private AdminPage adminPage;
	private HomeWindow homeWindow;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;

	
	
	@Parameters("browser")
	@BeforeTest
	public void launchTheBrowser(String browserName)
	{
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		if(browserName.equals("Chrome"))
		{
			driver = launchChrome();
		}
		if(browserName.equals("Edge"))
		{
			driver = launchEdge();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
	}
	@BeforeClass
	public void creatingPOMObject()
	{
		 loginPage = new LoginPage(driver);
	     adminPage = new AdminPage(driver);
		 homeWindow = new HomeWindow(driver);
	}
	@BeforeMethod
	public void openAdminPage() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		loginPage.enterUserName("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickOnLoginButton();
		
		HomeWindow homeWindow = new HomeWindow(driver);
		homeWindow.clickOnAdminButton();
		
	}
	
	@Test
	public void verifySearchOOnAdminPage_1101() throws InterruptedException
	{
		 
		
		
		Thread.sleep(3000);
		adminPage.enteruserNameForSearch("Admin");
		adminPage.selectRole();
		adminPage.enteremplyeeNameForSearch("Collings");
		adminPage.selectStatus();
		adminPage.clickOnSearchButton();
		String userName = adminPage.getUserNameFromResult();
		String role =	adminPage.getUserRoleFromResult();
		if(userName.equals("Admin") && role.equals("Admin"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	@Test
	public void verifyDeleteFunctionalityOnAdminPage()
	{
		AdminPage adminPage = new AdminPage(driver);
		adminPage.deleteTheRecord();
		String userName = adminPage.getUserNameFromResult();
		if(userName.equals("Admin"))
		{
			System.out.println("Fail");
			
		}
		else
		{
			System.out.println("Pass");
		}
	}
	
	@AfterMethod
	public void logoutFromApplication()
	{
		
		homeWindow.clickOnProfile();
		homeWindow.logout();
	}
	@AfterClass
	public void clearTheObject()
	{
		loginPage = null;
		adminPage = null;
		homeWindow = null;
	}
	@AfterTest 
	public void closeBrowser()
	{
		driver.quit();
		driver = null;
		System.gc();
	}

	
}
