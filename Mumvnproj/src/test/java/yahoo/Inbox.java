package yahoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;

@Listeners({ATUReportsListener.class,ConfigurationListener.class,MethodListener.class})
public class Inbox 
{
 WebDriver driver;
 
 {
	 System.setProperty("atu.reporter.config", "e:/10am_aug_2316/atu.properties");
 }
  
 public Inbox(WebDriver driver)
 {
	 this.driver=driver;
 }
 public void deletemail() throws Exception
 {
	 driver.findElement(By.xpath("(//input[@name='mid'])[position()=5]")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.id("top_delete")).click();
 }
}