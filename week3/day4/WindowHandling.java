package HomeAssignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		//Initialize browser
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		//Click on the widget of the "From Contact". 
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		Set<String> fromWindow=driver.getWindowHandles();
		List<String> fromWin=new ArrayList<String>(fromWindow);
		driver.switchTo().window(fromWin.get(1));
		
		//Click on the first resulting contact
		driver.findElement(By.linkText("DemoCustomer")).click();
		
		
		driver.switchTo().window(fromWin.get(0));
		
		//Click on the widget of the "From Contact". 
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();	
		Set<String> toWindow=driver.getWindowHandles();
		List<String> toWin=new ArrayList<String>(toWindow);
		driver.switchTo().window(toWin.get(1));
		
		//Click on the next contact
		driver.findElement(By.linkText("DemoLBCust")).click();
		
		driver.switchTo().window(toWin.get(0));
		
		driver.findElement(By.className("buttonDangerous")).click();
		
		driver.switchTo().alert().accept();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String title=driver.getTitle();
		System.out.println("Title of the page "+title);
		
		driver.close();
		
		
		
		

}
}
