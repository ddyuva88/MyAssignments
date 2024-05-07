package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccount {
	
	public static void main(String[] args) throws InterruptedException {
		// initialize the URL
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.facebook.com");
		
		//Click on Create New Account
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		
		//input the signup parameters
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dinukutty");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Deena");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("+919198409666");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Bro@12345");
				
		
		//Handle all three dropdowns in Date of birth 
		
		WebElement Day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select birthDay=new Select(Day);
		birthDay.selectByValue("1");
		
		WebElement Month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select birthMonth=new Select(Month);
		birthMonth.selectByValue("5");
		
		WebElement Year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select birthYear=new Select(Year);
		birthYear.selectByValue("1988");
		
		//Select the radio button in Gender
		
	
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		//Click on Signup
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title=driver.getTitle();
		
		System.out.println(title);
		

		
		
		
	
		
	}
}
