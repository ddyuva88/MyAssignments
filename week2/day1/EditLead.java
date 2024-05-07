package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Find the elements
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//Enter the attributes
		driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Dinesh");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("D");
		
		//Input Department , Description and mail

		driver.findElement(By.name("departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Verify the Edit functionality");
		driver.findElement(By.name("primaryEmail")).sendKeys("samplemail@gmail.com");
		
		//Select State/Province
		
		WebElement state=driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select stateprovince=new Select(state);
		stateprovince.selectByValue("NY");
		
		
		//submit Create lead
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Edit Lead		
		driver.findElement(By.linkText("Edit")).click();
		
		//clear the description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//Update Important Note
		driver.findElement(By.name("importantNote")).sendKeys("Updated imp.note");
		
		//click on the update button
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(3000);
		
		//print title of the page
		String title = driver.getTitle();
		
		System.out.println(title);
			
		
	
		
		driver.close();
	}

}