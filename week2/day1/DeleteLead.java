package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Login to Leaftaps
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	
		
		//Click the "Leads" link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click "Find leads."
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click on the "Phone" tab.
		driver.findElement(By.linkText("Phone")).click();
		
		//Enter the phone number
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
		driver.findElement(By.name("phoneNumber")).sendKeys("9876543211");
		
		//Click the "Find leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		//capture the First LeadID  of the search results
		
		String LeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("First resulting Lead ID is: "+LeadID);
		
		//click the captured LeadID button
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		//Click the delete button
		
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		
		//Click "Find leads" again
		driver.findElement(By.linkText("Find Leads")).click();
		
		
		
		//Enter the captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadID);
		
		//Click the "Find leads" button
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		Thread.sleep(3000);
		
		//Verify the presence of the message "No records to display" in the Lead List
		String Result = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		
		System.out.println(Result);
				
				//Close the browser
				driver.close();
		

	}

}
