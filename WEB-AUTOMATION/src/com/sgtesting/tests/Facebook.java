package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook
{
	public static WebDriver oBrowser=null;

	public static void main(String[] args)
	{
		lunchbrowser();
		Nagavite();
		login();
		searchnotification();
		closeapplication();

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
	private static void Nagavite() 
	{
		try
		{

			oBrowser.get("https://www.facebook.com/");
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
			oBrowser.findElement(By.name("email")).sendKeys("rakeshm9628@gmail.com");
			oBrowser.findElement(By.name("pass")).sendKeys("rakirr");
			oBrowser.findElement(By.name("login")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void searchnotification()
	{
		try
		{
            oBrowser.findElement(By.xpath("//*[@id=\'mount_0_0_qH\']/div[1]/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/div/svg/g/image")).click();
            Thread.sleep(5000);
            oBrowser.findElement(By.xpath("//*[@id='mount_0_0_qH']/div[1]/")).click();
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
