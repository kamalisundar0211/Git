package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	static WebDriver driver;

	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yaazhini\\eclipse-workspace\\junitsample\\Driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Before

	public void time() throws IOException, InterruptedException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Yaazhini\\eclipse-workspace\\junitsample\\ScreenShot\\output.jpeg");
		FileUtils.copyFile(src, des);
	 Thread.sleep(6000);
	}

	@Test
	public void tc1() throws InterruptedException {

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kamali");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("java");
		WebElement press = driver.findElement(By.name("login"));
		press.click();
		Thread.sleep(6000);

	}

	@After

	public void time1() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Yaazhini\\eclipse-workspace\\junitsample\\ScreenShotoutput.jpeg");
		FileUtils.copyFile(src, des);

	}

}
