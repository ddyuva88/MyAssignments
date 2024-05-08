package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		
		//Load the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.switchTo().frame("iframeResult");
				
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert demo=driver.switchTo().alert();
		demo.accept();
		
		
		
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		
		driver.switchTo().defaultContent();
		
		driver.close();

		
}
	
}
