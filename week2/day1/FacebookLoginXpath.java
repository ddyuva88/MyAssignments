package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginXpath {

	public static void main(String[] args) throws InterruptedException {
		// initialize the URL
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.facebook.com");
		
		// Element details
		WebElement User = driver.findElement(By.xpath("//input[@id='email']"));
		User.sendKeys("mavericksuk22@gmil.com");
		
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Brave@21");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(3000);
		
		String title=driver.getTitle();
		
		if (title.equalsIgnoreCase("Facebook")) {
			
			System.out.println("Login is success");
			
		} else {
			System.out.println("Login is unsuccessful");
		}
		
		driver.close();

	}

}
