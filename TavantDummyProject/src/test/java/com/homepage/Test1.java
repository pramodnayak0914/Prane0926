package com.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public static void main() throws InterruptedException {
		
		System.out.println("Hello world");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramod.nayak\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		driver.findElement(By.id("input")).sendKeys("Manual testing");
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("paltform", "andriod");
		driver.quit();
	}

}
