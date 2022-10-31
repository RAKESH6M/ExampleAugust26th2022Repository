package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo 
{
public static WebDriver oBrowser=null;
	public static void main(String[] args)
	{
		lunchbrowser();
		navigate();
		closeapplication();
	}
	private static void lunchbrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "E:\\ExampleAutomation\\Automation\\WEB AUTOMATION\\Library\\Drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			    oBrowser.get("https://www.youtube.com/watch?v=gH_RYRwVrVM");
			    Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeapplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
