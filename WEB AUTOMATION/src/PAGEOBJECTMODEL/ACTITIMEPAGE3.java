package PAGEOBJECTMODEL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ACTITIMEPAGE3
{
	public ACTITIMEPAGE3(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;

	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;

	}
	private WebElement gettingStartedShortcutsPanelId;  
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement createuser1;
	public WebElement CreateUser()
	{
		return createuser1;

	}
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private WebElement adduser;
	public WebElement AddUser()
	{
		return adduser;

	}
	private WebElement firstName;
	public WebElement FirstName()
	{
		return firstName;
	}
	private WebElement lastName;
	public WebElement LastName()
	{
		return lastName;
	}
	private WebElement email;
	public WebElement Emailid()
	{
		return  email ;
		
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement UserName()
	{
		return userDataLightBox_usernameField;
		
	}
	private WebElement password;
	public WebElement Password()
	{
		return password;
	}
	private WebElement passwordCopy;
	public WebElement PasswordCopy()
	{
		return passwordCopy;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div")
	private WebElement createuser;
	public WebElement CreateUser1()
	{
		return createuser; 
	}
	private WebElement logoutLink;
	public WebElement getLogoutLink()
	{
		return logoutLink;
	}
	@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
	private WebElement minimize;
	public WebElement Minimizevideo()
	{
		return minimize;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement clickapplication1;
	public WebElement Clickapplication1()
	{
		return clickapplication1;
		
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement Save;
	public WebElement Savechanges()
	{
		return Save;
		
	}
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")
	private WebElement clickapplication22;
	public WebElement Clickapplication2()
	{
		return clickapplication22;
		
	}
	@FindBy(xpath="")
	private WebElement clickapplication33;
	public WebElement Clickapplication3()
	{
		return clickapplication33;
		
	}
	

}
