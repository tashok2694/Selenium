package org.screen;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver .get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		File scr = ss.getScreenshotAs(OutputType.FILE);
		
		File deFile = new File("C:\\Users\\raj\\eclipse-workspace\\Selenium\\ScreenShot\\SnapDeal");
		FileUtils.copyFile(scr, deFile);
	}
}
