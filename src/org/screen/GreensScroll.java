package org.screen;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensScroll {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver .get("http://www.greenstechnologys.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement scr = driver.findElement(By.xpath("(//span[@class='red_text'])[6]"));
		js.executeScript("arguments[0].scrollIntoView(true)", scr);
		
		
		WebElement scr1 = driver.findElement(By.xpath("(//span[@class='red_text'])[6]"));
	js.executeScript("arguments[0].scrollIntoView(true)", scr);
		File scr2 = scr1.getScreenshotAs(OutputType.FILE);
		System.out.println(scr2);
		
		Date dd= new Date();
		int sec = dd.getSeconds();
	File destFile = new File("C:\\Users\\raj\\eclipse-workspace\\Selenium\\ScreenShot\\"+sec+".png");
	FileUtils.copyFile(scr2, destFile);
	
		
		
	}
}
