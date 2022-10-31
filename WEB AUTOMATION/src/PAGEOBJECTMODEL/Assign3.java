package PAGEOBJECTMODEL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {
	public static WebDriver oBrowser=null;
	public static ACTITIMEPAGE3  opage=null;

	public static void main(String[] args)
	{
		launchBrowser();
		Nagavite();
		Login();
		minimizeFlyOutWindow();
		createuser();
		logout1();
		Loginuser1();
		Minimizevideo1();
		logoutuser1();
		Loginuser2();
		Minimizevideo2();
		 logoutuser2();
		 Loginuser3();
		 Minimizevideo3();
		 logoutuser3();
		 Loginuser11();
		 minimizeFlyOutWindow1();
		 Modifypassowarduser1();
		 logoutuser111();
		 Loginuser22();
		 Modifypassowarduser2();
		 logoutuser222();
		 
		
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\WEB AUTOMATION\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			opage=new ACTITIMEPAGE3 (oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Nagavite()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
			opage.getUserName().sendKeys("admin");
			opage.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			opage.getLogin().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			opage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try
		{
			opage.CreateUser().click();
			opage.AddUser().click();
			Thread.sleep(3000);
			opage.FirstName().sendKeys("Rakesh");
			opage.LastName().sendKeys("raki");
			opage.Emailid().sendKeys("rakeshm9628@gmail.com");
			opage.UserName().sendKeys("RAKESHM");
			opage.Password().sendKeys("raki123");
			opage.PasswordCopy().sendKeys("raki123");
			Thread.sleep(3000);
			opage.CreateUser1().click();
			Thread.sleep(2000);
			//user2
			opage.AddUser().click();
			Thread.sleep(3000);
			opage.FirstName().sendKeys("Dhanushree");
			opage.LastName().sendKeys("Dhanu");
			opage.Emailid().sendKeys("rakeshm9896@gmail.com");
			opage.UserName().sendKeys("Dhanu R");
			opage.Password().sendKeys("rakD12");
			opage.PasswordCopy().sendKeys("rakD12");
			Thread.sleep(3000);
			opage.CreateUser1().click();
			Thread.sleep(2000);
			//User3
			opage.AddUser().click();
			Thread.sleep(3000);
			opage.FirstName().sendKeys("Rakesh shrma");
			opage.LastName().sendKeys("RR");
			opage.Emailid().sendKeys("rakeshm9456@gmail.com");
			opage.UserName().sendKeys("Ramya");
			opage.Password().sendKeys("rakD89");
			opage.PasswordCopy().sendKeys("rakD89");
			Thread.sleep(3000);
			opage.CreateUser1().click();
			Thread.sleep(2000);
	//		opage.Clickapplication().click();
			//Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout1()
	{
		try
		{
			Thread.sleep(2000);
		opage.getLogoutLink().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Loginuser1()
	{
		try
		{
			opage.getUserName().sendKeys("RAKESHM");
			opage.getPassword().sendKeys("raki123");
			Thread.sleep(2000);
			opage.getLogin().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Minimizevideo1()
	{
		try
		{
			opage.Minimizevideo().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser1()
	{
		try
		{
			Thread.sleep(2000);
		opage.getLogoutLink().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Loginuser2()
	{
		try
		{
			opage.getUserName().sendKeys("Dhanu R");
			opage.getPassword().sendKeys("rakD12");
			Thread.sleep(2000);
			opage.getLogin().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Minimizevideo2()
	{
		try
		{
			opage.Minimizevideo().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser2()
	{
		try
		{
			Thread.sleep(2000);
		opage.getLogoutLink().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Loginuser3()
	{
		try
		{
			opage.getUserName().sendKeys("Ramya");
			opage.getPassword().sendKeys("rakD89");
			Thread.sleep(2000);
			opage.getLogin().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Minimizevideo3()
	{
		try
		{
			opage.Minimizevideo().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser3()
	{
		try
		{
			Thread.sleep(2000);
		opage.getLogoutLink().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Loginuser11()
	{
		try
		{
			opage.getUserName().sendKeys("RAKESHM");
			opage.getPassword().sendKeys("raki123");
			Thread.sleep(2000);
			opage.getLogin().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow1()
	{
		try
		{
			opage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Modifypassowarduser1()
	{
		try
		{
			opage.CreateUser().click();
			Thread.sleep(2000);
			opage.Clickapplication1().click();
			Thread.sleep(2000);
			opage.Password().clear();
			Thread.sleep(1000);
			opage.Password().sendKeys("Raki524");
			opage.PasswordCopy().sendKeys("Raki524");
			Thread.sleep(2000);
			opage.Savechanges().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser111()
	{
		try
		{
			Thread.sleep(2000);
		opage.getLogoutLink().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Loginuser22()
	{
		try
		{
			opage.getUserName().sendKeys("Dhanu R");
			opage.getPassword().sendKeys("rakD12");
			Thread.sleep(2000);
			opage.getLogin().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Modifypassowarduser2()
	{
		try
		{
			opage.CreateUser().click();
			Thread.sleep(2000);
			opage.Clickapplication2().click();
			Thread.sleep(2000);
			opage.Password().clear();
			Thread.sleep(1000);
			opage.Password().sendKeys("drdr12");
			opage.PasswordCopy().sendKeys("drdr12");
			Thread.sleep(2000);
			opage.Savechanges().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser222()
	{
		try
		{
			Thread.sleep(2000);
		opage.getLogoutLink().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
