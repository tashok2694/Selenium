package org.screen;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.Duration;
import java.util.Scanner;

import javax.xml.crypto.Data;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver .get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	File srcFile = tk.getScreenshotAs(OutputType.FILE);
	System.out.println(srcFile);


	
}
}
