package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\raj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();driver.get("https://www.google.com/search?q=greens+technology+sanatorium&tbm=lcl&ei=CfttYuKWMK-QseMPmtKUuAs&oq=greens+technology+sa&gs_l=psy-ab.1.1.0i512k1l3j0i22i30k1l7.11755.13000.0.15719.3.3.0.0.0.0.248.425.0j1j1.2.0....0...1c.1.64.psy-ab..1.2.424...0i67k1.0.-VnWeJDVUnU");
driver.get("https://www.facebook.com/");
driver.get("https://www.amazon.in/");
driver.get("http://greenstech.in/selenium-course-content.html");

String url = driver.getCurrentUrl();
System.out.println(url);

String title = driver.getTitle();
System.out.println(title);

driver.quit();
}
}
