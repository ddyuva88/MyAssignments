package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the url
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//PromptAlert
		driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt104']//span)[2]")).click();
		Thread.sleep(3000);
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("LearnPrompt");
		promptAlert.accept();
		
		String text = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text);
		
		
		//SweetAlert
		
		driver.findElement(By.xpath("//span[text()='Delete']"));
		
		
		driver.close();
		

	}

}
