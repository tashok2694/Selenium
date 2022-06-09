package org.screen;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensScreen {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver .get("http://www.greenstechnologys.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 WebElement job = driver.findElement(By.id("heading2011"));
		 js.executeScript("arguments[0].scrollIntoView('true')",job);
		 File jobscreen = job.getScreenshotAs(OutputType.FILE);
		 System.out.println(jobscreen);
		 
		 Date d=new Date();
		 int seconds = d.getSeconds();
		 File dest = new File("C:\\Users\\raj\\eclipse-workspace\\Selenium\\ScreenShot\\"+d+".png");
		 FileUtils.copyFile(jobscreen, dest);
		 System.out.println("done");
	}
}
