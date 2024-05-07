package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class SelectOptions {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Find the elements
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		//Click on CreateLead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//Enter the attributes
		driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Dinesh");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("D");
		

		//Select the Source element
		WebElement src=driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select sr=new Select(src);
		sr.selectByIndex(5);
		
		//Select the MarketingCampaign element
		WebElement mkt=driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		Select Market=new Select(mkt);
		Market.selectByVisibleText("Automobile");
		
		//Select the Ownership element
		WebElement ownopt=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select own1 = new Select(ownopt);
		own1.selectByValue("OWN_CCORP");

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
		Thread.sleep(3000);
		
		//Print the title of the page
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//Close the browser
		
			driver.close();
		}

	}