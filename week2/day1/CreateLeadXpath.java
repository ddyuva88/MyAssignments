package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadXpath {

	

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
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
		
		//Select the Source element
		WebElement src=driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select sr=new Select(src);
		sr.selectByValue("LEAD_DIRECTMAIL");
		
		WebElement indopt=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select ind=new Select(indopt);
		ind.selectByValue("IND_AEROSPACE");
		
		
		WebElement ownopt=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select own1 = new Select(ownopt);
		own1.selectByValue("OWN_PROPRIETOR");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
	Thread.sleep(3000);
	
	String title = driver.getTitle();
	
	System.out.println(title);
		
		driver.close();
	}

}