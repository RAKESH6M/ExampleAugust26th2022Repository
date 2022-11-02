package Actionclasss;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclassdemo2 {
 public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		lunchbrowser();
		 navigate();
		 mousemovement();
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
    private static void navigate()
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
    private static void mousemovement()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
    		Thread.sleep(2000);
    	  	WebElement element=oBrowser.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div[5]/a/div[2]/div/div"));
    		Actions oMouse=new Actions(oBrowser);
    		oMouse.moveToElement(element).perform();
    		Thread.sleep(2000);
    		WebElement element1 =oBrowser.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div[5]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[1]"));
    		Actions oMouse1=new Actions(oBrowser);
    		oMouse1.moveToElement(element1).perform();
    		Thread.sleep(1000);
    		WebElement element2 =oBrowser.findElement(By.linkText("All"));
    		Actions oMouse2=new Actions(oBrowser);
    		oMouse2.click(element2).build().perform();
    		Thread.sleep(2000);
    		WebElement element3 =oBrowser.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/span[1]"));
    		Actions oMouse3=new Actions(oBrowser);
    		oMouse3.moveToElement(element3).perform();
    		Thread.sleep(2000);
    		WebElement element4=oBrowser.findElement(By.linkText("Memory Cards"));
    		Actions oMouse4=new Actions(oBrowser);
    		oMouse4.click(element4).build().perform();
    		Thread.sleep(2000);
    		
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
}
