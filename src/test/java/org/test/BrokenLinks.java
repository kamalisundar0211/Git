package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	public static void main(String[] args) {
		String setProperty = System.setProperty("webdriver.chrome.driver","C:\\Users\\Yaazhini\\eclipse-workspace\\ExtendReport\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		List<WebElement> tables = driver.findElements(By.tagName("tables"));
		for (WebElement table : tables) {
			String text = table.getText();
			if (text.contains("UK")) {
				List<WebElement> rows = table.findElements(By.tagName("tr"));
				for (WebElement row : rows) {
					List<WebElement> datas = row.findElements(By.tagName("td"));
					for (WebElement data : datas) {
						
						String text2 = data.getText();
						System.out.println(text2);
					}
					
				}
			}
		}
		
		
	}
	

}
