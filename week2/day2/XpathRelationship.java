package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

				public class XpathRelationship {

				public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
		
		//Find the elements
		
		//parent to child
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("demosalesmanager");
		
		//parent to child multiple connections
		driver.findElement(By.xpath("//form[@id='login']//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//form[@id='login']//input[@class='decorativeSubmit']")).click();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.close();
		
	}

}
