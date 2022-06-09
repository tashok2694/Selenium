package org.navigation;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkard {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raj\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		 Actions a= new Actions(driver);
			WebElement can = driver.findElement(By.xpath("//button[text()='✕']"));
			can.click();
			
			WebElement fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
			 a.moveToElement(fashion).perform();
			
			WebElement footWear = driver.findElement(By.xpath("(//a[contains(text(),'Watches and Accessories')]"));
			a.moveToElement(footWear).perform();
			
			WebElement sportsShoes = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[2]"));
			a.moveToElement(sportsShoes).perform();
			sportsShoes.click();
			
			WebElement shoes = driver.findElement(By.xpath("(//a[@class='_2UzuFa'])[5]"));
			shoes.click();
			
			Set<String> sets = driver.getWindowHandles();
			List<String>ll = new LinkedList<>();
			ll.addAll(sets);
			driver.switchTo().window(ll.get(1));
			
			WebElement size = driver.findElement(By.xpath("(//a[@class='_1fGeJ5 _2UVyXR _31hAvz'])[4]"));
			size.click();
			
			WebElement addCard = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
			addCard.click();
			
			driver.switchTo().window(ll.get(0));
			
			Thread.sleep(3000);
			
			
			
			WebElement shoes2 = driver.findElement(By.xpath("(//a[@class='_2UzuFa'])[11]"));
			shoes2.click();
			
		   Set<String> sets1 = driver.getWindowHandles();
			List<String>ll1 = new LinkedList<>();
			ll1.addAll(sets1);
			driver.switchTo().window(ll1.get(2));
			
			WebElement size2= driver.findElement(By.xpath("(//a[@class='_1fGeJ5 _2UVyXR _31hAvz'])[4]"));
			size2.click();
			
			WebElement card2 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
			card2.click();
			
			driver.switchTo().window(ll.get(0));
			driver.navigate().to("https://www.amazon.in/");
			
			
			
			
			
			
			
	}
}
