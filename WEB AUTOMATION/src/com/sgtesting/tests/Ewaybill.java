package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ewaybill {
public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		lunchbrowser();
		Navigate();
		login();
		

	}
	private static void lunchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\WEB AUTOMATION\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Navigate()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(5000);
	    }catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9880570675");
			oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[5]/button")).click();
			Thread.sleep(5000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
