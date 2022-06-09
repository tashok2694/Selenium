package org.windowshandle;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver .get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//		driver.manage().window().maximize();
		
		WebElement can = driver.findElement(By.xpath("//button[text()='✕']"));
		can.click();
		WebElement findSearch = driver.findElement(By.name("q"));
		findSearch.sendKeys("iphone x");
		
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();
	
		Actions a = new Actions(driver);
		
		WebElement iphonex = driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone X (Silver, 64 GB)')]"));
		a.contextClick(iphonex).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> allid = driver.getWindowHandles();
		List<String> ll=new LinkedList<>();
		ll.addAll(allid);
	driver.switchTo().window(ll.get(1));
		
		WebElement cost = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		String text = cost.getText();
		System.out.println(text);
		
		
		
		
	}
}
