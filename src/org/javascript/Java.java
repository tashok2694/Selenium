package org.javascript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Java {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver .get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement txtUsername = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','Ashok')",txtUsername );
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','9877')",txtpassword );
		
		
//		WebElement btn = driver.findElement(By.name("login"));
//		js.executeScript("arguments[0].click()", btn);
		
		Object txt = js.executeScript("return arguments[0].getAttribute('value')", txtUsername);
	String fd = txt.toString();
	System.out.println(fd);
		
		Object txt1 = js.executeScript("return arguments[0].getAttribute('value')", txtpassword);
		String dd=(String)txt1;
		System.out.println(dd);
		
//		Scroll down & up
		
		WebElement hh = driver.findElement(By.xpath("//a[text()='Help']"));
	     js.executeScript("arguments[0].scrollIntoView(true)", hh);  // Down
		Thread.sleep(3000);
	js.executeScript("arguments[0].scrollIntoView(false)", txtUsername); //Up
	}
}
