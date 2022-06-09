package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
// launch
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	url launch
	driver.get("https://www.trainingintambaram.net/selenium-training-in-chennai/");
	driver.get("https://www.facebook.com/");
//	get crrent url
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
//	get title
	String title = driver.getTitle();
	System.out.println(title);
//	quit
	 driver.quit();
	
}
}
