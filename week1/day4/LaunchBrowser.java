package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//step1:Launch Browser
	
		ChromeDriver driver=new ChromeDriver();

		//Step2:Load the URL
		
		driver.get("https://www.facebook.com");
		
		//Step3:Manage the window
		
		driver.manage().window().maximize();
		
		//to find locator
		
	driver.findElement(By.id("email")).sendKeys("ddyu454va@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abcdddd");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
			
		//to close the browser
	driver.close();
		
		
	}

}



