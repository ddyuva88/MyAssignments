package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();

		//Step2:Load the URL
		
		driver.get("https://leaftaps/com/control/main");
		driver.manage().window().maximize();
		
		//returnType for findElement is WebElement
        WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
        
        user.sendKeys("Demosalesmanager");
        user.clear();
        user.sendKeys("demoCSR");
    
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
        
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
        
        driver.findElement(By.xpath("//a[contains(text(),'CRM/')]")).click();
    }
		

	}


