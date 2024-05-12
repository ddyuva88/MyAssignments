package HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();
		
		
		//load the URL
		driver.get("http://www.pvrcinemas.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Choose city
		driver.findElement(By.xpath("(//div[@class='cities-overlay cities-active'])[6]")).click();
		
		//Click on Cinema under QuickBook
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		
		//Select theatre
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();
		
		Thread.sleep(3000);
		
		
		//Select date
		//driver.findElement(By.xpath("((//span[contains(@class,'p-dropdown-label p-inputtext')])[3]")).click();
		driver.findElement(By.xpath("//ul[@data-pc-section='list']//li[1]")).click();
		Thread.sleep(3000);
		
		//Select movie
		driver.findElement(By.xpath("//ul[@data-pc-section='list']//li[1]")).click();
		Thread.sleep(3000);
		
		//Select time
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']//span)[2]")).click();
		driver.findElement(By.xpath("//div[@class='quick-lefts ']//button[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Accept terms and conditions
		driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
		
		//Seat booking info and proceed
		driver.findElement(By.id("CL.CLUB|K:14")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String seatinfo=driver.findElement(By.xpath("//div[@class='seat-info']/p[text()='CLUB']")).getText();
		System.out.println("The seat info is:"+seatinfo);
		String seatno=driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("The seat number is: "+seatno);
		//String grandtotal=driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
		//System.out.println(grandtotal);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//Input phone number
		driver.findElement(By.xpath("(//input[@id='mobileInput'])[2]")).sendKeys("9840966659");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//button[text()='Proceed'])[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String title = driver.getTitle();
		System.out.println("The Title of the page is "+title);
		driver.close();
		

	}

}
