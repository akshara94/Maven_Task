package Task15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");

		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Selenium browser driver");// Search bar
		
		Thread.sleep(2000);  // 1second
		
		driver.findElement(By.xpath("//button[@id='Tg7LZd']")).click();//Search icon
		
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.close();
		
	}
	
	
}
