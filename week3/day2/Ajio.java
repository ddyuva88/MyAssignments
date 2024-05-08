package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch new Chrome browser
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the Ajio URL
		driver.get("https://www.ajio.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		// In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
		Thread.sleep(5000);
		
		// To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		
		// To the left of the screen under "Category" click on "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(3000);
		
		//Print the no.of items found
		String noOfItems = driver.findElement(By.xpath("//div[@class='length']//strong[1]")).getText();
		System.out.println("No.of items for the search:"+noOfItems);
		
		// Get the list of brand of the products displayed in the page and print the list
		List<WebElement> mensBagBrand = driver.findElements(By.xpath("//div[@class='brand']"));
		
		System.out.println("Men brand count displayed in the page:"+mensBagBrand.size());
		
		System.out.println("----------------------------------------------------------");
		
		for (WebElement i : mensBagBrand) {
			System.out.println(i.getText());
		}
		
		
		System.out.println("----------------------------------------------------------");
		
		// Get the list of names of the bags and print the list
		List<WebElement> mensBagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		System.out.println("Men Bag names count displayed in the page:"+mensBagNames.size());
		
		for (WebElement j : mensBagNames) {
			System.out.println(j.getText());
		}
		
		driver.close();
		
	}

}
