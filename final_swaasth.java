package my_final;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class final_swaasth  {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
//=================================set path====================================================================		
		System.setProperty("webdriver.chrome.driver", "/home/aj/Music/chromedriver");
//====================================object create===========================================================		
		 WebDriver driver=new ChromeDriver();
//=============================repositry file connected=========================================================		
	    FileInputStream f=new FileInputStream("/home/aj/eclipse-workspace/my_swaasth/pk.properties");
        Properties p=new Properties();
        p.load(f);
//=============================click on url===================================================================        
        driver.get(p.getProperty("url"));
//===============================new tab open with robot class================================================
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
        Set<String> set=driver.getWindowHandles();
        Iterator<String> it=set.iterator();
        String parentwindowid=it.next();
        String childwindowid=it.next();
//================================move to child window===================================================================
      	driver.switchTo().window(childwindowid);
   //====================================open the gmail===========================================================   	
      	driver.get(p.getProperty("gmail"));
		Thread.sleep(5000);
//===============================  LOGIN in gmail=============================================================================================================	
	    driver.findElement(By.xpath(p.getProperty("path1"))).sendKeys(p.getProperty("username"));
	    driver.findElement(By.xpath(p.getProperty("click1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(p.getProperty("password"))).sendKeys(p.getProperty("namepassword"));
		driver.findElement(By.xpath(p.getProperty("click2"))).click();
		Thread.sleep(5000);
		driver.switchTo().window(parentwindowid);
//=====================================click on mail===========================================================		
//      driver.findElement(By.xpath("(//*[@aria-label='Mail'])")).click();
//==================================signmeup===================================================================		
		driver.findElement(By.xpath(p.getProperty("signup"))).click();
		driver.findElement(By.xpath(p.getProperty("SIGNMEUP"))).click();
		driver.findElement(By.xpath(p.getProperty("google"))).click();
		Thread.sleep(5000);
//================================== password==================================================================
	    driver.findElement(By.xpath(p.getProperty("passwordpath"))).sendKeys(p.getProperty("password1"));
//====================================Mobile no===============================================================
		driver.findElement(By.xpath(p.getProperty("mobilepath"))).sendKeys(p.getProperty("mobileno"));
//====================================open the dropdown====================================================
		driver.findElement(By.xpath(p.getProperty("opendropdown"))).click();
		Thread.sleep(5000);
//==================================select the blood group in dropdown=========================================================================		
		driver.findElement(By.xpath(p.getProperty("selectdropdown"))).click();
//===================================select the checkbooks "agree"=============================================		
		driver.findElement(By.xpath(p.getProperty("agree"))).click();
//==================================sign me up==============================================================
		driver.findElement(By.xpath("signmeup")).click();
		Thread.sleep(5000);
		
		

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}
}
