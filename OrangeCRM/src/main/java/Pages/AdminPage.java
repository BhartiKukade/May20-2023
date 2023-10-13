package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	@FindBy(xpath = ("(//input[@class='oxd-input oxd-input--active'])[2]"))
	private WebElement userName;
	
	@FindBy(xpath = ("(//form[@class='oxd-form']//input)[1]"))
	private WebElement emplyeeName;
	
	@FindBy(xpath = ("(//div[@class='oxd-select-text-input'])[1]"))
	private WebElement role;
	
	//(//div[@class='oxd-select-text-input'])[1]
	
	//@FindBy(xpath = ("(//div[@class='oxd-select-text-input'])[1]"))
	//private WebElement ;
	
	@FindBy(xpath = ("(//div[@class='oxd-select-text-input'])[2]"))
	private WebElement status;
	
	@FindBy(xpath = ("(//div[@class='oxd-table']//div[@role='row'])[2]//div[2]/div"))
	private WebElement resultUserName;
	
	@FindBy(xpath = ("(//div[@class='oxd-table']//div[@role='row'])[2]//div[5]/div"))
	private WebElement resultUserRole;
	
	@FindBy(xpath = ("(//div[@class='oxd-table']//div[@role='row'])[2]//button[1]"))
	private WebElement deleteButton;
	
	@FindBy(xpath = ("(//div[@class='oxd-table']//div[@role='row'])[2]//button[2]"))
	private WebElement editButton;
	
	
	@FindBy(xpath = ("//button[@type='submit']"))
	private WebElement serachButton;
	
	
	
	
	
	public AdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		

	}
	
	public void clickOnSearchButton()
	{
		serachButton.click();
	}
	public void enteruserNameForSearch(String Admin)
	{
		userName.sendKeys(Admin);
	}
	
	public void enteremplyeeNameForSearch(String name)
	{
		emplyeeName.sendKeys(name);
	}
	
	public void selectRole()
	{
		role.sendKeys("Admin");
	}
	public void selectStatus()
	{
		status.sendKeys("Enable");
	}
	public String getUserNameFromResult()
	{
		return resultUserName.getText();
	}
	
	public String getUserRoleFromResult()
	{
		return resultUserRole.getText();
	}
	
	public void deleteTheRecord()
	{
		deleteButton.click();
	}
	
	public void editTheRecord()
	{
		editButton.click();
	}
	
	

}
