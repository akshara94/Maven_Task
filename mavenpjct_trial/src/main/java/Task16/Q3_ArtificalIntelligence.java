package Task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3_ArtificalIntelligence {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
	
		
		driver.navigate().to("https://www.wikipedia.org");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();//maximize the window
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("artificial intelligence");//search bar
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();//search button
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='ca-history']/a")).click();//search view history
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());//get the title
		Thread.sleep(5000);
		
		driver.close();
	}
	
}

		
		
		
		
		
		
	
		
		
	


