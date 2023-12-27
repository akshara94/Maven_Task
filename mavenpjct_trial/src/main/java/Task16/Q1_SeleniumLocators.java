package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1_SeleniumLocators {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(5000);
	
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.google.com");
		Thread.sleep(1000);
		
		String Url = "https://www.google.com";
		driver.get(Url);
		
		String strUrl = driver.getCurrentUrl();
		System.out.println("Current Url is :" + strUrl);
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		driver.close();
		
		
		
		
		

	}

}
