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

public class CoreJava {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver .get("http://greenstech.in/selenium-course-content.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement core = driver.findElement(By.xpath("//h2[@class='mb-0']"));
		File scr = core.getScreenshotAs(OutputType.FILE);
		System.out.println(scr);
		
		Date d = new Date();
	int dest = d.getSeconds();
		File dest1 = new File("C:\\Users\\raj\\eclipse-workspace\\Selenium\\ScreenShot\\"+dest+".png");
		FileUtils.copyFile(scr, dest1);
		System.out.println("done");
		
	}
}
