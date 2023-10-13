package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeWindow {
	
	private WebDriver driver;
	@FindBy(xpath=("//a[@class='oxd-main-menu-item active']"))
	private WebElement adminButton;
	
	@FindBy(xpath=("//span[text()='PIM']"))
	private WebElement pimButton;
	
	@FindBy(xpath=("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"))
	private WebElement profile;
	
	@FindBy(xpath=("//a[text()='Logout']"))
	private WebElement logoutOption;
	
	
    
	public HomeWindow(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnAdminButton()
	{
		adminButton.click();
	}
	
	public void clickOnPimButton()
	{
		pimButton.click();
	}
	
	public void clickOnProfile()
	{
		profile.click();
	}
	public void logout()
	{
		Actions act = new Actions(driver);
		act.moveToElement(logoutOption).click().build().perform();
	}
	
}


