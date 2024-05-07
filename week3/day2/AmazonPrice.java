package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrice {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys",Keys.ENTER);
		
		List<WebElement> pricelist = driver.findElements(By.className("a-price-whole"));
		
		int toysPrice=pricelist.size();
		
		System.out.println("Number of Toys listed= "+toysPrice);
		
		System.out.println("Prices of the Toys :");
		
		List<Integer> num=new ArrayList<Integer>();
		
		for (WebElement price : pricelist) {
			
			String prices=price.getText();
			
			//Remove the commas in prices
			
			String replace=prices.replace(",", "");
			
			//String to Integer
			
			int parseInt=Integer.parseInt(replace);
			
			System.out.println(parseInt);
			
			//adding integers to list
			
			num.add(parseInt);
			
			
		}
		
		System.out.println("PriceList Sorted:"+num);
		
		//Print the lowest value of toy
		
		Collections.sort(num);
		Integer minValue = num.get(0);
		
		System.out.println("Min value of toys:"+minValue );
		
		driver.close();
		
		//Print the toys prices after removing the duplicates
		
		

	}

}
