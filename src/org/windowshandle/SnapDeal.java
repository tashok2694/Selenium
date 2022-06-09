package org.windowshandle;

import java.awt.AWTException;
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

public class SnapDeal {
public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver .get("https://www.snapdeal.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("keyword"));
		search.sendKeys("iphone 7");
		
		WebElement btn = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		btn.click();
		
	
		WebElement case1 = driver.findElement(By.xpath("(//p[@class='product-title'])[11]"));
		case1.click();
		
	
		Set<String> allid = driver.getWindowHandles();
		List<String> ll=new LinkedList<>();
		ll.addAll(allid);
	driver.switchTo().window(ll.get(1));

		
		WebElement snap = driver.findElement(By.xpath("(//span[@class='intialtext'])[2]"));
		snap.click();
		
		WebElement price = driver.findElement(By.xpath("//div[@class='you-pay']"));
		System.out.println(price.getText());
}
}
