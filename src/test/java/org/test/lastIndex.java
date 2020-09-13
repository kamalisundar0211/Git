package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lastIndex {

	public static void main(String[] args) throws InterruptedException {
		String setProperty = System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yaazhini\\eclipse-workspace\\ExtendReport\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		Thread.sleep(6000);
		int size = rows.size() - 1;
		WebElement lastrow = rows.get(size);
		Thread.sleep(6000);
		List<WebElement> dats = lastrow.findElements(By.tagName("td"));
		int size2 = dats.size() - 1;
		WebElement lastele = dats.get(size2);

		String text = lastele.getText();

		System.out.println(text);
	}
}