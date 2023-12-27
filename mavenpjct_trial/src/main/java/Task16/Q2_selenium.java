package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Q2_selenium {


		public static void main(String[] args) throws Exception {
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.demoblaze.com");
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			   if(driver.getPageSource().contains("404 Page Not Found "))
		        {

		            System.out.println(" Page not landed on correct website");
		        }
		        else{

		            System.out.println( "Page  landed on corect website");
		        }
		        
		    Thread.sleep(5000);
			driver.close();
		}
	}



	
