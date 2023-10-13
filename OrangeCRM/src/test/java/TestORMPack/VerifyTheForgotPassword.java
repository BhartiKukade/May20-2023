package TestORMPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.AdminPage;
import Pages.HomeWindow;
import Pages.LoginPage;

public class VerifyTheForgotPassword {
	
	private WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void launchTheBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Desktop\\Bharti Testing\\Manual Testing\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	     driver = new ChromeDriver();  
		//this.driver = driver;
		}
		if(browserName.equals("Edge"))
		{
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\Nikhil\\Desktop\\Bharti Testing\\Automation Testing\\edgedriver_arm64\\msedgedriver.exe");
	     driver = new EdgeDriver();  
		//this.driver = driver;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
	}
	
	@BeforeMethod
	public void openAdminPage()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickOnLoginButton();
		
		HomeWindow homeWindow = new HomeWindow(driver);
		homeWindow.clickOnAdminButton();
		
	}
	
	@Test
	public void verifySearchOOnAdminPage_1101() throws InterruptedException
	{
		 
		
		AdminPage adminPage = new AdminPage(driver);
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
		HomeWindow homeWindow = new HomeWindow(driver);
		homeWindow.clickOnProfile();
		homeWindow.logout();
	}
	
	@AfterTest 
	public void closeBrowser()
	{
		driver.quit();
	}


}
